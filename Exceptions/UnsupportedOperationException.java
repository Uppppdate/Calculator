package Exceptions;

public class UnsupportedOperationException extends Exception{
    public UnsupportedOperationException(Throwable cause){
        super(cause);
    }

    public UnsupportedOperationException(String cause){
        super(cause);
    }
}
