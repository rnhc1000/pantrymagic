package br.dev.ferreiras.pantry_provisioning.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {


  public AuditorAwareImpl() {
  }



  /**
   * @return
   */
  @Override
  @NonNull
  public Optional<String> getCurrentAuditor() {
    return Optional.of(null);
  }
}