package org.booklore.model.dto.request;

import java.util.Set;
import lombok.Data;
import org.booklore.model.enums.MetadataProvider;

@Data
public class BooksMetadataRefreshRequest {
  private Set<Long> bookIds;
  private MetadataProvider metadataProvider;
  private boolean replaceCover;
}
