package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.JwtSecretEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtSecretRepository extends JpaRepository<JwtSecretEntity, Long> {

  @Query("SELECT s.secret FROM JwtSecretEntity s ORDER BY s.createdAt DESC LIMIT 1")
  Optional<String> findLatestSecret();
}
