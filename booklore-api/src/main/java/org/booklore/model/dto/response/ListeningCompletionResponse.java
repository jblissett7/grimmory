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
public class ListeningCompletionResponse {
  private Integer totalAudiobooks;
  private Integer completed;
  private Integer inProgressCount;
  private List<AudiobookCompletionEntry> inProgress;

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AudiobookCompletionEntry {
    private Long bookId;
    private String title;
    private Double progressPercent;
    private Long totalDurationSeconds;
    private Long listenedDurationSeconds;
  }
}
