package funcionario;
public class Funcionario {
    private String nome;
    private int idade;
    private String corHair;

    public Funcionario(String nome, int idade, String corHair){
        this.nome=nome;
        this.idade=idade;
        this.corHair=corHair;
    }

    public void trabalho(){
        System.out.println(nome + " está trabalhando na instituição.");
    } 

}
