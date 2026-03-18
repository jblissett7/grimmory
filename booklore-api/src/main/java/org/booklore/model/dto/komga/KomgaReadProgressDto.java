package org.booklore.model.dto.komga;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KomgaReadProgressDto {
  private Integer page;
  private Boolean completed;
  private Instant readDate;
  private Instant created;
  private Instant lastModified;
}
