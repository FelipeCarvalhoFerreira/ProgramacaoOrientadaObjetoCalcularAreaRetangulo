package ProgramacaoOrientadaObjetoCalcularAreaRetangulo;

public class Retangulo {
	
	public double altura;
	public double largura;
		
	public double calcularArea () {
		return  altura * largura;
	}
	
	public double calcularPerimetro () {
		return 2 * (altura * largura);
	}
	
	public double calcularDiagonal() {
		return Math.sqrt ((altura * altura) + (largura * largura));
		
	}
	
	/*public String toString() {
		return area + ", $ " + String.format("%.2f", netSalary());;
	}
	*/
	
	
}
