public class Condicionales17 {
    public static void main(String[] args) {

        int lecturaAnterior;
        int lecturaActual;
        int consumo;
        double costo;
        double monto;

        System.out.println("Ingrese la lectura anterior:");
        lecturaAnterior = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese la lectura actual:");
        lecturaActual = Integer.parseInt(System.console().readLine());

        consumo = lecturaActual - lecturaAnterior;

        if (consumo <= 100) {
            costo = 2622.00;
        } else {
            if (consumo <= 300) {
                costo = 79.78;
            } else {
                if (consumo <= 500) {
                    costo = 89.52;
                } else {
                    costo = 97.95;
                }
            }
        }

        monto = consumo * costo;

        System.out.println("El consumo de energia es: " + consumo + " KWh");
        System.out.println("El costo por KWh es: " + costo + " Bs.");
        System.out.println("El monto a pagar es: " + monto + " Bs.");
    }
}
