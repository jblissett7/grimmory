package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.EbookViewerPreferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookViewerPreferenceRepository
    extends JpaRepository<EbookViewerPreferenceEntity, Long> {

  Optional<EbookViewerPreferenceEntity> findByBookIdAndUserId(Long bookId, Long userId);
}
