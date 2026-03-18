package org.booklore.model.dto.response;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookTimelineResponse {
  private Long bookId;
  private String title;
  private Integer pageCount;
  private LocalDate firstSessionDate;
  private LocalDate lastSessionDate;
  private Integer totalSessions;
  private Long totalDurationSeconds;
  private Double maxProgress;
  private String readStatus;
}
