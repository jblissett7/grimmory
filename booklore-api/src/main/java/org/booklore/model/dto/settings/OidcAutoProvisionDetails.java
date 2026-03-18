package org.booklore.model.dto.settings;

import java.util.List;
import lombok.Data;

@Data
public class OidcAutoProvisionDetails {
  private boolean enableAutoProvisioning;
  private boolean allowLocalAccountLinking = true;
  private List<String> defaultPermissions;
  private List<Long> defaultLibraryIds;
}
