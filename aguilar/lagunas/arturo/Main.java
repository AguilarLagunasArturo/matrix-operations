import lib.Std;
import lib.Matrix;
class Main{
	private static Std io = new Std();
	private static Matrix mtrx = new Matrix();
	public static void main(String[] args){
		io.println("== Determinat test ==\n");
		int size = io.getInt("Matrix size: ", "Invalid, try again: ", 2, Integer.MAX_VALUE);
		double[][] matrix = new double[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				matrix[i][j] = io.getDouble(
					"Value at [" + i + "][" + j + "]: ","Invalid, try again: ",
					-Double.MAX_VALUE, Double.MAX_VALUE
				);
			}
		}
		io.println("\n== Input matrix ==\n");
		printM(matrix, size, size);
		io.println("\n== Determinat ==\n");
		io.println(""+mtrx.getDeterminat(matrix, size));
	}
	private static void printM(double[][] array, int cols, int rows){
		for(int i = 0; i < cols; i++){
			for(int j = 0; j < rows; j++) {
				io.print(array[i][j] + "\t");
				if(j == rows-1)
					io.println();
			}
		}
	}
}
