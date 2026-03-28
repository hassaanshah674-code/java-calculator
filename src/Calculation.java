public class Calculation {
    public double Calc(double num1 , double num2 , char operator ){
        double result = 0 ;
        if(operator== '+'){
            result = num1 + num2;
        } else if (operator=='-') {
            result = num1 - num2;
        } else if (operator=='*') {
            result = num1 * num2 ;
        } else if (operator=='/') {
            if(num2 == 0 ){
                System.out.println("Invalid, cannot dive by zero ");
            }
            result= num1/num2;
        }
        return result;
    }
}
