package org.booklore.model.dto.response.audnexus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AudnexusAuthorResponse {

  private String asin;
  private String name;
  private String description;

  @JsonProperty("image")
  private String imageUrl;

  private String region;
  private List<Genre> genres;
  private List<SimilarAuthor> similar;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Genre {
    private String asin;
    private String name;
    private String type;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class SimilarAuthor {
    private String asin;
    private String name;
  }
}
