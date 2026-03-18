package org.booklore.service.metadata.parser.hardcover;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class HardcoverBookDetails {

  private Integer id;
  private String title;

  @JsonProperty("cached_tags")
  private Map<String, List<HardcoverCachedTag>> cachedTags;
}
