package lib;
import java.util.Scanner;
public class Std{
	Scanner sc = new Scanner(System.in);
	// Funciones de entrada
	public int getInt(String m, String e, int... range){
		int value = 0;

		System.out.print(m);

		if (range.length == 2){
			do{
				while(!sc.hasNextInt()){
					sc.next();
					System.out.print(e);
				}
				value = sc.nextInt();
				if (!(value >= range[0] && value <= range[1])) System.out.print(e);
			}while(!(value >= range[0] && value <= range[1]));
		}else{
			while(!sc.hasNextInt()){
				sc.next();
				System.out.print(e);
			}
			value = sc.nextInt();
		}
		return value;
	}
	public double getDouble(String m, String e, double... range){
		double value = 0;

		System.out.print(m);

		if (range.length == 2){
			do{
				while(!sc.hasNextDouble()){
					sc.next();
					System.out.print(e);
				}
				value = sc.nextDouble();
				if (!(value >= range[0] && value <= range[1])) System.out.print(e);
			}while(!(value >= range[0] && value <= range[1]));
		}else{
			while(!sc.hasNextDouble()){
				sc.next();
				System.out.print(e);
			}
			value = sc.nextDouble();
		}
		return value;
	}
	public float getFloat(String m, String e, int... range){
		float value = 0f;

		System.out.print(m);

		if (range.length == 2){
			do{
				while(!sc.hasNextFloat()){
					sc.next();
					System.out.print(e);
				}
				value = sc.nextFloat();
				if (!(value >= range[0] && value <= range[1])) System.out.print(e);
			}while(!(value >= range[0] && value <= range[1]));
		}else{
			while(!sc.hasNextFloat()){
				sc.next();
				System.out.print(e);
			}
			value = sc.nextFloat();
		}
		return value;
	}
	// Funciones de salida
	public void separator(){
		System.out.println("\n-----------------------------------\n");
	}
	// Funciones de ordenamiento
	public int[] orderDouble(int[] list, boolean maxMin){
		int size = list.length;
		boolean changed = true;
		int aux = 0;
		if (maxMin){
			while (changed){
				changed = false;
				for (int i = 0; i < (size-1); i++){
					if (list[i+1] > list[i]){
						aux = list[i];
						list[i] = list[i+1];
						list[i+1] = aux;
						changed = true;
					}
				}
			}
		}else{
			while (changed){
				changed = false;
				for (int i = 0; i < (size-1); i++){
					if (list[i+1] < list[i]){
						aux = list[i];
						list[i] = list[i+1];
						list[i+1] = aux;
						changed = true;
					}
				}
			}
		}
		return list;
	}
	public float[] orderDouble(float[] list, boolean maxMin){
		int size = list.length;
		boolean changed = true;
		float aux = 0f;
		if (maxMin){
			while (changed){
				changed = false;
				for (int i = 0; i < (size-1); i++){
					if (list[i+1] > list[i]){
						aux = list[i];
						list[i] = list[i+1];
						list[i+1] = aux;
						changed = true;
					}
				}
			}
		}else{
			while (changed){
				changed = false;
				for (int i = 0; i < (size-1); i++){
					if (list[i+1] < list[i]){
						aux = list[i];
						list[i] = list[i+1];
						list[i+1] = aux;
						changed = true;
					}
				}
			}
		}
		return list;
	}
	public double[] orderDouble(double[] list, boolean maxMin){
		int size = list.length;
		boolean changed = true;
		double aux = 0;
		if (maxMin){
			while (changed){
				changed = false;
				for (int i = 0; i < (size-1); i++){
					if (list[i+1] > list[i]){
						aux = list[i];
						list[i] = list[i+1];
						list[i+1] = aux;
						changed = true;
					}
				}
			}
		}else{
			while (changed){
				changed = false;
				for (int i = 0; i < (size-1); i++){
					if (list[i+1] < list[i]){
						aux = list[i];
						list[i] = list[i+1];
						list[i+1] = aux;
						changed = true;
					}
				}
			}
		}
		return list;
	}
}
