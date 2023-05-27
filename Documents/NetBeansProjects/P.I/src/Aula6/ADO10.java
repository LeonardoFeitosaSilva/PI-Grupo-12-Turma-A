/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6;

/**
 *
 * @author user
 */
import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class ADO10 {

    public static void main(String[] args) {
        int a, palpite, c, i = 0, modulo, modulo2;
        ArrayList<Integer> lista = new ArrayList();
        for (a = 1; a <= 100; a++) {
            lista.add(a);
        }
        Collections.shuffle(lista);
        Collections.shuffle(lista);
        c = lista.get(0);
        //System.out.println("Valor escolhido: " + c);
        modulo = c - 1;
        modulo2 =c + 1;
        while (i !=5){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Adivinhe o valor escolhido pelo computador: ");
            palpite = entrada.nextInt();
            if (palpite > c) {
                if (palpite == modulo || palpite == modulo2) {
                    System.out.println("Esta quente!!!\n");
                } else {
                    System.out.println("O valor digitado eh maior que o valor escolhido\n");
                }
            } else if (palpite < c) {
                if (palpite == modulo || palpite == modulo2) {
                    System.out.println("Esta quente!!!\n");
                } else {
                    System.out.println("O valor digitado eh menor que o valor escolhido\n");
                }

            } else if (palpite == c) {
                System.out.println("*---* Parabens, voce ganhou o jogo!*---*");
                break;
            }
        i++;
        }
        if (i >=5) {
            System.out.println("Game Over!");
        }
    }
}
