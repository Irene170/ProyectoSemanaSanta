package patosMatematicos;

public class PatoZambullidor {
	String nombre;
	int edad;
	String color;
	int salud;

	public PatoZambullidor(String nombre, int edad, String color, int salud) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.salud = salud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		return "PatoZambullidor [nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", salud=" + salud + "]";
	}
	// Método para resolver una ecuación lineal de primer grado de la forma "ax + b=
	// 0"

	public void resolverEcuacionLineal(int a, int b) {
		if (a == 0) {
			System.out.println("No es una ecuación lineal de primer grado. Este patito no lo puede resolver");
			return;
		}
		double x = (double) -b / a;
		System.out.println(nombre + " ha resuelto la ecuación " + a + "x + " + b + " = 0 y x = " + x);
	}

	// Método para hacer que el pato haga quack
	public void quack() {
		System.out.println(nombre + " hace quack quack!");
	}

	// Método para hacer que el pato nade
	public void nadar() {
		System.out.println("Soy" + nombre + " ,estoy nadando en el estanqueee");
		if (salud > 5) {
			System.out.println(nombre + " ya puede echarse la siesta");
		} else {
			System.out.println(nombre + "debes seguir mejorando tu salud, a nadar patoo");
		}
	}

}
