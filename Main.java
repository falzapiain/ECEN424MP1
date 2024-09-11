import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator mycalc = new Calculator();

        // Set name
        mycalc.setname("Group 33");
        System.out.println("Welcome to the calculator designed by " + mycalc.getname());

        // Start the calculator loop
        while (true) {
            System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");
            String operation = input.nextLine().trim();

            if (operation.equalsIgnoreCase("Q")) {
                break;
            }

            if (!operation.equalsIgnoreCase("A") && !operation.equalsIgnoreCase("S") && !operation.equalsIgnoreCase("M")) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            // Read arguments from user
            System.out.println("Enter argument 1:");
            String num1_str = input.nextLine();
            Float num1 = Float.parseFloat(num1_str);

            System.out.println("Enter argument 2:");
            String num2_str = input.nextLine();
            Float num2 = Float.parseFloat(num2_str);

            Float result;
            String result_str = "";

            // Perform the required operation
            switch (operation.toUpperCase()) {
                case "A":
                    result = mycalc.addition(num1, num2);
                    result_str = "The sum of " + num1 + " and " + num2 + " is " + result;
                    break;
                case "S":
                    result = mycalc.subtraction(num1, num2);
                    result_str = "The difference of " + num1 + " and " + num2 + " is " + result;
                    break;
                case "M":
                    result = mycalc.multiplication(num2, num2);
                    result_str = "The product of " + num1 + " and " + num2 + " is " + result;
                    break;
            }

            // Output the result
            System.out.println(result_str);
        }

        input.close();
    }
}
