package com.bianca.poo.bancosistema;


public class Conta {
    private int agencia, numero;
    private double saldo, limite;
    
    
    public Conta(){
     
    }

// Construtor que recebe os parâmetros para inicializar os atributos da conta.
    public Conta(int agencia, int numero, double saldo) {
// O "this" indica que estamos nos referindo ao atributo da classe, diferenciando-o do parâmetro do construtor.
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = 50; 
 // Toda conta criada terá um limite extra de 50 reais além do valor na conta inalteravel.
// atributo da classe (this.agencia) = valor recebido no parâmetro (agencia)
    }

// ------------ Get's e Set's >
// Os getters(pegar) servem para ler o valor de um atributo privado.
// Os setters(atribuir) servem para alterar o valor de um atributo de forma controlada.
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
// Não será criado o setSaldo, porque o saldo deve mudar apenas pelos métodos do banco, como: transferir, debitar e creditar.
    public double getSaldo() {
        return saldo;
    }

// Não será criado o setLimite, porque o limite será definido de forma padrão pelo banco para todas as contas.
    public double getLimite() {
        return limite;
    }
    
    


// ------------ Métodos >
    public double saldoDisponivel(){
        return saldo + limite;
    }
   
    public void creditar(double valor){ 
    saldo += valor;
    }
        
    public boolean debitar(double valor){
        if(valor <= saldoDisponivel()){
            saldo -= valor;
            return true;
        } else{
            System.out.println("Saldo Insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor){
// Checagem para saber se há saldo disponpivel na conta para fazer a transferência.
        if (debitar(valor) == true){
            destino.creditar(valor);
            return true;
        } else{
            System.out.println("Impossível concluir transação.");
            return false;
        }
    }
    
    public String imprimir (){
        return "Agência: " + getAgencia() + "\nNúmero: " + getNumero() + "\nSaldo: " + getSaldo() + "\nLimite: " + getLimite() + "\nSaldo disponível: " + saldoDisponivel();
    }
}
