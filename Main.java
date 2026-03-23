import Operations.AdditionOperation;
import Operations.DivisionOperation;
import Operations.MultiplicationOperation;
import Operations.SubtractionOperation;

public class Main {
    public static void main(String[] args){
        //Classes
        StatementReader statementReader = new StatementReader();
        OperationsManager operationsManager = new OperationsManager();
        //Operations
        AdditionOperation additionOperation = new AdditionOperation();
        SubtractionOperation subtractionOperation = new SubtractionOperation();
        DivisionOperation divisionOperation = new DivisionOperation();
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
        operationsManager.addOperation(additionOperation);
        operationsManager.addOperation(multiplicationOperation);
        operationsManager.addOperation(divisionOperation);
        operationsManager.addOperation(subtractionOperation);
        //Work
        try{
        System.out.println(statementReader.readStatement());
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
