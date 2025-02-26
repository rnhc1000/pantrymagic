package br.dev.ferreiras.pantry_provisioning.projections;

import java.time.LocalDate;

public interface MembersProjection {

    String getFirstName();

    String getLastName();

    LocalDate getDob();

    String getEmail();

    Integer getCalories();
}
