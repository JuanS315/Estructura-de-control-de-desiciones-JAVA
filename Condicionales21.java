public class Condicionales21 {
    public static void main(String[] args) {
        int hipoteca, totalinversion;
        System.out.println("Ingrese el valor de la hipoteca:");
        hipoteca = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el valor de la inversion:");
        totalinversion = Integer.parseInt(System.console().readLine());

        if (hipoteca < 1000000) {
            double inversion = (totalinversion * 0.50);
            double hipotecaSocio = (hipoteca * 0.50);
            System.out.println("El valor de la inversion es: " + inversion);
            System.out.println("Su socio debera invertir: " + hipotecaSocio);
        } else {
            int restoinversion = totalinversion - hipoteca;
            double inversion2 = restoinversion/2;
            System.out.println("El valor restante de la inversion es de: " + restoinversion);
            System.out.println("Entre su socio y usted, deben pagar: " + inversion2 + " cada uno");
        }
    }
}
