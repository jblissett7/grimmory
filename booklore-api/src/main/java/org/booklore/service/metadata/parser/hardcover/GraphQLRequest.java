package org.booklore.service.metadata.parser.hardcover;

import java.util.Map;
import lombok.Data;

@Data
public class GraphQLRequest {
  private String query;
  private String operationName;
  private Map<String, Object> variables;
}
