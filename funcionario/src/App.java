import funcionario.Coordenador;
import funcionario.Professores;
import funcionario.Servidor; 
;
public class App {
    public static void main(String[] args) throws Exception {
   
    Coordenador robson = new Coordenador("Carlos", 18 , "rosa");    
    
    robson.sala();
    robson.trabalho();
    
    

    Professores jujudopix = new Professores("Zezinha", 19 , "azul");

    jujudopix.idade();
    jujudopix.trabalho();

    Servidor mygod = new Servidor("JackJack", 20 , "VERDE");

    mygod.cabelo();
    mygod.trabalho();

}
}

