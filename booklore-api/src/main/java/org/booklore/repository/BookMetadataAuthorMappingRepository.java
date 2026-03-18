package org.booklore.repository;

import java.util.List;
import java.util.Set;
import org.booklore.model.entity.BookMetadataAuthorKey;
import org.booklore.model.entity.BookMetadataAuthorMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMetadataAuthorMappingRepository
    extends JpaRepository<BookMetadataAuthorMapping, BookMetadataAuthorKey> {

  List<BookMetadataAuthorMapping> findAllByBookIdIn(Set<Long> bookIds);
}
