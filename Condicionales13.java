public class Condicionales13 {
    public static void main(String[] args) {

        int cantidad;

        System.out.println("Ingrese la cantidad de Bolívares:");
        cantidad = Integer.parseInt(System.console().readLine());

        if (cantidad >= 50000) {
            System.out.println("Billetes de 50000: " + cantidad / 50000);
        }

        if (cantidad >= 20000) {
            System.out.println("Billetes de 20000: " + cantidad / 20000);
        }

        if (cantidad >= 10000) {
            System.out.println("Billetes de 10000: " + cantidad / 10000);
        }

        if (cantidad >= 5000) {
            System.out.println("Billetes de 5000: " + cantidad / 5000);
        }

        if (cantidad >= 2000) {
            System.out.println("Billetes de 2000: " + cantidad / 2000);
        }

        if (cantidad >= 1000) {
            System.out.println("Billetes de 1000: " + cantidad / 1000);
        }

        if (cantidad >= 500) {
            System.out.println("Billetes de 500: " + cantidad / 500);
        }

        if (cantidad >= 100) {
            System.out.println("Billetes de 100: " + cantidad / 100);
        }

        if (cantidad >= 50) {
            System.out.println("Billetes de 50: " + cantidad / 50);
        }

        if (cantidad >= 20) {
            System.out.println("Billetes de 20: " + cantidad / 20);
        }

        if (cantidad >= 10) {
            System.out.println("Billetes de 10: " + cantidad / 10);
        }
    }
}