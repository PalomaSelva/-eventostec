package com.paloma.event.microsservices.exceptions;

public class EventFullException extends RuntimeException {
    public EventFullException() {
        super("Evento está esgotado!");
    }
    public EventFullException(String message) {
        super(message);
    }
}
