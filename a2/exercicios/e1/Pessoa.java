// Implemente o seguinte programa em Java:
//  Crie uma classe Pessoa com as seguintes características:
//  Atributos: nome, idade e dia, mês e ano de nascimento.
//  Métodos:
// o ajustarDataDeNascimento(): recebe dia, mês e ano de nascimento como
// parâmetros e preenche os atributos da classe correspondentes.
// o retornarNome(): retorna o nome da pessoa.
// o retornarIdade(): retorna o valor da idade.
// o calcularIdade(): recebe a data atual em dias, mês e anos e calcula e armazena
// no atributo idade a idade atual da pessoa.
//  Faça uma classe Principal que:
// o Crie dois objetos da classe Pessoa, um representando Grace Hopper
// (nascida em 09/Dez/1906) e o outro representando Ada Lovelace (nascida
// em 10/Dez/1815).
// o Inicialize os objetos e mostre quais seriam as idades de Grace Hopper e
// Ada Lovelace caso estivessem vivas. Lembre de exibir o nome delas

public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    // Metodos 
    public void ajustarDataDeNascimento(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarNome(){
        return this.nome;
    }

    public int retornarIdade(){
        return this.idade;
    }

    public void calcularIdade(int dia, int mes, int ano){
        int idade;
        if (this.mes > mes){
            idade = ano - this.ano -1;
        }
        else if (this.mes == mes){
            if (this.dia <= dia)
                idade = ano - this.ano;
            else 
                idade = ano - this.ano -1;
        }
        else 
            idade = ano - this.ano;

        this.idade = idade;
    }
}