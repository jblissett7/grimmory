package org.booklore.model.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthcheckResponse {
  private String status;
  private String message;
  private LocalDateTime timestamp;
  private String version;
}
