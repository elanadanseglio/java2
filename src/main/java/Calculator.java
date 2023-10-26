import java.util.ArrayList;

public class Calculator {
    ArrayList<String> history = new ArrayList<String>();
    int val;

    Calculator(){
        val = 0;
    }

    public Integer add(Integer num1, Integer num2){
        val = num1 + num2;
        history.add(num1 + " + " + num2 + " = " + val);
        return val;
    }

    public Integer subtract(Integer num1, Integer num2){
        val = num1 - num2;
        history.add(num1 + " - " + num2 + " = " + val);
        return val;
    }

    public Integer multiply(Integer num1, Integer num2){
        val = num1 * num2;
        history.add(num1 + " * " + num2 + " = " + val);
        return val;
    }

    public Integer divide(Integer num1, Integer num2){
        val = num1 / num2;
        history.add(num1 + " / " + num2 + " = " + val);
        return val;
    }
    
    public ArrayList<String> getHistory(){
        return history;
    }

}
