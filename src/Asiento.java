package test;
public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	Asiento (String cambiarColor) {
		if (color == "rojo" || cambiarColor == "verde" || cambiarColor == "amarillo" || cambiarColor == "negro" || cambiarColor == "blanco") {
			color = cambiarColor;
		}
	}
	void cambiarColor(String color) {
		this.color = color;
	}
	
}	