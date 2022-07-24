package com.mballem.demoajax.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name= "tabela_usuario")
public class Usuario extends AbstractEntity<Long>{

	@NotBlank(message = "Informe um nome.")
	@Size(min=3,max= 60,message = "O nome do usuario deve ter entre {min} e {max} caracteres.")
	@Column(name="nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@NotBlank(message = "Informe um sobrenome.")
	@Size(min=3,max= 60,message = "O sobrenome do usuario deve ter entre {min} e {max} caracteres.")
	@Column(name="sobrenome", nullable = false, unique = true, length = 60)
	private String sobrenome;
	
	@NotBlank(message = "Informe um email.")
	@Size(min=5,max= 60,message = "O email do usuario deve ter entre {min} e {max} caracteres.")
	@Column(name="email", nullable = false, unique = true, length = 60)
	private String email;
	
	@NotBlank(message = "Informe um cpf.")
	@Column(name="cpf", nullable = false, unique = true, length = 60)
	private String cpf;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
