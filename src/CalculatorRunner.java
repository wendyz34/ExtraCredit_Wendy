import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        //user should type in this format: x * y
        System.out.println("Enter an expression with *,/,+,-,%,or ^: ");
        String equation = scan.nextLine();
        double double1 = Double.parseDouble(equation.substring(0, equation.indexOf(" ")));
        double double2 = Double.parseDouble(equation.substring(equation.indexOf(" ") + 2));
        Calculator numbers = new Calculator(double1, double2);
        if (equation.indexOf("+") != -1) {
            System.out.println(numbers.roundedToHundredth(numbers.add()));
        } else if (equation.indexOf("-") != -1){
            System.out.println(numbers.roundedToHundredth(numbers.subtract()));
        }else if (equation.indexOf("*") != -1) {
            System.out.println(numbers.roundedToHundredth(numbers.multiply()));
        } else if (equation.indexOf("/") != -1) {
            System.out.println(numbers.roundedToHundredth(numbers.divide()));
        } else if (equation.indexOf("^") != -1) {
            System.out.println(numbers.roundedToHundredth(numbers.exponent()));
        } else {
            System.out.println(numbers.roundedToHundredth(numbers.mod()));

        }


    }
}
