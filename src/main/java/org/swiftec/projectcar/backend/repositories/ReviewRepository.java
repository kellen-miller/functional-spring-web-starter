package org.swiftec.projectcar.backend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.swiftec.projectcar.backend.entities.ReviewEntity;

import java.util.Set;

@Repository
public interface ReviewRepository extends PagingAndSortingRepository<ReviewEntity, Long> {

    Set<ReviewEntity> findAll();

    ReviewEntity save(ReviewEntity reviewEntity);

    ReviewEntity delete(ReviewEntity reviewEntity);

    void deleteAll();
}