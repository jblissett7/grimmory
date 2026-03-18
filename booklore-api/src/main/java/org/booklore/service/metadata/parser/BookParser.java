package org.booklore.service.metadata.parser;

import java.util.List;
import org.booklore.model.dto.Book;
import org.booklore.model.dto.BookMetadata;
import org.booklore.model.dto.request.FetchMetadataRequest;

public interface BookParser {

  List<BookMetadata> fetchMetadata(Book book, FetchMetadataRequest fetchMetadataRequest);

  BookMetadata fetchTopMetadata(Book book, FetchMetadataRequest fetchMetadataRequest);
}
