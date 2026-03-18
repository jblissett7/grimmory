package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.BookLoreUserEntity;
import org.booklore.model.enums.ProvisioningMethod;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BookLoreUserEntity, Long> {

  Optional<BookLoreUserEntity> findByUsername(String username);

  Optional<BookLoreUserEntity> findByEmail(String email);

  Optional<BookLoreUserEntity> findById(@NonNull Long id);

  long countByProvisioningMethod(ProvisioningMethod provisioningMethod);

  Optional<BookLoreUserEntity> findByOidcIssuerAndOidcSubject(
      String oidcIssuer, String oidcSubject);
}
