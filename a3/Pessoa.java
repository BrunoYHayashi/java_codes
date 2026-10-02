public class Pessoa {

    // Atributos
    private String nome;
    private String ocup;
    private Endereco end;
    private Data dataNasc;

    // Construtores 1 (padrao)
    public Pessoa(){}
    public Pessoa(String nome, String ocup, Endereco end, Data dataNasc){
        this.setNome(nome);
        this.setOcup(ocup);
        this.setEnd(end);
        this.setDataNasc(dataNasc);
    }

    // Métodos
    public String getNome(){
        return this.nome;
    }

    public String getOcup(){
        return this.ocup;
    }

    public Endereco getEnd(){
        return this.end;
    }

    public Data getDataNasc(){
        return this.dataNasc;
    }    

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setOcup(String ocup){
        this.ocup = ocup;
    }
    public void setEnd(Endereco end){
        this.end = end;
    }
    public void setDataNasc(Data dataNasc){
        this.dataNasc = dataNasc;
    }

    public void imprimir(){
System.out.println("Nome: " + this.getNome());        
System.out.println("Ocupacao: " + this.getOcup());
System.out.printf("Rua: %s, %d \n", 
                    this.end.getNomeRua(), 
                    this.end.getNumero());
System.out.printf("Nascimento: %d/%d/%d", 
                    this.dataNasc.getDia(),
                    this.dataNasc.getMes(),
                    this.dataNasc.getAno());        
    }
}