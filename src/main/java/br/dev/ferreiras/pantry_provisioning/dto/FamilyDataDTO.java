package br.dev.ferreiras.pantry_provisioning.dto;


public record FamilyDataDTO(Long id, String familyName, String contactEmail, String contactPhone,
                            Integer numberOfAdults, Integer numberOfKids, String address, String city, String state,
                            String zipCode, String location) {
}


