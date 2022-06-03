import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2)");

        int result = Integer.parseInt(reader.readLine());
        if (result == 1) {

            System.out.println("You have chosen FAHRENHEIT to CELSIUS!");
            System.out.println("Enter Fahrenheit Value:");

            double value = Integer.parseInt(reader.readLine());
            double valueFinal = (value - 32) * 5 / 9;
            System.out.print("Celsius is:");

            System.out.println(Math.round(valueFinal * 10.0) / 10.0);

        } else if (result == 2) {

            System.out.println("You have chosen CELSIUS to FAHRENHEIT!");
            System.out.println("Enter Celsius value:");

            double value2 = Integer.parseInt(reader.readLine());
            double finalResult = value2 * 1.8 + 32;

            System.out.print("Fahrenheit is:");
            System.out.println(Math.round(finalResult * 10.0) / 10.0);

        } else {

            System.out.println("----");
        }

    }
}

