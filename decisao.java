﻿import java.util.*;
import java.lang.Math;

public class JavaApplication
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        String nome;
        double nota1, nota2, nota3, nota4, media;
        
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite suas notas: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Seu nome é: " + nome + ". " + "Sua média é: " + media + ".");
        if (media >= 7)
        {
            System.out.println("Parabéns, " + nome + ", você foi aprovado!");
        }
        else
        {
            System.out.println("Infelizmente, " + nome + ", você foi reprovado!");
        }
    }
}
