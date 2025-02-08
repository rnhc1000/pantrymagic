package br.dev.ferreiras.pantry_provisioning.controllers.handlers;

import br.dev.ferreiras.pantry_provisioning.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

//  @ExceptionHandler(ResourceNotFoundException.class)
//  public ResponseEntity<ExceptionHandlerDTO> resourceNotFound(ResourceNotFoundException exception, HttpServletRequest request) {
//
//    return new ExceptionHandlerDTO(
//
//    );
//  }
}
