package ex_5_1;

import java.io.Serializable;
 
public class Aluno implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private String nome;
    private String sobrenome;
    private int idade;
 
    public Aluno(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
	       return new StringBuffer(" Nome: ").append(this.nome)
	                .append(" Sobrenome: ").append(this.sobrenome).append(" Idade: ").append(this.idade).toString();
	}
 

 
}
