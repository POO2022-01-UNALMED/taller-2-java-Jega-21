package test;
public class Auto {
	public String modelo;
	public int precio;
	public Asiento [] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados; 
	
	public int cantidadAsientos() {
		int cantidad = 0;
		for (Asiento asientos : asientos)
			if (asientos != null)
				cantidad++;
		return cantidad;
	}
		
	public String verificarIntegridad() {
		boolean inte = true;
		if (this.registro != motor.registro) {
			inte = false;
		}
		if (inte) {
			for (Asiento asientos : asientos) {
				if (asientos != null && asientos.registro != this.registro) {
					inte = false;
				}
			}
		}
		if (inte) {
			return "Auto original";
		}
		return "Las piezas no son originales";
	}
}