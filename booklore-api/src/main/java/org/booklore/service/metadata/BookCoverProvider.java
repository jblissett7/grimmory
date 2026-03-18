package org.booklore.service.metadata;

import java.util.List;
import org.booklore.model.dto.CoverImage;
import org.booklore.model.dto.request.CoverFetchRequest;

public interface BookCoverProvider {
  List<CoverImage> getCovers(CoverFetchRequest request);
}
