package org.booklore.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppFilterOptions {
  private List<AuthorOption> authors;
  private List<LanguageOption> languages;
  private List<String> readStatuses;
  private List<String> fileTypes;

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AuthorOption {
    private String name;
    private long count;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class LanguageOption {
    private String code;
    private String label;
    private long count;
  }
}
