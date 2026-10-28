public abstract class Modalidade {
    // Atributos
    private String nome;
    private String objetivo;
    private String regras;

    // Construtores
    public Modalidade();
    public Modalidade(String nome, String objetivo, String regras){
        this.setNome = nome;
        this.setObjetivo = objetivo;
        this.setRegras = regras;
    }

    // Métodos
    public abstract String getNome(){
        return this.nome;
    }    
    public abstract String getObjetivo(){
        return this.objetivo;
    }
    public abstract String getRegras(){
        return this.regras;
    }    

    public abstract void setNome(String nome){
        this.nome = nome; 
    } 
    public abstract void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    } 
    public abstract void setRegras(String regras){
        this.regras = regras;
    }     
}