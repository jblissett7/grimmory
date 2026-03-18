package org.booklore.model.dto.response;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.ReadStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompletionTimelineResponse {
  private Integer year;
  private Integer month;
  private Long totalBooks;
  private Map<ReadStatus, Long> statusBreakdown;
  private Long finishedBooks;
  private Double completionRate;
}
