import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        String originUnit;
        String destinationUnit;

        System.out.println("Informe a temperatura:");
        temperature = Double.parseDouble(scanner.nextLine());

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        originUnit = scanner.nextLine();
        if (!originUnit.equals("C") && !originUnit.equals("K") && !originUnit.equals("F")) {
            System.out.println("Entrada especificada não é válida");
            return;
        }

        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        destinationUnit = scanner.nextLine();
        if (!destinationUnit.equals("C") && !destinationUnit.equals("K") && !destinationUnit.equals("F")) {
            System.out.println("Entrada especificada não é válida");
            return;
        }

        convertTemperature(temperature, originUnit, destinationUnit);

        scanner.close();
    }

    static void convertTemperature(double temperature, String originUnit, String destinationUnit) {
        double originTemperature = temperature;
        if (originUnit.equals("C") && destinationUnit.equals("K")) {
            temperature += 273.15;
        } else if (originUnit.equals("C") && destinationUnit.equals("F")) {
            temperature = (temperature * 9 / 5) + 32;
        } else if (originUnit.equals("K") && destinationUnit.equals("C")) {
            temperature -= 273.15;
        } else if (originUnit.equals("K") && destinationUnit.equals("F")) {
            temperature = (temperature - 273.15) * 9 / 5 + 32;
        } else if (originUnit.equals("F") && destinationUnit.equals("C")) {
            temperature = (temperature - 32) * 5 / 9;
        } else if (originUnit.equals("F") && destinationUnit.equals("K")) {
            temperature = (temperature - 32) * 5 / 9 + 273.15;
        }

        System.out.printf("%.2f %s = %.2f %s", originTemperature, originUnit, temperature, destinationUnit);
    }
}
