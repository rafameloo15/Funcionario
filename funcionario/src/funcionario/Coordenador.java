package funcionario;

public class Coordenador extends Funcionario {
 public Coordenador(String nome, int idade, String corHair){
    super(nome, idade, corHair);}

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int getIdade(){
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

    public void sala(){
        System.out.println(nome + " trabalha na sala 10.");
    }

    @Override
    public void trabalho(){
        System.out.println(nome + " faltou ao trabalho porque estava doente.");
    }{} 
}

