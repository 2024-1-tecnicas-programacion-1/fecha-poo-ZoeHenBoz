package com.mycompany.fecha.poo;

public class Fecha {
    //Atributos de la clase
    private int dia;
    private int mes;
    private int anio;
       
    public Fecha (int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }//cierro la clase fecha

    //complejidad constante
    public String fechaCorta(){
       return String.format("%02d/%02d/%04d", dia,mes,anio);
    }//cierro el metodo fechaCorta
    
    //complejidad constante
    public boolean validarFecha() {
        if (dia < 1 || dia > 31) {
            return false;
        }//cierro if dia

        if (mes < 1 || mes > 12) {
            return false;
        }//cierro if mes

        switch (mes) {
            case 2:
                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                    if (dia > 29) {
                        return false;
                    }//cierro if validacion año biciesto
                    
                } else if (dia > 28) {
                    return false;
                }//cierro if validacion febrero
      
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    return false;
                }
 
        }//cierro switch validacion meses
        
        return true;
    }//cierro el metodo validarFecha
        
    
    //complejidad constante
    public String mesLetra (){
        String[] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        return meses[mes-1];
    }//cierro el metodo mesLetra
    
    //complejidad constante
    public String fechaLarga(){
        return String.format("%d de %s de %d", dia, mesLetra(), anio);
    }//cierro el metodo fechaLarga
}