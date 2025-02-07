package br.dev.ferreiras.pantry_provisioning.controllers.contracts;

import br.dev.ferreiras.pantry_provisioning.dto.FamilyDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(value = "/pantry")
public interface FamilyControllerContract {

  @GetExchange(value = "/families")
  public ResponseEntity<Page<FamilyDTO>> getAllFamilies(Pageable pageable);
}
