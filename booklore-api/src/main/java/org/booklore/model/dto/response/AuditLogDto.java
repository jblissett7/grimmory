package org.booklore.model.dto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.AuditAction;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditLogDto {
  private Long id;
  private Long userId;
  private String username;
  private AuditAction action;
  private String entityType;
  private Long entityId;
  private String description;
  private String ipAddress;
  private String countryCode;
  private LocalDateTime createdAt;
}
