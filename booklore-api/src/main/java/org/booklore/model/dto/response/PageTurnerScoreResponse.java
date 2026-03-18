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
public class PageTurnerScoreResponse {
  private Long bookId;
  private String bookTitle;
  private List<String> categories;
  private Integer pageCount;
  private Integer personalRating;
  private Integer gripScore;
  private Long totalSessions;
  private Double avgSessionDurationSeconds;
  private Double sessionAcceleration;
  private Double gapReduction;
  private Boolean finishBurst;
}
