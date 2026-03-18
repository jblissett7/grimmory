package org.booklore.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.Instant;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesCoverBook {
  private Long bookId;
  private Instant coverUpdatedOn;
  private Float seriesNumber;
  private String primaryFileType;
}
