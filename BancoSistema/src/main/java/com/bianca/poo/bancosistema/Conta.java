package com.bianca.poo.bancosistema;


public class Conta {
    private double saldo;
    
// Construtor vazio declarado explicitamente por boa prática, evidenciando que a classe pode ser instanciada sem parâmetros.
    public Conta(){
        saldo = 10; //Todas as instâncias serão iniciadas com saldo=10.
    }
    
    public void creditar(double valor){ 
    saldo = saldo + valor;
    }
        
    public void debitar(double valor){
        saldo = saldo - valor;
    }

    public void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }

// Como o atributo saldo é privado, é preciso criar um método público para permitir o acesso a essa informação por outras classes.
    public String imprimir (){
        return "Saldo: " + saldo;
    }
}
