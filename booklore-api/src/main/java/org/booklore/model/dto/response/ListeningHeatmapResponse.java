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
public class ListeningHeatmapResponse {
  private LocalDate date;
  private Long sessions;
  private Long durationMinutes;
}
