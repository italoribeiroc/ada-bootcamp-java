import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        int base = scanner.nextInt();

        drawPyramid(base);
        drawInvertedPyramid(base);

        scanner.close();
    }

    static void drawPyramid(int base) {
        int whiteSpaces;
        int currentLine = 1;

        while(currentLine <= base) {
            whiteSpaces = (base - currentLine) / 2;
            for (int j = 0; j < whiteSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= currentLine; j++) {
                System.out.print("*");
            }

            System.out.println();
            currentLine += 2;
        }
    }

    static void drawInvertedPyramid(int base) {
        int whiteSpaces;
        int currentLine = base;

        while(currentLine >= 1) {
            whiteSpaces = (base - currentLine) / 2;
            for (int j = 0; j < whiteSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= currentLine; j++) {
                System.out.print("*");
            }

            System.out.println();
            currentLine -= 2;
        }
    }
}
