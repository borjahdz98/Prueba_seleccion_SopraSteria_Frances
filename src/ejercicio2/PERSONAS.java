package ejercicio2;

public class PERSONAS {
	
	protected String SEXO;
	protected int EDAD;
	
	public PERSONAS(boolean sEXO, int eDAD) {
		this.setSEXO(sEXO);
		EDAD = eDAD;
	}
	
	public String getSEXO() {
		return SEXO;
	}
	public void setSEXO(boolean SEXO) {
		if(SEXO) this.SEXO = "Masculino";
		else this.SEXO="Femenino";
	}
	public int getEDAD() {
		return EDAD;
	}
	public void setEDAD(int eDAD) {
		EDAD = eDAD;
	}
	
}
