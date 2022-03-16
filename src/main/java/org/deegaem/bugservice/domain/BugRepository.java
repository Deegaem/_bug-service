package org.deegaem.bugservice.domain;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BugRepository extends ReactiveCrudRepository<Bug, Long> {
}
