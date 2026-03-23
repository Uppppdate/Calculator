import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Exceptions.LineReadingException;

public class StatementReader {
    public String readStatement() throws LineReadingException{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();
        } catch(IOException exception) {
           throw new LineReadingException(exception); 
        } 
    }
}
