package com.bianca.poo.bancosistema;


public class Principal {

    public static void main(String[] args) {

    Conta c1 = new Conta(11, 202, 30);
    Conta c2 = new Conta(22, 202, 0);
    
    c2.creditar(500);
    c2.transferir(c1, 100);
    
        System.out.println(c1.imprimir() + "\n---------\n" + c2.imprimir());
    }
}
