package org.booklore.model.dto.response;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompletionRaceResponse {
  private Long bookId;
  private String bookTitle;
  private Instant sessionDate;
  private Float endProgress;
}
