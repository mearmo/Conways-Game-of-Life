import java.awt.event.KeyEvent;

public class Proyecto1 {
    public static void main(String[] args)
    {
        //inicializar tablero en 0
        int[][] tablero = { { 0, 0, 0, 0, 0},
                            { 0, 0, 0, 0, 0},
                            { 0, 0, 0, 0, 0},
                            { 0, 0, 0, 0, 0},
                            { 0, 0, 0, 0, 0}};

        //agregar celulas con vida de manera aleatoria. Probabilidad 33%
        double probabilidad;
        for (int i = 0; i < tablero.length; i++)
        {
            for (int j = 0; j < tablero[0].length; j++)
            {
                probabilidad = Math.random();           //generar numeros aletorios entre 0 y 1
                if(probabilidad < 0.33){                //si es menor a 0.33, darle vida a la celula
                    tablero[i][j] = 1;
                }
            }
        }
        printTablero(tablero);                          //imprimir el tablero inicial en consola

        int num = 0;
        while (num < 10)                                //repetir el loop de conway 10 veces
        {
            tablero =  conway(tablero);                 //reasignar los valores del tablero con el resultado de conway
            printTablero(tablero);                      //imprimir el nuevo tablero
            num += 1;
        }

    }

    static void printTablero(int[][] tablero){              //función void que imprime el tablero en consola
        for (int i = 0; i < tablero.length; i++)            //recorre filas
        {
            for (int j = 0; j < tablero[0].length; j++)     //recorre columnas
            {
                System.out.print(tablero[i][j]);            //imprime la posicion correpondiente de la matriz
            }
            System.out.println();                           //imprime salto de linea
        }
        System.out.println();
    }


    static int[][] conway(int[][] tablero)                      //funcion conway
    {
        for (int i = 0; i < tablero.length; i++)
        {
            for (int j = 0; j < tablero[0].length; j++)
            {
                //*******Aquí van las condiciones******
                String hola = "hola";
            }
        }
        return tablero;
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            System.out.println("Fin");
            System.exit(0);
        }
    }

}
