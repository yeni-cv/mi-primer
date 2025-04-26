package Programacion_orientada_objetos;

public class Automoviles {
	private static int totalganancias;
	private static int vehiculosalquilados;
	private String Matricula;
	private String Modelo;
	private String Marca;
	private int año_matri;
	private int categoria;
	private boolean alquilado;
	private int ganancias;

	public Automoviles(String matricula, String modelo, String marca, int año_matri, int categoria) {

		Matricula = matricula;
		Modelo = modelo;
		Marca = marca;
		this.año_matri = año_matri;
		this.categoria = categoria;
		this.alquilado = false;

	}

	// metodo para alquilar un vehiculo
	public int alquilar(int dias) {
		if (alquilado == true) {
			return 0;
		}
		// calcular el alquiler

		int importe = 0;
		switch (categoria) {
		case 1:
			if (dias <= 2)
				importe = dias + 45;
			else
				importe = dias * 30;
			break;
		case 2:
			if (dias <= 2)
				importe = dias * 50;
			else
				importe = dias * 40;
			break;
		default:
			throw new IllegalArgumentException("Categoria Incorrecta");
//cuando se pone un argumento no valido en un metodo
		}

		this.ganancias += importe;
		totalganancias += importe;
		this.alquilado = true;
		vehiculosalquilados++;
		return importe;
	}

	public void devolver() {
		if (!alquilado) {
			/*
			 * si el vehiculo no esta a verdadero es decir que este alquilado devolvera una
			 * excecion
			 */
			throw new IllegalStateException("El automovil no esta alquilado");
// esta excecion se lanza cuando un metodo depende de que el objeto este en un estado especifico, pero no lo esta
		}
		vehiculosalquilados--;
		this.alquilado = false;
	}

	// metodo para saber si el vehiculo esta alquilado
	public boolean estaalquilado() {
		return this.alquilado;// aqui devuelve false o true dependiendo si esta alquilado o no
	}

	// para consultar los vehiculos alquilados actuales
	public static int totalvehiculosalq() {
		return vehiculosalquilados;
	}

	// para devolver el total de ganancias
	public static int totalgananciasalq() {
		return totalganancias;
	}

	// para devolver ganancias por vehiculos
	public int gananciasind() {
		return this.ganancias;
	}

	
	public String informacion() {
		return "Automoviles [Matricula=" + Matricula + ", Modelo=" + Modelo + ", Marca=" + Marca + ", año_matri="
				+ año_matri + ", categoria=" + categoria + ", Alquilado: " + (alquilado ? "true" : "false ");
	}

}
