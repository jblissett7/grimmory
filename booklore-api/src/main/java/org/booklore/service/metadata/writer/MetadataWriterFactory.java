package org.booklore.service.metadata.writer;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.booklore.model.enums.BookFileType;
import org.springframework.stereotype.Component;

@Component
public class MetadataWriterFactory {

  private final Map<BookFileType, MetadataWriter> writers;

  public MetadataWriterFactory(List<MetadataWriter> writerList) {
    writers =
        writerList.stream()
            .collect(Collectors.toMap(MetadataWriter::getSupportedBookType, Function.identity()));
  }

  public Optional<MetadataWriter> getWriter(BookFileType bookFileType) {
    return Optional.ofNullable(writers.get(bookFileType));
  }
}
