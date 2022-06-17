package exercicio2;

public class Aviao1 {
	private int fabricacao;
	private String modelo;
	private String pais;
	
public void pousar() {
	System.out.println("Está pousando >_>_>__>_>_>_>__");
	
}
public void decolar() {
	System.out.println("Está decolando <__<___<<__<__<_<_<_");
}
public int getFabricacao() {
	return fabricacao;
}
public void setFabricacao(int fabricacao) {
	this.fabricacao = fabricacao;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
}
