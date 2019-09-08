package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.NivelTrabalhador;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador nivel;
	private Double baseSalarial;
	
	private List <ContratoHora> contrato = new ArrayList<>();
	private Departamento departamento;
	
	public Trabalhador() {
	}
	
	public Trabalhador(String nome, NivelTrabalhador nivel, Double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public List<ContratoHora> getContrato() {
		return contrato;
	}

	public void addContrato (ContratoHora contrato) {
		this.contrato.add(contrato);
	}
	
	public void removeContrato(ContratoHora contrato) {
		this.contrato.remove(contrato);
	}
	
	public Double rendaMes(Integer mes, Integer ano) {
		double soma = baseSalarial;
		Calendar cal = Calendar.getInstance();
		
		for (ContratoHora c: contrato) {
			cal.setTime(c.getData());
			int c_mes = 1 + cal.get(Calendar.MONTH);
			int c_ano = cal.get(Calendar.YEAR);
			if (c_mes == mes && c_ano == ano) {
				soma += c.valorTotal();	
			}
		}
		
		return soma;
	}
	
}
