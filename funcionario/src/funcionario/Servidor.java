package funcionario;

public class Servidor extends Funcionario {

public Servidor(String nome, int idade, String corHair){
    super(nome, idade, corHair);{}}

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int  getIdade(){
        return idade;
    }

    public void setidade(int idade){
        this.idade=idade;
    }

    public String getcorHair(){
        return corHair;
    }

    public void setcorHair(String corHair){
        this.corHair=corHair;
    }

    public void cabelo(){
        System.out.println(nome + " tem o cabelo da cor: " + corHair);
    }

    @Override
    public void trabalho(){
        System.out.println(nome + " está trabalhando com muita alegria.");
    }{ 
}




}


