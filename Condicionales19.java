public class Condicionales19 {
    public static void main(String[] args) {
        float lvlhemoglobina;
        int edad;
        String sexo, unidad;

        System.out.println("cual su nivel de hemoglobina:");
        lvlhemoglobina = Float.parseFloat(System.console().readLine());
        System.out.println("cual su edad:");
        edad = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese su sexo (M/F)");
        sexo = System.console().readLine();
        System.out.println("¿La edad está en meses o años? (M/A)");
        unidad = System.console().readLine();

        if (unidad.equalsIgnoreCase("M")) {
            if (edad >= 0 && edad <= 1) {
                if (lvlhemoglobina<13) {
                System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
            
            if (1<edad && edad<=6) {
                if (lvlhemoglobina<10) {
                System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
            
            if (edad<6 && edad<=12) {
                if (lvlhemoglobina<11) {
                System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
        }
        

        if (unidad.equalsIgnoreCase("A")) {
            if (1<edad && edad<=5) {
                if (lvlhemoglobina<11.5) {
                System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }

            if (5<edad && edad<=10) {
                if (lvlhemoglobina<12.6) {
                System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }

            if (10<edad && edad<=15) {
                if (lvlhemoglobina<13) {
                System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
        }

        if (15<edad) {
            if (sexo.equalsIgnoreCase("F")) {
                if (lvlhemoglobina<12) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }

            if (sexo.equalsIgnoreCase("M")) {
                if (lvlhemoglobina<14) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
        }
    }
}