package com.eventoapp.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import org.springframework.lang.NonNull;

@Entity
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	@NotEmpty
	@NonNull
	private String nome;
	@NotEmpty
	@NonNull
	private String local;
	@NotEmpty
	@NonNull
	private String data;
	@NotEmpty
	@NonNull
	private String horario;

	@OneToMany
	private List<Convidado> convidados;

	public Evento() {
	}

	public Evento(Long codigo, String nome, String local, String data, String horario) {
		this.codigo = codigo;
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Eventos [codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", data=" + data + ", horario="
				+ horario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return codigo == other.codigo;
	}

}
