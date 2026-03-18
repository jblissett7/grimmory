package org.booklore.mapper;

import java.util.List;
import org.booklore.model.entity.AuthorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

  default String toAuthorEntityName(AuthorEntity authorEntity) {
    return authorEntity != null ? authorEntity.getName() : null;
  }

  default List<String> toAuthorNamesList(List<AuthorEntity> authorEntities) {
    if (authorEntities == null || authorEntities.isEmpty()) {
      return List.of();
    }
    return authorEntities.stream().map(this::toAuthorEntityName).toList();
  }
}
