package com.bianca.poo.bancosistema;

public class Conta {

    private int agencia, numero;
    private double saldo, limite;

    public Conta() {

    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = 50;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double saldoDisponivel() {
        return saldo + limite;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public boolean debitar(double valor) {
        if (valor <= saldoDisponivel()) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo Insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.debitar(valor)) {

            destino.creditar(valor);
            return true;
        } else {
            System.out.println("Impossível concluir transação.");
            return false;
        }
    }

    public String imprimir() {
        return "Agência: " + getAgencia() + "\nNúmero: " + getNumero() + "\nSaldo: " + getSaldo() + "\nLimite: " + getLimite() + "\nSaldo disponível: " + saldoDisponivel();
    }
}
