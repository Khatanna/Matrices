package Matriz;

import java.util.Scanner;

public class PrincipalMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int filas, columnas, opcion;

        int Matriz[][];
        int A[][];
        int B[][];

        Matriz m = new Matriz();

        do {
            System.out.println("1) Cargar datos");
            System.out.println("2) Generar matriz");
            System.out.println("3) Sumar matrices");
            System.out.print("0) Salir: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el numero de filas: ");
                    filas = entrada.nextInt();
                    System.out.print("Ingrese el numero de columnas: ");
                    columnas = entrada.nextInt();
                    Matriz = new int[filas][columnas];
                    m.cargar(Matriz, filas, columnas);
                    m.mostrar(Matriz, filas, columnas);
                }
                case 2 -> {
                    System.out.print("Ingrese el numero de filas: ");
                    filas = entrada.nextInt();
                    System.out.print("Ingrese el numero de columnas: ");
                    columnas = entrada.nextInt();
                    Matriz = new int[filas][columnas];
                    m.generar(Matriz, filas, columnas);
                    m.mostrar(Matriz, filas, columnas);
                }
                case 3 -> {
                    System.out.print("Ingrese el numero de filas: ");
                    filas = entrada.nextInt();
                    System.out.print("Ingrese el numero de columnas: ");
                    columnas = entrada.nextInt();
                    A = new int[filas][columnas];
                    B = new int[filas][columnas];

                    System.out.println("Datos para la matriz A");
                    m.cargar(A, filas, columnas);
                    System.out.println("Datos para la matriz B");
                    m.cargar(B, filas, columnas);
                    m.sumarMatrices(A, B, filas, columnas);
                }
            }
        } while (opcion != 0);

    }

}
