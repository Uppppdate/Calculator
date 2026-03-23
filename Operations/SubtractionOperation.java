package Operations;

public class SubtractionOperation extends AbstractOperation{

    public SubtractionOperation(){
        super("-", 4);
    }
    
    @Override
    public double toApply(double num1, double num2) {
        return num1-num2;
    }
    
}
