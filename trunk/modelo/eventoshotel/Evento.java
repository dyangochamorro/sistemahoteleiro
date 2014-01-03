package eventoshotel;

import java.util.Date;

public class Evento {
	private int codigo;
	private String nomeEvento;
	private Date dataInicio;
	private Date dataFim;
	private int qtdMaxInscritos;
	
	public Evento() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public int getQtdMaxInscritos() {
		return qtdMaxInscritos;
	}

	public void setQtdMaxInscritos(int qtdMaxInscritos) {
		this.qtdMaxInscritos = qtdMaxInscritos;
	}
	
	

}
