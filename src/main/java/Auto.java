package test;

import java.util.ArrayList;

public class Auto {

	public String modelo;
	public int precio;
	public ArrayList<Asiento> asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.size();
	}
	
	public String verificarIntegridad() {
		if(this.registro==this.motor.registro) {
			for(int i=0; i<this.cantidadAsientos();i++) {
				if(this.asientos.get(i).registro!=this.registro) {
					return "Las piezas no son originales";
		
				}
			}
			return "Auto original";
		}
		return "Las piezas no son originales";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
