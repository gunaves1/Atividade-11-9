package classeAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("Geferson","Macho","Lobo-guará");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("--------------------------");
		
		Leao leao = new Leao("Mufasa","Macho","Leão-africano");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("--------------------------");
		
		Tigre tigre = new Tigre("Tigrinho","Macho","Tigre-siberiano");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("--------------------------");
		
		Cachorro cachorro = new Cachorro("Nina","Femea","Beagle");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("--------------------------");
		
		Gato gato = new Gato("Logan","Macho","Siberiano");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
	}

}
