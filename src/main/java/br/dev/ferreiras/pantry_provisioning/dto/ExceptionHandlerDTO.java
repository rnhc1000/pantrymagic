package br.dev.ferreiras.pantry_provisioning.dto;

import java.time.Instant;

public record ExceptionHandlerDTO(Instant timestamp, int status, String error, String path) {
}
