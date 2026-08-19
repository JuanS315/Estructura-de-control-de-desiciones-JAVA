

public class Condicionales6 {
    public static void main(String[] args) {
        double salarioMinimo;
        double departamento1;
        double departamento2;
        double departamento3;
        double ventasTotales;
        double limiteParaExtra;
        double bonoExtra;
        double pago1, pago2, pago3;


        System.out.print("Ingrese el salario minimo o salario base: $ ");
        salarioMinimo = Double.parseDouble(System.console().readLine());


        System.out.print("Ingrese las ventas del departamento 1: ");
        departamento1 = Double.parseDouble(System.console().readLine());


        System.out.print("Ingrese las ventas del departamento 2: ");
        departamento2 = Double.parseDouble(System.console().readLine());


        System.out.print("Ingrese las ventas del departamento 3: ");
        departamento3 = Double.parseDouble(System.console().readLine());


        ventasTotales = departamento1 + departamento2 + departamento3;
        limiteParaExtra = ventasTotales * 0.33;
        bonoExtra = salarioMinimo * 0.20;


        if (departamento1 > limiteParaExtra) {
            pago1 = salarioMinimo + bonoExtra;
        } else {
            pago1 = salarioMinimo;
        }


        if (departamento2 > limiteParaExtra) {
            pago2 = salarioMinimo + bonoExtra;
        } else {
            pago2 = salarioMinimo;
        }


        if (departamento3 > limiteParaExtra) {
            pago3 = salarioMinimo + bonoExtra;
        } else {
            pago3 = salarioMinimo;
        }


        boolean recibe1 = departamento1 > limiteParaExtra;
        boolean recibe2 = departamento2 > limiteParaExtra;
        boolean recibe3 = departamento3 > limiteParaExtra;


        System.out.println("Ventas totales: $" + ventasTotales);
        System.out.println("Limite para bono (33%): $" + String.format("%.2f", limiteParaExtra));


        if (recibe1) {
            System.out.println("Departamento 1 excede 33% y recibe bono extra: $" + bonoExtra);
        } else {
            System.out.println("Departamento 1 no recibe bono.");
        }
        System.out.println("Pago final Departamento 1: $" + pago1);


        if (recibe2) {
            System.out.println("Departamento 2 excede 33% y recibe bono extra: $" + bonoExtra);
        } else {
            System.out.println("Departamento 2 no recibe bono.");
        }
        System.out.println("Pago final Departamento 2: $" + pago2);


        if (recibe3) {
            System.out.println("Departamento 3 excede 33% y recibe bono extra: $" + bonoExtra);
        } else {
            System.out.println("Departamento 3 no recibe bono.");
        }
        System.out.println("Pago final Departamento 3: $" + pago3);
    }
}
       


