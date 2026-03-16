package com.bianca.poo.bancosistema;
import javax.swing.JOptionPane;
// Biblioteca de telas gráficas. Tendo duas mensagerias: apresentação e capturação de digitação de usuários.


public class Principal {
    public static void main(String[] args) {

        Conta[] conta = new Conta[3];
// Cria um vetor (array) chamado conta com 3 posições para armazenar objetos da classe Conta.

        for (int x = 1; x < 4; x++) // Estrutura de repetição que executa 3 vezes para cadastrar as contas.
        // A variável x controla o número da conta que está sendo cadastrada.
        {
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Agência da conta (" + x + "): "));
// Exibe uma caixa de diálogo pedindo a agência da conta.
// JOptionPane.showInputDialog retorna uma String, então usamos Integer.parseInt para converter o valor digitado para inteiro.
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta (" + x + "): "));
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial " + x + "): "));

            conta[x] = new Conta(agencia, numero, saldo);
// Cria um novo objeto da classe Conta usando o construtor e armazena esse objeto na posição x do vetor conta.

            JOptionPane.showMessageDialog(null, conta[x].imprimir());
// Exibe uma mensagem na tela mostrando as informações da conta

        }

 }
}
