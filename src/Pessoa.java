
public class Pessoa {

	public String nome;
	public int idade;
	public String cpf;
	public char sexo;
	public String cidadeNascimento;
	public double dataNascimento;
	

	public Pessoa(String nome, int idade, double dataNascimento, String cpf, char sexo, String cidadeNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.sexo = sexo;
		this.cidadeNascimento = cidadeNascimento;
		
	

	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public double getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(double dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Nome: " + nome
				+", sexo: " + sexo
				+",idade: " + idade
				+", data de nascimento: " + dataNascimento
				+", cpf: "+ cpf
				+", cidade em nasceu: " + cidadeNascimento;
		
		
	}

}
