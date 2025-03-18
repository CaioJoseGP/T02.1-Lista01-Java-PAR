package Atv5_Hamming;

import java.util.Scanner;

class DistanciaHamming {
    public static void main(String args[]) {
        String[] cadeiaDNA = new String[2];
        int diferenca = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 2; i++) {
            System.out.println("Digite a " + (i + 1) + "° cadeia de DNA (C, A, G, T): ");
            cadeiaDNA[i] = scan.nextLine().toUpperCase();
        }

        scan.close();

        for(int i = 0; i < cadeiaDNA[0].length(); i++) {
            if(cadeiaDNA[0].charAt(i) != cadeiaDNA[1].charAt(i)) {
                diferenca++;
            }
        }

        System.out.println("\nDistância de Hamming: " + diferenca);
    }
}