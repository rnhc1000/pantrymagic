package br.dev.ferreiras.pantry_provisioning.controllers.contracts;

import br.dev.ferreiras.pantry_provisioning.dto.FamilyDataDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(value = "/pantry")
public interface FamilyControllerContract {

  @GetExchange(value = "/families")
  public ResponseEntity<List<FamilyDataDTO>> getAllFamilies();

  @GetExchange(value = "/families/{id}")
  public ResponseEntity<FamilyDataDTO> getFamilyById(@PathVariable Long id);
}
