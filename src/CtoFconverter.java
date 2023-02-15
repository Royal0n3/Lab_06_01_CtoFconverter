import java.util.Scanner;

public class CtoFconverter {

    public static void main(String[] args) {
        double Celsius = 0;
        double Farenheit = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius. ");
        Celsius = in.nextDouble();
        if (Celsius < -17.7 | Celsius > 37.7)

        {
            System.out.println("Error Bad Input");
        }
        else Farenheit = (Celsius * 1.8)+32;
        System.out.println("Farenheit = "+Farenheit);
    }}

