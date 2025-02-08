package br.dev.ferreiras.pantry_provisioning.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException{
  public ResourceNotFoundException(String message) {
    super(message);
  }
}
