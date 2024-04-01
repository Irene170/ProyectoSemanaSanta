package patosMatematicos;

public class PatoSerrucho {
	String nombre;
	String color;
	int desconfianza;

	public PatoSerrucho(String nombre, String color, int desconfianza) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.desconfianza = desconfianza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDesconfianza() {
		return desconfianza;
	}

	public void setDesconfianza(int desconfianza) {
		this.desconfianza = desconfianza;
	}

	@Override
	public String toString() {
		return "PatoSerrucho [nombre=" + nombre + ", color=" + color + ", desconfianza=" + desconfianza + "]";
	}

	// Método para hacer que el pato haga sonidos característicos
	public void hacerSonido() {
		System.out.println(nombre + " hace el sonido serrucho serrucho...");
	}
	// Método para resolver ecuaciones de segundo grado por patos

	public void resolverEcuacionSegundoGrado(double a, double b, double c) {
		// Calculamos el discriminante (lo que va dentro de la raíz)
		double discriminante = b * b - 4 * a * c;

		// Verificamos si hay soluciones reales, solo pueden calcular estas
		// (las ecuciones cuadradas tienen dos soluciones, sean reales o no)
		if (discriminante > 0) {
			// Dos soluciones reales distintas

			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println(nombre + " te da las gracias por hacerle trabajar. " + "Las soluciones son: x1 = " + x1
					+ ", x2 = " + x2);
			System.out.println("Me voy a nadar adiooss");
		} else if (discriminante == 0) {
			// Una solución real (raíz doble)
			double x = -b / (2 * a);
			System.out.println("La solución doble es: x = " + x);
			System.out.println("Soy " + nombre + "no me hagas trabajar más, este patito quiere nadaar");
		} else {
			// No hay soluciones reales
			System.out.println("No hay soluciones reales. Este pato gruñón no lo puede resolver");
		}
	}

	// Saber si es un pato muy desconfiado o no
	public void desconfiado() {

		if (desconfianza <= 10) {
			if (desconfianza >= 6) {
				System.out.println("Soy muy desconfiado. No te acerques o te doy un picotazo");
			} else {
				System.out.println("Hola soy " + nombre + " ,no soy muy desconfiado. Dame paaan");
			}
		} else {
			System.out.println("El nivel de desconfiza es de 1 a 10. No existe");
		}
	}

}
