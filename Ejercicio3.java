
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro lib[] = new Libro[2];
		
		Libro lib1 = new Libro (1232512, "Prueba1", "Alfonso", 300);
		lib[0] = lib1;
		Libro lib2 = new Libro (14542, "Prueba2", "Jhonny", 400);
		lib[1] = lib2;
		
		//MOstrar por pantalla
		for (int i = 0; i < lib.length; i++) {
			System.out.println(lib[i]);
		}
		
		//Comparativa de paginas
		Libro maxL = new Libro (0, "", "", 0);
		for (int i = 0; i < lib.length; i++) {
			if (lib[i].compareTo(maxL) == 1)
				maxL = lib[i];
		}
		
		System.out.println(maxL + "\n");

	}

}
