package Atv3_MediaInfinita;

import java.util.Scanner;

class Media {
    public static void main(String[] args) {
        int valor, valorFinal = 0, maior = 0, menor = 0, i = 0;
        float media = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um valor ou -1 para finalizar: ");
            valor = scan.nextInt();

            if(valor != -1) {
                valorFinal = valorFinal + valor;
                i++;
                media = (float) valorFinal / i;

                if(i == 1) {
                    maior = valor;
                    menor = valor;

                } else if(valor > maior) {
                    maior = valor;

                } else if(valor < menor) {
                    menor = valor;
                }

            } else {
                System.out.println("\nFinalizando... \n");
            }

        } while(valor != -1);

        scan.close();

        System.out.println("Quantidade de números digitados: " + i
            + "\nMaior número: " + maior
            + "\nMenor número: " + menor);

        if(i > 0) {
            System.out.println("Média: " + media);

        } else {
            System.out.println("Média: 0");
        }
    }
}
