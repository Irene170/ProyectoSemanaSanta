package patosMatematicos;

/** Esta clase es otro tipo de pato, hace sonidos, es desconfiado y resuelve ecuaciones cuadráticas
* 
* @author irene 
*/
/**
 * @version 1.0
 */

public class PatoSerrucho {

	String nombre;
	String color;
	int desconfianza;

	/**
	 * 
	 * @param nombre       El nombre del PatoSerrucho
	 * @param color        El color del PatoSerrucho
	 * @param desconfianza El nivel de desconfianza del PatoSerrucho
	 */
	public PatoSerrucho(String nombre, String color, int desconfianza) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.desconfianza = desconfianza;
	}

	/**
	 * 
	 * @return Deevuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Establece el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Devuelve el color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color Establece el color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return Devuelve el nivel de desconfianza
	 */
	public int getDesconfianza() {
		return desconfianza;
	}

	/**
	 * 
	 * @param desconfianza Etablece el nivel de desconfianza
	 */
	public void setDesconfianza(int desconfianza) {
		this.desconfianza = desconfianza;
	}

	@Override
	/** Permite ver todos los datos en String de la clase PatoSerrucho */
	public String toString() {
		return "PatoSerrucho [nombre=" + nombre + ", color=" + color + ", desconfianza=" + desconfianza + "]";
	}

	/** Método para hacer que el pato haga sonidos característicos */
	public void hacerSonido() {
		System.out.println(nombre + " hace el sonido serrucho serrucho...");
	}
	
	

	/** Método para resolver ecuaciones de segundo grado por patos */
	/**
	 * 
	 * @param a Parámetro de la cuadrática
	 * @param b Paramétro de la lineal
	 * @param c Paramétro del término sin x 
	 */

	public void resolverEcuacionSegundoGrado(double a, double b, double c) {
		// Calculamos el discriminante (lo que va dentro de la raíz)
		double discriminante = b * b - 4 * a * c;

		/** Verificamos si hay soluciones reales, solo pueden calcular estas
		 (las ecuciones cuadradas tienen dos soluciones, sean reales o no)*/
		if (discriminante > 0) {
			/**Dos soluciones reales distintas*/

			double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println(nombre + " te da las gracias por hacerle trabajar. " + "Las soluciones son: x1 = " + x1
					+ ", x2 = " + x2);
			System.out.println("Me voy a nadar adiooss");
		} else if (discriminante == 0) {
			/** Una solución real (raíz doble)*/
			double x = -b / (2 * a);
			System.out.println("La solución doble es: x = " + x);
			System.out.println("Soy " + nombre + "no me hagas trabajar más, este patito quiere nadaar");
		} else {
			/** No hay soluciones reales*/
			System.out.println("No hay soluciones reales. Este pato gruñón no lo puede resolver");
		}
	}

	/** Saber si es un pato muy desconfiado o no(Valorado del 1-10)*/
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
