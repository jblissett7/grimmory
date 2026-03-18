package org.booklore.model.dto.response;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReadingStreakResponse {
  private int currentStreak;
  private int longestStreak;
  private int totalReadingDays;
  private List<ReadingStreakDay> last52Weeks;

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ReadingStreakDay {
    private LocalDate date;
    private boolean active;
  }
}
