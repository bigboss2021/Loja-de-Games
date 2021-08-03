package org.generation.LojaGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity // informado que e um entidade
@Table(name = "Tb_Categoria")  //criar tabela categoriaa
public class Categoria {
     
	@Id // informando que é o id do produto- Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	private long id;  // id bigint
	
	@NotBlank 
	@Size (min= 2 , max = 250)
	private String tipo; 
	
	
	@NotBlank 
	@Size (min= 2 , max = 250)
	private String descricao;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 
	
	
}
