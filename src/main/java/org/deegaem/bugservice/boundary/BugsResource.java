package org.deegaem.bugservice.boundary;

import org.deegaem.bugservice.domain.Bug;
import org.deegaem.bugservice.domain.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bugs")
public class BugsResource {

    @Autowired
    BugRepository bugRepository;

    @GetMapping
    public Flux<Bug> listBugs() {
        return bugRepository.findAll();
    }

    @GetMapping({"/{bugId}"})
    public Mono<Bug> getBug(@PathVariable Long bugId) {
        return bugRepository.findById(bugId);
    }

    @PostMapping
    public Mono<Bug> saveBug(@RequestBody Bug bug) {
        return bugRepository.save(bug);
    }

    @PutMapping({"/{bugId}"})
    public Mono<Bug> putBug(@PathVariable("bugId") Long bugId, @RequestBody Bug bug) {
        return bugRepository.findById(bugId).map((c) -> {
            c.setBugTitle(bug.getBugTitle());
            c.setDescription(bug.getDescription());
            c.setAssignedtoaccount(bug.getAssignedtoaccount());
            return c;
        }).flatMap(c -> bugRepository.save(c));
    }

    @DeleteMapping({"/{bugId}"})
    public Mono<Void> deletebug(@PathVariable("bugId") Long bugId) {
        return bugRepository.deleteById(bugId);
    }
}
