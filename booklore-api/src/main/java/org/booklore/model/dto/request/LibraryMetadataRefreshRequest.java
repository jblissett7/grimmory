package org.booklore.model.dto.request;

import lombok.Data;
import org.booklore.model.enums.MetadataProvider;

@Data
public class LibraryMetadataRefreshRequest {
  private Long libraryId;
  private MetadataProvider metadataProvider;
  private boolean replaceCover;
}
