package may22.excecoes;

public class IdadeInvalidaException extends Exception {

    public IdadeInvalidaException(String message) {
        super(message);
    }

    public IdadeInvalidaException(){
        super("Idade Inválida");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

