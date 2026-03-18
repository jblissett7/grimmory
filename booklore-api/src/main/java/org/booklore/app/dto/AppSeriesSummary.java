package org.booklore.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.Instant;
import java.util.List;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppSeriesSummary {
  private String seriesName;
  private int bookCount;
  private Integer seriesTotal;
  private List<String> authors;
  private int booksRead;
  private Instant latestAddedOn;
  private List<SeriesCoverBook> coverBooks;
}
