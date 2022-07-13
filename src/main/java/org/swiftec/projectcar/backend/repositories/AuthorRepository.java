package org.swiftec.projectcar.backend.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.swiftec.projectcar.backend.entities.AuthorEntity;

import java.util.Set;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<AuthorEntity, Long> {

    Set<AuthorEntity> findAll();

    AuthorEntity save(AuthorEntity authorEntity);

    AuthorEntity delete(AuthorEntity authorEntity);

    void deleteAll();
}
