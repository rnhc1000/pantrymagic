package br.dev.ferreiras.pantry_provisioning.services;

import br.dev.ferreiras.pantry_provisioning.entities.Family;
import br.dev.ferreiras.pantry_provisioning.dto.FamilyDTO;
import br.dev.ferreiras.pantry_provisioning.repositories.FamilyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

  private final FamilyRepository familyRepository;

  public FamilyService(FamilyRepository familyRepository) {
    this.familyRepository = familyRepository;
  }

  public Page<FamilyDTO> getAllFamilies(Pageable pageable) {

    Page<Family> families = familyRepository.findAll(pageable);

    return families.map(this::entityToDTO);
  }

  private FamilyDTO entityToDTO(Family family) {

    return new FamilyDTO(
        family.getFamilyName(),
        family.getContactEmail(),
        family.getContactPhone(),
        family.getNumberOfAdults(),
        family.getNumberOfKids()
    );

  }
}
