package patosMatematicos;
/**
	 * Esta clase es otro tipo de pato,tiene variaciones de salud y resuelve
	 * ecuaciones lineales, hace otro tipo de sonidos
	 * 
	 * @author irene
	 *
	 * @version 1.0
	 */
public class PatoZambullidor {
	
	String nombre;
	int edad;
	String color;
	int salud;

	/**
	 * 
	 * @param nombre Es el nombre del PatoZambullidor
	 * @param edad   Es la edad del Pato zambullidor
	 * @param color  Es el color del Pato Zambullidor
	 * @param salud  Es el "nivel" de salud del Pato Zambullidor
	 */
	public PatoZambullidor(String nombre, int edad, String color, int salud) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.salud = salud;
	}

	/**
	 * 
	 * @return Devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Declara el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Devuelve la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad Declara la edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Devuelve el color
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color Declara el color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return Devuelve el nivel de salud
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * 
	 * @param salud Declara el nivel de salud
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	@Override
	/**
	 * Devuelve una cadena de caracteres de los atributos de la clase Pato
	 * Zambllidor
	 */
	public String toString() {
		return "PatoZambullidor [nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", salud=" + salud + "]";
	}

	/**
	 * Método para resolver una ecuación lineal de primer grado de la forma "ax + b=
	 * 0"
	 * 
	 * @param a Es el parámetro delante de la x
	 * @param b Es el parámetro delante de la y
	 */
	public void resolverEcuacionLineal(int a, int b) {
		if (a == 0) {
			System.out.println("No es una ecuación lineal de primer grado. Este patito no lo puede resolver");
			return;
		}
		double x = (double) -b / a;
		System.out.println(nombre + " ha resuelto la ecuación " + a + "x + " + b + " = 0 y x = " + x);
	}

	/** Método para hacer que el pato haga quack */
	public void quack() {
		System.out.println(nombre + " hace quack quack!");
	}

	/** Método para hacer que el pato nade */
	public void nadar() {
		System.out.println("Soy" + nombre + " ,estoy nadando en el estanqueee");
		if (salud > 5) {
			System.out.println(nombre + " ya puede echarse la siesta");
		} else {
			System.out.println(nombre + "debes seguir mejorando tu salud, a nadar patoo");
		}
	}

}
