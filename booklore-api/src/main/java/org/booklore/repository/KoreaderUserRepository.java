package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.KoreaderUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KoreaderUserRepository extends JpaRepository<KoreaderUserEntity, Long> {
  Optional<KoreaderUserEntity> findByUsername(String username);

  Optional<KoreaderUserEntity> findByBookLoreUserId(Long bookLoreUserId);
}
