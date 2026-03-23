import java.util.HashMap;
import Exceptions.UnsupportedOperationException;
import Operations.AbstractOperation;
import Operations.Operation;

public class OperationsManager {
    private HashMap<String, Operation> operationsHashMap;

    public OperationsManager(){
        operationsHashMap = new HashMap<>();
    }

    public Operation getOperationBySymbol(String symbol) throws UnsupportedOperationException{
        Operation operation;
        operation = operationsHashMap.get(symbol);
        if (operation == null){
            throw new UnsupportedOperationException(String.format("Operation \'%symbol\' is unsupported", symbol));
        } else {
            return operation;
        }
    }

    public void addOperation(AbstractOperation operation){
        operationsHashMap.put(operation.getSymbol(), operation);
    }

}
