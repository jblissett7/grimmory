package org.booklore.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.booklore.model.enums.OpdsSortOrder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OpdsUserV2 {
  private Long id;
  private Long userId;
  private String username;
  @JsonIgnore private String passwordHash;
  private OpdsSortOrder sortOrder;
}
