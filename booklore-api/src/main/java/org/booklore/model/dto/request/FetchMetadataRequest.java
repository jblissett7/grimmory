package org.booklore.model.dto.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.MetadataProvider;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FetchMetadataRequest {
  private Long bookId;
  private List<MetadataProvider> providers;
  private String isbn;
  private String title;
  private String author;
  private String asin;
}
