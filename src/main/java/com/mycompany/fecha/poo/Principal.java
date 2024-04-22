package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        Fecha fecha = new Fecha(dia, mes, anio);

        if (fecha.validarFecha()) {
     
            System.out.println("Formato de fecha larga: " + fecha.fechaLarga());
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
}
