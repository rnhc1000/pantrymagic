package br.dev.ferreiras.pantry_provisioning.controllers;

import br.dev.ferreiras.pantry_provisioning.controllers.contracts.FamilyControllerContract;
import br.dev.ferreiras.pantry_provisioning.dto.FamilyDTO;
import br.dev.ferreiras.pantry_provisioning.services.FamilyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyController implements FamilyControllerContract {

  private final FamilyService familyService;

  public FamilyController(FamilyService familyService) {
    this.familyService = familyService;
  }

  public ResponseEntity<Page<FamilyDTO>> getAllFamilies(Pageable pageable) {

    return ResponseEntity.ok(familyService.getAllFamilies(pageable));
  }
}
