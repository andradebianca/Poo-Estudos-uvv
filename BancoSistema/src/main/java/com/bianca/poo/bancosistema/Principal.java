// Em Java, as classes são organizadas em pacotes.
// Neste projeto foi criado o pacote com.bianca.bancosistema
// Todas as classes do projeto pertencem a este pacote, facilitando a organização e o gerenciamento do código.
package com.bianca.poo.bancosistema;

// Ao criar o projeto, o NetBeans gera automaticamente a classe Principal.
// Essa classe contém o método main(), que é o ponto de partida da aplicação Java.
// Por padrão, a classe veio nomeada de "public class Principal". Por uma questão de padrão e organização, refatoraremos para o nome "Principal".
public class Principal {

    public static void main(String[] args) {

// Instanciando um objeto da classe Conta. Sintaxe geral: Tipo nomeObjeto = new Tipo(parametros).
// A palavra instância só destaca que o objeto foi criado a partir de uma classe.
    Conta c1 = new Conta();
    Conta c2 = new Conta();
    
// Operações entre as cotnas:
    c1.creditar(10); 
    c1.debitar(1);
    c1.transferir(c2, 5);
    
    
        System.out.println(c1.imprimir() + "\n" + c2.imprimir());
    }
}
