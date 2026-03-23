package Operations;

public abstract class AbstractOperation implements Operation{
    private String symbol;
    private int priority;

    public AbstractOperation(String symbol, int priority){
        this.symbol = symbol;
        this.priority = priority;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPriority() {
        return priority;
    }
    
    
}
