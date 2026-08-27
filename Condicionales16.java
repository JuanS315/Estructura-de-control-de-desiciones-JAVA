public class Condicionales16 {
    public static void main(String[] args) {

        double valor;
        double devaluacion;
        double incremento;
        double valorAutomovil;
        double valorTerreno;
        double perdidaAutomovil;
        double gananciaTerreno;

        System.out.println("Ingrese el valor del automovil y del terreno:");
        valor = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de devaluacion anual del automovil:");
        devaluacion = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el porcentaje de incremento anual del terreno:");
        incremento = Double.parseDouble(System.console().readLine());


        valorAutomovil = valor * Math.pow(1 - devaluacion / 100, 3);


        valorTerreno = valor * Math.pow(1 + incremento / 100, 3);

   
        perdidaAutomovil = valor - valorAutomovil;


        gananciaTerreno = valorTerreno - valor;


        if (perdidaAutomovil <= gananciaTerreno / 2) {
            System.out.println("Debe comprar el automovil.");
        } else {
            System.out.println("No debe comprar el automovil.");
        }
    }
}
