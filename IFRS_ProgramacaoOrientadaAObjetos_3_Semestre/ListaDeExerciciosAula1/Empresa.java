/*
Crie uma classe que se chame Empresa.
Crie um vetor de 10 funcionarios
Crie um método para adicionar funcionarios
Crie um método para demitir funcionarios
Crie um método que mostra o nome do funcionário e seu salario
 */
public class Empresa
{
    private String nome;
    Funcionario[] funcionario;
    private double salario;
    
    public Empresa()
    {
        this.nome = nome;
	this.funcionario = funcionario;
	this.salario = salario;
    }

    public void adicionaFuncionariosNaEmpresa(Funcionario funcionarios)
    {
	int i;
		
	Funcionario[] f = new Funcionario[10];
	this.funcionario[f.length] = funcionarios;
		
	for(i = 0; i <= f.length; i++)
	{
	    System.out.println(f[i]);
	}

}

    public String imprimiEmpresaComFuncionarios()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Funcionario      : " + this.nome + "\n");
		sb.append("Salario         : " + this.salario + "\n");
		
		return sb.toString();
	}
}
