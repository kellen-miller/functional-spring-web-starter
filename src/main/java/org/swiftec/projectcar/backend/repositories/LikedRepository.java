package org.swiftec.projectcar.backend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.swiftec.projectcar.backend.entities.LikedEntity;

public interface LikedRepository extends PagingAndSortingRepository<LikedEntity, Long> {

}
