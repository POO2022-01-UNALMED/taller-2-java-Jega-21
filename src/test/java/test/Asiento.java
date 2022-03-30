package test;
public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	void cambiarColor(String color) {
		String [] colores = {"rojo","verde","amarillo","negro","blanco"};
		for (int i = 0; i< colores.length; i++) {
			if (colores[i] == color) {
				this.color = color;
			}
		}
	}
}
	
	