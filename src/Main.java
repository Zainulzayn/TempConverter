import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter temperature: ");
                double temperature = scanner.nextDouble();


                System.out.print("Convert from (Celsius/Fahrenheit/Kelvin): ");
                String fromScale = scanner.next();

                System.out.print("Convert to (Celsius/Fahrenheit/Kelvin): ");
                String toScale = scanner.next();


                double convertedTemperature = convertTemperature(temperature, fromScale, toScale);


                if (convertedTemperature != Double.NaN) {
                    System.out.printf("%.2f %s is %.2f %s%n", temperature, fromScale, convertedTemperature, toScale);
                } else {
                    System.out.println("Invalid conversion. Please check the scales.");
                }


                scanner.close();
            }


            public static double convertTemperature(double value, String fromScale, String toScale) {

                fromScale = fromScale.toLowerCase();
                toScale = toScale.toLowerCase();


                if (fromScale.equals("celsius")) {
                    if (toScale.equals("fahrenheit")) {
                        return (value * 9/5) + 32;
                    } else if (toScale.equals("kelvin")) {
                        return value + 273.15;
                    }
                } else if (fromScale.equals("fahrenheit")) {
                    if (toScale.equals("celsius")) {
                        return (value - 32) * 5/9;
                    } else if (toScale.equals("kelvin")) {
                        return (value - 32) * 5/9 + 273.15;
                    }
                } else if (fromScale.equals("kelvin")) {
                    if (toScale.equals("celsius")) {
                        return value - 273.15; // Kelvin to Celsius
                    } else if (toScale.equals("fahrenheit")) {
                        return (value - 273.15) * 9/5 + 32; // Kelvin to Fahrenheit
                    }
                }


                return Double.NaN;
            }
        }
