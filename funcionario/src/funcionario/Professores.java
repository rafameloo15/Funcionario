package funcionario; 
public class Professores extends Funcionario {

public Professores(String nome, int idade, String corHair){
    super(nome, idade, corHair);

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int idade getidade(){
        return idade;
    }

    public void setidade(int idade){
        this.idade=idade;
    }

    public String getcorHair(){
        return corHair;
    }

    public void setcorHair(string corHair){
        this.corHair=corHair;
    }

    public void aula(){
        System.out.println(nome + " está dando aula.");
    }


}




}


