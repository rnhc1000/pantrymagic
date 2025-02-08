package br.dev.ferreiras.pantry_provisioning.dto;

public record FamilyDTO(
    Long id, String familyName, String email, String phone,
    Integer adults, Integer kids, String address,
    String city, String state, String zipCode, String location) {
}
