package Atividade2;

public class Hanoi {
	
	public static void main(String [] args) {
		
		int n = 3;		
		System.out.println("Número de discos: " + n);
		hanoi(n, 'A', 'C', 'B');
	}
	
	public static void hanoi(int n, char origem, char destino, char trabalho) {
		if (n > 0) {
			hanoi(n - 1, origem, trabalho, destino);
			System.out.println("Mover de " +origem+ " para " +destino);
			hanoi(n - 1, trabalho, destino, origem);
		}
	}
}
