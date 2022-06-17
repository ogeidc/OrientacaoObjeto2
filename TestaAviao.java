package exercicio2;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao1 Aviao = new Aviao1();
		Aviao.setFabricacao(2020);
		Aviao.setModelo("Boeing 747");
		Aviao.setPais("Brasil");
		
		System.out.println("O "+Aviao.getModelo()+" fabricado no ano de "+Aviao.getFabricacao()+" vindo do "
				+Aviao.getPais());
		Aviao.decolar();
		
		
		

	}

}
