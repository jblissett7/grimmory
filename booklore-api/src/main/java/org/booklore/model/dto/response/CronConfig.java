package org.booklore.model.dto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.TaskType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CronConfig {
  private Long id;
  private TaskType taskType;
  private String cronExpression;
  private Boolean enabled;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
