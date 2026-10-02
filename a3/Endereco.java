public class Endereco{
    
    // Atributos
    private String nomeRua;
    private int numero;

    // Construtor
    public Endereco(){}
    public Endereco(String nomeRua, int numero){
        this.setNomeRua(nomeRua);
        this.setNumero(numero);
    }

    // Métodos

    public String getNomeRua(){
        return this.nomeRua;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNomeRua(String nomeRua){
        this.nomeRua = nomeRua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
}