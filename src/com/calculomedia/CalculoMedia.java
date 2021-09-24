package com.calculomedia;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre:");
        double nota1 = s.nextDouble();

        System.out.println("Digite a nota do segundo bimestre:");
        double nota2 = s.nextDouble();

        System.out.println("Digite a nota do terceiro bimestre:");
        double nota3 = s.nextDouble();

        System.out.println("Digite a nota do quarto bimestre:");
        double nota4 = s.nextDouble();

        int bimestres = 4;

        double media = (nota1 + nota2 + nota3 + nota4) / bimestres;

        System.out.println("A sua média de notas é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado(a)!");

        } else if (media >= 5) {
            System.out.println("Você ficou de recuperação.");

        } else {
            System.out.println("Infelizmente você foi reprovado(a).");
        }
    }
}
