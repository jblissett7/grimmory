package org.booklore.model.dto.komga;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KomgaPageableDto<T> {
  private List<T> content;
  private Integer number;
  private Integer size;
  private Integer numberOfElements;
  private Integer totalElements;
  private Integer totalPages;
  private Boolean first;
  private Boolean last;
  private Boolean empty;
}
