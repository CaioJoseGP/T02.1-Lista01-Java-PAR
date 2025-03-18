package Atv1_Resistores;

import java.util.Scanner;

public class Resistores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as cores (separe elas com '-'): ");
        String faixaCores = scan.nextLine();
        scan.close();

        faixaCores.trim();

        String[] arrayCores = faixaCores.split("-");

        String resistencia = "";

        for(int i = 0; i <= 1; i++) {
            String cor = arrayCores[i];

            switch (cor) {
                case "preto":
                    resistencia += "0";
                    break;
                    
                case "marrom":
                    resistencia += "1";
                    break;
    
                case "vermelho":
                    resistencia += "2";
                    break;
    
                case "laranja":
                    resistencia += "3";
                    break;
    
                case "amarelo":
                    resistencia += "4";
                    break;
    
                case "verde":
                    resistencia += "5";
                    break;
    
                case "azul":
                    resistencia += "6";
                    break;
    
                case "violeta":
                    resistencia += "7";
                    break;
    
                case "cinza":
                    resistencia += "8";
                    break;
    
                case "branco":
                    resistencia += "9";
                    break;
            
                default:
                    resistencia += "-";
                    System.out.println("\nNão existe essa cor!\n");
                    break;
            }
        }

        System.out.println("Resistência" + resistencia);
    }
}
