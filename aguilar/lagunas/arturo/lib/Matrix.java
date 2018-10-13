// Libreria operaciones de matriciales
package lib;
public class Matrix{
	public double getDeterminat(double[][] matrix, int size){
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
					det += matrix[0][c] * getDeterminat(auxMatrix, size-1);
				else
					det -= matrix[0][c] * getDeterminat(auxMatrix, size-1);
			}
		}else{
			det = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
		}
		return det;
	}
}
