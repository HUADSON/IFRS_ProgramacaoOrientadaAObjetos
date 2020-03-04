
public class Tableless{
    
    public static void main (String[] args){
        
        for(int x=0; x<1000; x++)
        {
            System.out.println("Valor: " + x);
        }
    }
    
    public static void arrayConstanteComFor (String[] args){
        int[] array = {1,2,3,4,5};
        
        for(int i : array){
            System.out.println(i);
        }
    
    }  
    
    public static void arrayConstanteComWhile (String[] args){
        int x = 15;
        
        while(x <10){
            System.out.println("Voce nao tem permissao para entrar");
            x++;
        }
    
    }
    
    public static void arrayConstanteComDoWhile (String[] args){
        int x = 10;
        
        do{
            System.out.println("Voce nao tem permissao para entrar");
            x++;
        }while(x <18);
    }
}