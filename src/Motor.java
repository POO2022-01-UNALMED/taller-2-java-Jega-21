package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public Motor (String asignarTipo) {
		if (asignarTipo == "electrico" || asignarTipo == "gasolina") {
			tipo = asignarTipo;
		}
	}
	void asignarTipo(String tipo) {
		this.tipo = tipo;
	}
	
}