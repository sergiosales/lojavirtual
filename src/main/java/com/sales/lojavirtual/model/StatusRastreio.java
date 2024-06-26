package com.sales.lojavirtual.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "status_rastreio")
public class StatusRastreio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String centroDistribuicao;
	
	private String  cidade;
	
	private String estado;
	
	private String  status;
	
	@ManyToOne()
	@JoinColumn(name = "venda_loja_virtual_id",nullable = false,
	foreignKey = @ForeignKey(value =ConstraintMode.CONSTRAINT,name = "venda_loja_virtualfk" ))
	private VendaLojaVirtual vendaLojaVirtual;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCentroDistribuicao() {
		return centroDistribuicao;
	}
	public void setCentroDistribuicao(String centroDistribuicao) {
		this.centroDistribuicao = centroDistribuicao;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	
	
	public VendaLojaVirtual getVendaLojaVirtual() {
		return vendaLojaVirtual;
	}
	public void setVendaLojaVirtual(VendaLojaVirtual vendaLojaVirtual) {
		this.vendaLojaVirtual = vendaLojaVirtual;
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
		StatusRastreio other = (StatusRastreio) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "StatusRastreio [id=" + id + ", centroDistribuicao=" + centroDistribuicao + ", cidade=" + cidade
				+ ", estado=" + estado + ", status=" + status + ", vendaLojaVirtual=" + vendaLojaVirtual + "]";
	}
	
	
	
	
	

}
