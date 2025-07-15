package interfaces;

public interface EjemploInterfaz {
	
	static int numerito = 34;
	
	//	Antes de Java8, sólo existían métodos abstractos en una interfaz
	//  Java8 incorpora métodos estáticos y default	
	//Java11 incorpora métodos private
	
	
	//	Métodos abstractos
	void procesa(String str);
	
	int otroProceso();
	
	//	Métodos default
	
	default void haceALgo() {
		System.out.println("Soy el método default!");
	}
	
	//Métodos static
	
	static void metodoEstatico() {
		System.out.println("Yo soy estático!");
	}
	
	//Métodos private
	private String metodoPrivado() {
		return "Soy privado";
	}
	
	
	default void metodoDefaultUsaPrivate() {
		
		System.out.println(metodoPrivado());
	}
	
	
	//Métodos private static
	private static String metodoStaticPrivado() {
		return "Soy privado y estático";
	}
	
	
	static void metodoStaticUsaPrivate() {
		System.out.println(metodoStaticPrivado());
	}
}
