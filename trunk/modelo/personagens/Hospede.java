package personagens;

import java.util.ArrayList;

import acoes.Estadia;

public class Hospede {
	
	private String numCartaoCredito;
	private ArrayList<Estadia> estadias;

	public Hospede() {
		
	}
	
	public String getNumCartaoCredito() {
		return numCartaoCredito;
	}

	public void setNumCartaoCredito(String numCartaoCredito) {
		this.numCartaoCredito = numCartaoCredito;
	}	

}
