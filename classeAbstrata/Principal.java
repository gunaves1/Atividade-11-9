package classeAbstrata;

public class Principal {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro ("00000","F1","Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("--------------------------");
		
		Onibus marcopolo = new Onibus("11111","XB1","Prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("--------------------------");
		
		Carro fusca = new Carro ("33333","VW","Azul",2002);
		fusca.ligar();
		fusca.acelerar();
		fusca.virar();
		fusca.frear();
		
		System.out.println("--------------------------");
		
		Moto honda = new Moto ("44444","CG","Verde",2012);
		honda.ligar();
		honda.acelerar();
		honda.virar();
		honda.frear();
	}

}
