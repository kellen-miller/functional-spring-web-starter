package org.swiftec.projectcar.backend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.swiftec.projectcar.backend.entities.TweetEntity;

public interface TweetRepository extends PagingAndSortingRepository<TweetEntity, Long> {
}
