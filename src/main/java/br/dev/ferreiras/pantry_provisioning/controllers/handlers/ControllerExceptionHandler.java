package br.dev.ferreiras.pantry_provisioning.controllers.handlers;

import br.dev.ferreiras.pantry_provisioning.dto.ExceptionHandlerDTO;
import br.dev.ferreiras.pantry_provisioning.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ExceptionHandlerDTO> resourceNotFound(ResourceNotFoundException exception, HttpServletRequest request) {

    HttpStatus status = HttpStatus.NOT_FOUND;

    return ResponseEntity.status(status).body(new ExceptionHandlerDTO(
        Instant.now(),
        status.value(),
        exception.getMessage(),
        request.getRequestURI()
    ));
  }
}
