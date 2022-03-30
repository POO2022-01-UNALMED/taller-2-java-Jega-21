package test;
public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public Motor (String asignarTipo) {
		if (asignarTipo == "electrico" || asignarTipo == "gasolina") {
			tipo = asignarTipo;
		}
	}
	public void asignarTipo(String tipo) {
		this.tipo = tipo;
	}
	
}