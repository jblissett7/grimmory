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
public class SvgIconBatchResponse {
  private int totalRequested;
  private int successCount;
  private int failureCount;
  private List<IconSaveResult> results;

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class IconSaveResult {
    private String iconName;
    private boolean success;
    private String errorMessage;
  }
}
