package org.booklore.config;

import java.util.Map;
import org.booklore.model.enums.AuthorMetadataSource;
import org.booklore.service.metadata.parser.AudnexusAuthorParser;
import org.booklore.service.metadata.parser.AuthorParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorParserConfig {

  @Bean
  public Map<AuthorMetadataSource, AuthorParser> authorParserMap(
      AudnexusAuthorParser audnexusAuthorParser) {
    return Map.of(AuthorMetadataSource.AUDNEXUS, audnexusAuthorParser);
  }
}
