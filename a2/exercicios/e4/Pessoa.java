//  Classe Pessoa:
// o Substitua os atributos dia, mês e ano por um atributo do tipo Data.
// o Remova o método ajustarDataDeNascimento().
// o Altere o método calcularIdade() para que ele funcione

public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    protected Data dataNascimento;

    // Construtor
    public Pessoa(String nome){
        this.nome = nome;
        this.dataNascimento = new Data();
    }

    // Metodos 
    public void ajustarDataDeNascimento(int dia, int mes, int ano){
        this.dataNascimento.dia = dia;
        this.dataNascimento.mes = mes;
        this.dataNascimento.ano = ano;
    }

    public String retornarNome(){
        return this.nome;
    }

    public int retornarIdade(){
        return this.idade;
    }

    public void calcularIdade(int dia, int mes, int ano){
        int idade;
        if (this.dataNascimento.mes > mes){
            idade = ano - this.dataNascimento.ano -1;
        }
        else if (this.dataNascimento.mes == mes){
            if (this.dataNascimento.dia <= dia)
                idade = ano - this.dataNascimento.ano;
            else 
                idade = ano - this.dataNascimento.ano -1;
        }
        else 
            idade = ano - this.dataNascimento.ano;

        this.idade = idade;
    }
}