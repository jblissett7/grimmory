package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.BookFileType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadingSessionRequest {
  @NotNull private Long bookId;

  private BookFileType bookType;

  @NotNull private Instant startTime;

  @NotNull private Instant endTime;

  @NotNull private Integer durationSeconds;

  private String durationFormatted;

  private Float startProgress;

  private Float endProgress;

  private Float progressDelta;

  private String startLocation;

  private String endLocation;
}
