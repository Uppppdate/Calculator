package Operations;

public class AdditionOperation extends AbstractOperation {
    
    public AdditionOperation(){
        super("+", 4);
    }

    @Override
    public double toApply(double num1, double num2) {
        return num1+num2;
    }

}
