package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.MoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoodRepository extends JpaRepository<MoodEntity, Long> {

  Optional<MoodEntity> findByName(String moodName);

  Optional<MoodEntity> findByNameIgnoreCase(String moodName);
}
