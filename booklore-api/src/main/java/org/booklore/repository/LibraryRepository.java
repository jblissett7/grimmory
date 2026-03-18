package org.booklore.repository;

import java.util.List;
import org.booklore.model.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository
    extends JpaRepository<LibraryEntity, Long>, JpaSpecificationExecutor<LibraryEntity> {

  List<LibraryEntity> findByIdIn(List<Long> ids);
}
