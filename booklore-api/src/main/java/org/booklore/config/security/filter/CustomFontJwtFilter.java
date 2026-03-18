package org.booklore.config.security.filter;

import jakarta.servlet.http.HttpServletRequest;
import org.booklore.config.security.JwtUtils;
import org.booklore.mapper.custom.BookLoreUserTransformer;
import org.booklore.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomFontJwtFilter extends AbstractQueryParameterJwtFilter {

  public CustomFontJwtFilter(
      JwtUtils jwtUtils,
      UserRepository userRepository,
      BookLoreUserTransformer bookLoreUserTransformer) {
    super(jwtUtils, userRepository, bookLoreUserTransformer);
  }

  @Override
  protected boolean shouldNotFilter(HttpServletRequest request) {
    String path = request.getRequestURI();
    return !(path.startsWith("/api/v1/custom-fonts/") && path.endsWith("/file"));
  }
}
