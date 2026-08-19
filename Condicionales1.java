public class Condicionales1 {

    public static void main(String[] args) {
        
        
        System.out.println("Ingrese valor de invercion");
        int inversion = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuanto es la tasa de interes?");
        Float Porcentaje = Float.parseFloat(System.console().readLine());

        Float GananciaI =  (inversion*Porcentaje)/100;

        float Suma_de_interes = GananciaI + inversion;

        if (Suma_de_interes> 7000) {


             System.out.println("Tu ganancia total es de :" + Suma_de_interes + " Puedes volver a invertir");
             


        }else {

            System.out.println("Tu ganancia es de  :" + Suma_de_interes + " no reinviertas");


        }

        

        

        
    }
}