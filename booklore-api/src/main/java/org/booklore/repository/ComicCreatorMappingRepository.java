package org.booklore.repository;

import java.util.List;
import org.booklore.model.entity.ComicCreatorMappingEntity;
import org.booklore.model.enums.ComicCreatorRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicCreatorMappingRepository
    extends JpaRepository<ComicCreatorMappingEntity, Long> {

  List<ComicCreatorMappingEntity> findByComicMetadataBookId(Long bookId);

  List<ComicCreatorMappingEntity> findByComicMetadataBookIdAndRole(
      Long bookId, ComicCreatorRole role);

  void deleteByComicMetadataBookId(Long bookId);
}
