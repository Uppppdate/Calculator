package Operations;

public class DivisionOperation extends AbstractOperation {
    
    public DivisionOperation(){
        super("/", 3);
    }

    @Override
    public double toApply(double num1, double num2) {
        return num1/num2;
    }

}
