package tenis;



//subiendo otra vez 

import javax.swing.JOptionPane;

public class Juego {
	public static int jugador1;
	public static int jugador2;
    
   
    int punto = Integer.parseInt(JOptionPane.showInputDialog("ingrese los puntos") );
	
	public int points(){
	return punto;
	}
	
	public void  score(){
			
		jugador2=points();
		jugador1=jugador2;
		
	
		
		if(jugador1==15 && jugador2==0){
			System.out.print("fifteen-love");
		}
		else if (jugador1==0 && jugador2==15){
			System.out.print("punto jugador 2");
		}
		else if (jugador1==15 && jugador2==15){
		 System.out.print("empate ");	
		}
		
	
	}
	
	public static void main(String[] args) {
		Juego tenis;
		tenis = new Juego();
	tenis.points();
	}

}
