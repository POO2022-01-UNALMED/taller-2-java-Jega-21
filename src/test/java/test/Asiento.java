package test;
public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	Asiento (String cambiarColor) {
		if (cambiarColor == "rojo" || cambiarColor == "verde" || cambiarColor == "amarillo" || cambiarColor == "negro" || cambiarColor == "blanco") {
			color = cambiarColor;
		}
	}
	void cambiarColor(String cambiarColor) {
		this.color = cambiarColor;
	}
	
}	