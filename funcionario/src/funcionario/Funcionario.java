package funcionario;
public class Funcionario {
    protected String nome;
    protected int idade;
    protected String corHair;

    public Funcionario(String nome, int idade, String corHair){
        this.nome=nome;
        this.idade=idade;
        this.corHair=corHair;
    }

    public void trabalho(){
        System.out.println(nome + " está trabalhando na instituição.");
    } 

}
