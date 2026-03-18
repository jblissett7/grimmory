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
public class ReadingSpeedResponse {
  private LocalDate date;
  private Double avgProgressPerMinute;
  private Integer totalSessions;
}
