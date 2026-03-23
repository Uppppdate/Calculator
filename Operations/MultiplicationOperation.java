package Operations;

public class MultiplicationOperation extends AbstractOperation {
    
    public MultiplicationOperation(){
        super("/", 3);
    }

    @Override
    public double toApply(double num1, double num2) {
        return num1/num2;
    }

}
