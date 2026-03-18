package org.booklore.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import lombok.*;
import org.booklore.model.enums.ContentRestrictionMode;
import org.booklore.model.enums.ContentRestrictionType;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContentRestriction {
  private Long id;
  private Long userId;
  private ContentRestrictionType restrictionType;
  private ContentRestrictionMode mode;
  private String value;
  private LocalDateTime createdAt;
}
