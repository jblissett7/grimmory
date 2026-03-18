package org.booklore.model.dto.kobo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KoboTestResponse {

  @JsonProperty("Result")
  private String result;

  @JsonProperty("TestKey")
  private String testKey;

  @JsonProperty("Tests")
  private Map<String, Object> tests;
}
