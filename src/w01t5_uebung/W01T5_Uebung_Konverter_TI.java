package w01t5_uebung;

import java.util.Scanner;

public class W01T5_Uebung_Konverter_TI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte eine positive Ganzzahl ein: ");
        int number = sc.nextInt();

        printInBinary(number);
        printInHex(number);

    }

    private static void printInBinary(int number) {
        int temp = number;
        String binaryNumber = "";

        while (number > 0) {
            int currentBinary = number % 2;
            if (currentBinary == 1) {
                binaryNumber = '1' + binaryNumber;
            } else { //binary is 0
                binaryNumber = '0' + binaryNumber;
            }
            number /= 2;
        }

        System.out.printf("Number %d in binary format: %s%n", temp, binaryNumber);
    }

    private static void printInHex(int number) {
        int temp = number;
        String hexNumber = "";

        while (number > 0) {
            int currentHex = number % 16;
            if (currentHex == 0) {
                hexNumber = '0' + hexNumber;
            } else if (currentHex == 1) { //binary is 0
                hexNumber = '1' + hexNumber;
            } else if (currentHex == 2) {
                hexNumber = '2' + hexNumber;
            } else if (currentHex == 3) {
                hexNumber = '3' + hexNumber;
            } else if (currentHex == 4) {
                hexNumber = '4' + hexNumber;
            } else if (currentHex == 5) {
                hexNumber = '5' + hexNumber;
            } else if (currentHex == 6) {
                hexNumber = '6' + hexNumber;
            } else if (currentHex == 7) {
                hexNumber = '7' + hexNumber;
            } else if (currentHex == 8) {
                hexNumber = '8' + hexNumber;
            } else if (currentHex == 9) {
                hexNumber = '9' + hexNumber;
            } else if (currentHex == 10) {
                hexNumber = 'A' + hexNumber;
            } else if (currentHex == 11) {
                hexNumber = 'B' + hexNumber;
            } else if (currentHex == 12) {
                hexNumber = 'C' + hexNumber;
            } else if (currentHex == 13) {
                hexNumber = 'D' + hexNumber;
            } else if (currentHex == 14) {
                hexNumber = 'E' + hexNumber;
            } else if (currentHex == 15) {
                hexNumber = 'F' + hexNumber;
            }
            
            number /= 16;
        }

        System.out.printf("Number %d in Hex format: %s%n", temp, hexNumber);
    }
}
