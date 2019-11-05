public class Calc {
    public static void main(String[] args) {
        while (true) {
            String operator = Utils.getInput("Enter Math Operation: ");
            if(operator.equals("im done")) {        // are you tired of doing this?
                break;
            }
            double num1 = Utils.getNumber("Enter 1st number: ");
            double num2 = Utils.getNumber("Enter 2nd number: ");
            double result;
            result = calculator(operator, num1, num2);
            System.out.println("1" + num1 + " " + operator + " " + num2 + " = " + result);
            result = calculator2(operator, num1, num2);
            System.out.println("2 " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

    private static double calculator2(String operator, double num1, double num2) {
        double result = 0;
        if (operator.equals("+") )
        {
            result= num1 + num2;
        }
        else if (operator.equals("-"))
        {
            result= num1 - num2;
        }
        else if (operator.equals("*"))
        {
            result= (num1 * num2);
        }
        else if (operator.equals("/"))
        {
            result= (num1 / num2);
        }

        return result;
    }
    private static double calculator(String operator, double num1, double num2) {
        double result = 0;
        if (operator.equals("+") )
        {
            result= num1 + num2;
        }
        else if (operator.equals("-"))
        {
            result= num1 - num2;
        }
        else if (operator.equals("*"))
        {
            result= (num1 * num2);
        }
        else if (operator.equals("/"))
        {
            result= (num1 / num2);
        }

        return result;
    }
}