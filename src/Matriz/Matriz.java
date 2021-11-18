package Matriz;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Matriz {

    /*
    public void cargar(int M[][], int filas, int columnas) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Digite: ");
                M[i][j] = entrada.nextInt();
            }
        }
    }*/
    public void cargar(int M[][], int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                M[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digita: "));
            }
        }
    }

    public void mostrar(int M[][], int filas, int columnas, JTable tbl) {
        DefaultTableModel tabla = (DefaultTableModel) tbl.getModel();

        tabla.setRowCount(filas);
        tabla.setColumnCount(columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla.setValueAt(M[i][j], i, j);
            }
        }
    }

    public void mostrar(int M[][], int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("[" + M[i][j] + "]");
            }
        }
    }
    
    public void generar(int M[][], int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                M[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
    }

    
    public void sumarMatrices(int A[][], int B[][], int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + (A[i][j] + B[i][j]) + "]");
            }
            System.out.println("");
        }
    }
    
    public void sumarMatrices(int A[][], int B[][], int filas, int columnas, JTable tbl) {
        DefaultTableModel tabla = (DefaultTableModel) tbl.getModel();

        tabla.setRowCount(filas);
        tabla.setColumnCount(columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla.setValueAt((A[i][j] + B[i][j]), i, j);
            }
        }
    }
/*
    public void limpiar(int filas, int columnas, JTable tbl, JTable tb2, JTable tb3) {
        DefaultTableModel tabla = (DefaultTableModel) tbl.getModel();
        DefaultTableModel tabla2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tabla3 = (DefaultTableModel) tb3.getModel();

        tabla.setRowCount(filas);
        tabla.setColumnCount(columnas);

        tabla2.setRowCount(filas);
        tabla2.setColumnCount(columnas);

        tabla3.setRowCount(filas);
        tabla3.setColumnCount(columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla.setValueAt("", i, j);
                tabla3.setValueAt("", i, j);
                tabla3.setValueAt("", i, j);
            }
        }

        tabla.setRowCount(1);
        tabla.setColumnCount(0);

        tabla2.setRowCount(1);
        tabla2.setColumnCount(0);

        tabla3.setRowCount(1);
        tabla3.setColumnCount(0);
    }
*/
}
