package br.com.generation.heranças;

public class TestaAnimais {
	

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça preg = new Preguiça();
		
				
		cach.setNome("claudio");
		cach.setIdade(5);
		
		cav.setNome("bie");
		cav.setIdade(10);
		
		preg.setNome("loco");
		preg.setNome(2);
			
		
		
		System.out.println("O nome do cachorro é: "+ cach.getNome());
		System.out.println("Ele tem "+ cach.getIdade()+" anos.");
		cach.correr();
		cach.emitirSom("uaua");
		
		System.out.println();
		
		System.out.println("O nome do cavalo é: "+ cav.getNome());
		System.out.println("Ele tem "+ cav.getIdade()+" anos.");
		cav.correr();
		cav.emitirSom("oioii");
		
		System.out.println();
		System.out.println("O nome da preguiça é: "+ preg.getNome());
		System.out.println("Ela tem "+preg.getIdade()+" anos.");
		preg.subirArvore();
		preg.emitirSom("ooooooo");
		

}
