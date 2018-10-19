import lib.Std;
import lib.Matrix;
import java.util.Scanner;
class Main{
	// Variables globales
	private static Std io = new Std();
	private static Matrix mtrx = new Matrix();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		// Variables locales
		String[] options = {
			"Matrix addition.",
			"Matrix substraction.",
			"Matrix multiplication.",
			"Matrix determinat.",
			"Solve linear system of ecuations."
	 	};

		int op = 0;
		String exitOption = "";

		io.separator();

		// Ejecución indefinida
		do {
			// Ofrece opciones al usuario
			System.out.println("== Choose an option ==\n");
			for (int i = 0; i < options.length; i++) {
				System.out.println("[" + (i+1) + "] " + options[i]);
			}
			System.out.println("");
			// Lee opcion del usuario
			op = io.getInt(
				"Type your option: ",
				"Not an option, try again: ",
				1, options.length
			);
			io.separator();
			// Ejecuta la opción deseada
			switch(op){
				case 1:
					add();
					break;
				case 2:
					substract();
					break;
				case 3:
					multiply();
					break;
				case 4:
					determinant();
					break;
				case 5:
					linearSystem();
					break;
				default:
					System.out.println("\nError? :(");
			}
			// Condicion para seguir ejecutando
			System.out.print("\nPress [x] to exit. ");
			exitOption = sc.nextLine();
			io.separator();
		} while ( !(exitOption.equals("x") || exitOption.equals("X")) );
	}
	private static void add(){
		System.out.println("Not finished yet.");
	}
	private static void substract(){
		System.out.println("Not finished yet.");
	}
	private static void multiply(){
		System.out.println("Not finished yet.");
	}
	private static void determinant(){
		// Inicializa matriz
		double[][] matrix = mtrx.getMatrix();
		// Imprime matriz
		System.out.println("\n== Input matrix ==\n");
		mtrx.printM(matrix);
		// Imprime resultado
		System.out.println("\n== Solution ==\n");
		System.out.println(mtrx.getDeterminat(matrix));
	}
	private static void linearSystem(){
		// Inicializa ecuaciones
		double[][] ecuations = mtrx.getEcuations();
		// Imprime ecuaciones
		System.out.println("\n== Input ecuations ==\n");
		mtrx.printM(ecuations);
		// Imprime incognitas
		System.out.println("\n== Unknown values ==\n");
		if (mtrx.getDeterminat(ecuations) == 0) {
			System.out.println("This system has infinitely many solutions.");
		}else {
			mtrx.printA(mtrx.solveSystem(ecuations));
		}
	}
}
