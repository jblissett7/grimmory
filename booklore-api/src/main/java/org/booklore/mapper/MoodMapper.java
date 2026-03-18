package org.booklore.mapper;

import java.util.List;
import org.booklore.model.entity.MoodEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MoodMapper {

  default String toMoodName(MoodEntity moodEntity) {
    return moodEntity != null ? moodEntity.getName() : null;
  }

  default List<String> toMoodNamesList(List<MoodEntity> moodEntities) {
    if (moodEntities == null || moodEntities.isEmpty()) {
      return List.of();
    }
    return moodEntities.stream().map(this::toMoodName).toList();
  }
}
