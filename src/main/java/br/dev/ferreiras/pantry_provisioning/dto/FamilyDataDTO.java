package br.dev.ferreiras.pantry_provisioning.dto;


import br.dev.ferreiras.pantry_provisioning.projections.FamilyDataProjection;
import br.dev.ferreiras.pantry_provisioning.projections.MembersProjection;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.Collection;
import java.util.List;

public record FamilyDataDTO(Long id, @NotBlank(message = "Required") String familyName,
                            @NotBlank(message = "Required") @NotBlank(message = "Required") String contactEmail,
                            @NotBlank(message = "Required") String contactPhone,
                            @NotBlank(message = "Required") @Positive(message = "Al least one adult!") Integer numberOfAdults,
                            Integer numberOfKids, @NotBlank(message = "Required") String address,
                            @NotBlank(message = "Required") String city, @NotBlank(message = "Required") String state,
                            @NotBlank(message = "Required") String zipCode, String location,
                            List<MembersProjection> people) {

}


