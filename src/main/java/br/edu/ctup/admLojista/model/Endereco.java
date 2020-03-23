package br.edu.ctup.admLojista.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "rua", nullable = false)
	private String rua;
	
	@Column(name = "bairro", nullable = false)
	private String bairro;
	
	@Column(name = "numero", nullable = false)
	private String numero;

}
