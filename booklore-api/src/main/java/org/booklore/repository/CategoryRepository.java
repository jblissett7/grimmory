package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

  Optional<CategoryEntity> findByName(String categoryName);

  Optional<CategoryEntity> findByNameIgnoreCase(String categoryName);
}
