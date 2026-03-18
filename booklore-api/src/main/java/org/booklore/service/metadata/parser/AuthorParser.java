package org.booklore.service.metadata.parser;

import java.util.List;
import org.booklore.model.dto.AuthorSearchResult;

public interface AuthorParser {

  List<AuthorSearchResult> searchAuthors(String name, String region);

  AuthorSearchResult getAuthorByAsin(String asin, String region);

  AuthorSearchResult quickSearch(String name, String region);
}
