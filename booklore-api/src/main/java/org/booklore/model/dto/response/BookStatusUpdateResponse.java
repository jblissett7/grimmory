package org.booklore.model.dto.response;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.ReadStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookStatusUpdateResponse {
  private Long bookId;
  private ReadStatus readStatus;
  private Instant readStatusModifiedTime;
  private Instant dateFinished;
}
