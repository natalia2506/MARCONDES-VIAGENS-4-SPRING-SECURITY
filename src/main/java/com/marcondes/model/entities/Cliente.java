package com.marcondes.model.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "nome_social", nullable = true)
	private String nomeSocial;
	
	@Column(name = "data_nascimento", nullable = false)
	private String dataNascimento;
	
	@Column(name = "identidade", nullable = false)
	private String identidade;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "celular", nullable = false)
	private String celular;
	
	@Column(name = "endereco_completo", nullable = false)
	private String endereco;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "cep", nullable = false)
	private String cep;
	
	@Column(name = "email", nullable = false)
	private String email;
	

	public Cliente() {
		super();
	}


	public Cliente(long id, String nome, String nomeSocial, String dataNascimento, String identidade, String cpf,
			String celular, String endereco, String cidade, String estado, String cep, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.dataNascimento = dataNascimento;
		this.identidade = identidade;
		this.cpf = cpf;
		this.celular = celular;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNomeSocial() {
		return nomeSocial;
	}


	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getIdentidade() {
		return identidade;
	}


	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", nomeSocial=" + nomeSocial + ", dataNascimento="
				+ dataNascimento + ", identidade=" + identidade + ", cpf=" + cpf + ", celular=" + celular
				+ ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", email="
				+ email + "]";
	}
	
	

}
