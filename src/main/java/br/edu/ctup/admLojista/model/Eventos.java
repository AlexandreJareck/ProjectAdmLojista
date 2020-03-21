package br.edu.ctup.admLojista.model;

import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

public class Eventos {
	@Entity
	@Table(name = "evento")
	public class Evento {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;

		@Column(name = "descricao", nullable = false, length = 100)
		private String descricao;

		@Column(name = "dth_inicio")
		private String dthInicio;

		@Column(name = "num_pessoas_previsas")
		private int numPessoasPrevistas;

		@Column(name = "num_pessoas_confirmadas")
		private int numPessoasConfirmadas;

		@Column(name = "dth_fim")
		private String dthFim;

		@ManyToOne(cascade = CascadeType.ALL)
		private Local local;

		@ManyToOne(cascade = CascadeType.ALL)
		private Responsavel responsavel;

		@Column(name = "observacao")
		private String observacao;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getDthInicio() {
			return dthInicio;
		}

		public void setDthInicio(String dthInicio) {
			this.dthInicio = dthInicio;
		}

		public String getDthFim() {
			return dthFim;
		}

		public void setDthFim(String dthFim) {
			this.dthFim = dthFim;
		}

		public Local getLocal() {
			return local;
		}

		public void setLocal(Local local) {
			this.local = local;
		}

		public Responsavel getResponsavel() {
			return responsavel;
		}

		public void setResponsavel(Responsavel responsavel) {
			this.responsavel = responsavel;
		}

		public String getObservacao() {
			return observacao;
		}

		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}

		public int getNumPessoasPrevistas() {
			return numPessoasPrevistas;
		}

		public void setNumPessoasPrevistas(int numPessoasPrevistas) {
			this.numPessoasPrevistas = numPessoasPrevistas;
		}

		public int getNumPessoasConfirmadas() {
			return numPessoasConfirmadas;
		}

		public void setNumPessoasConfirmadas(int numPessoasConfirmadas) {
			this.numPessoasConfirmadas = numPessoasConfirmadas;
		}
	}
}
