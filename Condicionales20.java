public class Condicionales20 {
    public static void main(String[] args) {

        double capital;
        double prestamo = 0;
        double presupuesto;
        double insumos;
        double incentivos;

        System.out.println("Ingrese el capital actual de la empresa:");
        capital = Double.parseDouble(System.console().readLine());

        if (capital < 0) {
            prestamo = 10000 - capital;
            presupuesto = 10000;
        } else {
            if (capital <= 20000) {
                prestamo = 20000 - capital;
                presupuesto = 20000;
            } else {
                presupuesto = capital;
            }
        }

        presupuesto = presupuesto - 5000 - 2000;

        insumos = presupuesto / 2;
        incentivos = presupuesto / 2;

        System.out.println("Cantidad destinada a insumos: $" + insumos);
        System.out.println("Cantidad destinada a incentivos al personal: $" + incentivos);

        if (prestamo > 0) {
            System.out.println("La cantidad que se pedira al banco es: $" + prestamo);
        } else {
            System.out.println("No es necesario solicitar un prestamo al banco.");
        }
    }
}
