package br.com.alura.comportamental.command;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID  = 1L;

    public DomainException(String message) {
        super(message);
    }
}
