public class Condicionales11 {
    public static void main(String[] args) {

        int categoria;
        double sueldo;
        double aumento;

        System.out.println("Ingrese la categoria del trabajador:");
        categoria = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el sueldo del trabajador:");
        sueldo = Double.parseDouble(System.console().readLine());

        if (categoria == 1) {
            aumento = sueldo * 0.15;
        } else {
            if (categoria == 2) {
                aumento = sueldo * 0.10;
            } else {
                if (categoria == 3) {
                    aumento = sueldo * 0.08;
                } else {
                    if (categoria == 4) {
                        aumento = sueldo * 0.07;
                    } else {
                        aumento = 0;
                        System.out.println("Categoria no valida.");
                    }
                }
            }
        }

        if (categoria >= 1 && categoria <= 4) {
            System.out.println("El aumento correspondiente es: $" + aumento);
            System.out.println("El nuevo sueldo es: $" + (sueldo + aumento));
        }
    }
}