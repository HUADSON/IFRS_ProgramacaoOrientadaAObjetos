
public class Pessoa
{
   private String nome;
   private int idade;
   
   public Pessoa(String nome, int idade)
   {
       this.nome = nome;
       this.idade = idade;
    }
    
   public void fazAniversario(){
       idade = idade +1;
   }
   
   public void exibeDado(){
       System.out.println(nome + " Seja bem vindo ao Java, atraves do Bluej");
       System.out.println("Voce tem "+ idade +" anos");
       this.idade = idade;
   }

}