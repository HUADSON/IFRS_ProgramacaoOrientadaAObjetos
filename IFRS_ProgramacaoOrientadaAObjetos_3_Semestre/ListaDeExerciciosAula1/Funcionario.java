/*
2.Utilizando o blueJ crie uma classe funcionário que possua:
os atributos: nome, valorHora e horasTrabalhadas
crie métodos que alterem esses valores
Crie um método que calcule o valor do salario de acordo com os dados de cada funcionario
 */

public class Funcionario
{
   private String nome;
   private double valorHora = 2.20;
   private int horasTrabalhadas = 10;
   private double salario;
   
   public Funcionario()
   {
       this.nome = nome;
       this.horasTrabalhadas = horasTrabalhadas;
   }
   
   public void calculaValorSalario(){
       salario = valorHora * horasTrabalhadas;
   }
   
}
