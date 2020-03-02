 public class MatricesDinamicas{
    public static void main(String args[]){

    int filas = 3;
    int columnas = 3;
    int contador = 1;

    int numeros[][] = new int[3][3];

    for(int j =0; j< filas; j++){

    for(int i =0; i < columnas; i++){

      numeros[j][i] = contador;

      contador++;

      System.out.print("[" + numeros[j][i] + "]");
    }
      System.out.println("");

   }
   }
 }