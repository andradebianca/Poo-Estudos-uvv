package com.bianca.poo.bancosistema;
import java.util.Scanner;
// Importa a classe Scanner do pacote java.util para leitura de dados do usuário.
// Java.util.* -> Ao colocar o asterisco, diz que se pode utilizar tudo que esteja no pacote util.
// Indicado quando se utilizará várias classes de um mesmo pacote.
// Mas por que não colocar * em tudo? Vai afetar diretamente o desempenho, pois ao importar muitas coisas terá problemas com eficiência.

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Conta 1: Agência: ");
        int agencia = teclado.nextInt();
        //O next é utilizado para leitura de teclado. Caso eu quisesse receber uma variável de outro tipo, escreveria nextDouble, nextFloat, ...
        System.out.println("conta 1: Nº da Conta: ");
        int numero = teclado.nextInt();
        System.out.println("Conta 1: Saldo Inicial: ");
        double saldo = teclado.nextDouble();
        
        Conta c1 = new Conta(agencia, numero, saldo);
        
        System.out.println(c1.imprimir());
}       
    }
