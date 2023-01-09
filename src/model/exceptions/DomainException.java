package model.exceptions;

public class DomainException extends Exception {

    // Jeito (BOM) de resolver
    // Usando tratamento de exceções

    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }

}
