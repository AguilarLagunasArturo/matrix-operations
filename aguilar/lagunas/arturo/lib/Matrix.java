// Libreria operaciones de matriciales
package lib;
public class Matrix{
	Std io = new Std();
	// Operaciones matriciales
	public double getDeterminat(double[][] matrix){
		int size = matrix.length;
		double det = 0;
		int jj = 0;
		if(size != 2){
			double[][] auxMatrix = new double[size-1][size-1];
			for(int c = 0; c < size; c++){
				for(int i = 1; i < size; i++){
					jj = 0;
					for(int j = 0; j < size; j++){
						if(j != c) {
							//System.out.println((i-1) + " , " + jj);
							auxMatrix[i-1][jj] = matrix[i][j];
							jj++;
						}
					}
				}
				// Pares (+), Impares (-)
				if(c%2 == 0)
					det += matrix[0][c] * getDeterminat(auxMatrix);
				else
					det -= matrix[0][c] * getDeterminat(auxMatrix);
			}
		}else{
			det = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
		}
		return det;
	}
	public double[] solveSystem(double[][] ecuations){
		int size = ecuations.length;
		double[][] dXmatrix = new double[size][size];
		double[] unknowns = new double[size];
		double dX = 0;
		double dM = 0;
		// Calcula dM
		dM = getDeterminat(ecuations);
		if (dM == 0) return unknowns;
		for (int i = 0; i < size; i++){ // dXmatrix
			for (int j = 0; j < size; j++){ // Rows
				for (int k = 0; k < size; k++) { // Cols
					if (i == k)
						dXmatrix[j][k] = ecuations[j][size];
					else
						dXmatrix[j][k] = ecuations[j][k];
				}
			}
			dX = getDeterminat(dXmatrix);
			unknowns[i] = dX/dM;
		}
		return unknowns;
	}
	// Funciones de entrada
	public double[][] getMatrix(){
		// Obtiene tamaño y devuelve matriz
		int size = io.getInt(
			"Matrix size: ",
			"Invalid size, try again: ",
			2, Integer.MAX_VALUE
		);
		double[][] matrix = new double[size][size];
		// Inicializa matriz
		System.out.println("");
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				matrix[i][j] = io.getDouble(
					"Value at [" + (i+1) + "][" + (j+1) + "]: ",
					"Invalid, try again: ",
					-Double.MAX_VALUE, Double.MAX_VALUE
				);
			}
		}
		return matrix;
	}
	public double[][] getEcuations(){
		int size = io.getInt(
			"Number of ecuations: ",
			"Invalid, try again: ",
			2, Integer.MAX_VALUE
		);
		System.out.println("");
		double[][] ecuations = new double[size][size+1];
		System.out.println("Ecuation in form:\tAx + By ... + Zn = R");
		for(int i = 0; i < size; i++){
			System.out.println("\nEcuation number " + (i+1) + ".");
			for(int j = 0; j < size+1; j++){
				ecuations[i][j] = io.getDouble(
					"Value at [" + (i+1) + "][" + (j+1) + "]: ",
					"Invalid, try again: ",
					-Double.MAX_VALUE, Double.MAX_VALUE
				);
			}
		}
		return ecuations;
	}
	// Funciones de salida
	public void printM(double[][] matrix){
		int rows = matrix.length;
		int cols = matrix[0].length;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
				if(j == cols-1)
					System.out.println("");
			}
		}
	}
	public void printA(double[] list){
		for (int i = 0; i < list.length; i++) System.out.println(list[i]);
	}
}
