package com.eventoapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;


@Entity
public class Convidado {

	@Id
	@NotEmpty 
	@NonNull 
	private String nomeConvidado;
	@NotEmpty 
	@NonNull 
	private String cpf;
	
	@ManyToOne
	private Evento evento;
	
	public Convidado() {
	}
	
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
}
