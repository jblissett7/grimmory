package org.booklore.service.metadata;

import java.util.Collection;
import org.booklore.model.dto.BookMetadata;

@FunctionalInterface
interface FieldValueExtractorList {
  Collection<String> extract(BookMetadata metadata);
}
