import java.util.*;

public class Calculator {

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        History history= new History();


        System.out.println("---Simple Calculator---");
        System.out.println("Enter your Problem");
        System.out.println("Enter 'enter' to stop");
        System.out.println("Enter 'history' to see your history ");
        System.out.println("Enter 'clear' to clear your history");

        while(true)
        {
            String input ;
            System.out.print("Enter here: ");
            input = sc.nextLine().replace(" ","");
            if(input.equalsIgnoreCase("exit"))
            {
                System.out.println("Calculator closed!");
                break;
            }
            if (input.equalsIgnoreCase("history")){
                history.show();
                continue;
            }
            if( input.equalsIgnoreCase("clear")){
                history.clear();
                continue;
            }

            int operatorIndex = -1;
            char operator = ' ';
            for( int i = 0 ; i < input.length(); i++)
            {
                char c = input.charAt(i);
                if( c=='+'||c=='-'||c=='*'||c=='/')
                {
                    operatorIndex = i;
                    operator = c;
                    break;
                }
            }
            if ( operatorIndex == -1)
            {
                System.out.println("Invalid Input");
                continue;
            }
            try{
                double result = 0;
                double num1 = Double.parseDouble(input.substring(0, operatorIndex));
                double num2 = Double.parseDouble(input.substring(operatorIndex + 1));
                Calculation calculation = new Calculation();
                result = calculation.Calc(num1, num2, operator);
                System.out.println("Result" + result);



            }
            catch (Exception e)
            {
                System.out.println("Invalid input. Please enter like 12+3");
            }
        }

    }
}

