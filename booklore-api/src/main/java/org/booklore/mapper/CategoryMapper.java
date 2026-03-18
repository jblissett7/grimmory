package org.booklore.mapper;

import java.util.List;
import org.booklore.model.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

  default String toCategoryName(CategoryEntity categoryEntity) {
    return categoryEntity != null ? categoryEntity.getName() : null;
  }

  default List<String> toCategoryNamesList(List<CategoryEntity> categoryEntities) {
    if (categoryEntities == null || categoryEntities.isEmpty()) {
      return List.of();
    }
    return categoryEntities.stream().map(this::toCategoryName).toList();
  }
}
