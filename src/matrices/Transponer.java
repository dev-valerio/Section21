package matrices;

public class Transponer {

    public static void main(String[] args) {
        
        //--------MATRIZ CUADRADA---------------
        int[][] matrizCuadrada = new int[5][5];
        inicializar(matrizCuadrada);
        System.out.println("Matriz original");
        mostrarMatriz(matrizCuadrada);
        matrizCuadradaTranspuesta(matrizCuadrada);
        System.out.println("Matriz transpuesta");
        mostrarMatriz(matrizCuadrada);

        //---------MATRIZ CUADRADA O NO CUADRADA------
        int[][] matriz = new int[5][3];
        int[][] transpuesta = new int[matriz[0].length][matriz.length]; //5 FILAS Y 3 COLUMNAS       
        inicializar(matriz);
        System.out.println("Matriz original");
        mostrarMatriz(matriz);
        transponerMatriz(matriz, transpuesta);
        System.out.println("Matriz transpuesta");
        mostrarMatriz(transpuesta);

    }
    
    
    private static void transponerMatriz(int[][] matriz, int[][] transpuesta) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                transpuesta[j][i] = matriz[i][j];
            }
        }
    }

    private static void inicializar(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

    }

    private static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    private static void matrizCuadradaTranspuesta(int[][] matriz) {
        int aux;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i > j) {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }

    }

    

}
