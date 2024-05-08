package ejercicio02;

public class Hora {

	int hora;

	int minuto;
	
	int segundos;

	public Hora() {

	}

	public Hora(int hora, int minuto,int segundos)throws NegativeHourException,NegativeMinuteException,NegativeSecondException {
		super();
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}else if(hora<0) {
			throw new NegativeHourException();
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}else if(minuto<0){
			throw new NegativeMinuteException();
		}
		if(segundos >=0 && segundos <=59) {
			this.segundos = segundos;
		}else if(segundos<0){
			throw new NegativeSecondException();
		}
	}
	
	public boolean setSegundos(int valor)throws NegativeSecondException {
		boolean funciona=false;
		
		if(valor>=0 && valor <=59) {
			this.segundos = valor;
		}else if(valor<0) {
			throw new NegativeSecondException();
		}
		
		return funciona;
		
	}

	public void inc() {
		this.minuto ++;

		if (minuto >= 60) {
			minuto = 0;
			hora++;
		}
	}

	public boolean setMinutos(int valor)throws NegativeMinuteException {
		boolean funciona = false;

		if (valor >= 0 && valor <= 59) {
			this.minuto = valor;
			funciona =true;
		}else if(valor<0) {
			throw new NegativeMinuteException();
		}

		return funciona;

	}

	public boolean setHoras(int valor) throws NegativeHourException {
		boolean funciona = false;

		if (valor >= 0 && valor <= 23) {
			this.hora = valor;
			funciona =true;
		}else if(valor<0) {
			throw new NegativeHourException();
		}
		return funciona;
	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += this.hora + ":" + this.minuto;

		return cadena;
	}

}
