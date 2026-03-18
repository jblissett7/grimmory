package org.booklore.model.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EpubManifestItem {
  private String id;
  private String href;
  private String mediaType;
  private List<String> properties;
  private long size;
}
