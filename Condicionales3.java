public class Condicionales3 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;

        System.out.println("Ingrese valor de a");
        a=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese  valor de  b");
        b=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de c");
        c=Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese valor de d");
        d= Double.parseDouble(System.console().readLine());

        if (d == 0){
            double resultado = Math.pow(a-c, 2);
            System.out.println("La respuesta es :" + resultado);}
             else{
                double resultado1 = Math.pow(a-b,3)/d;
                System.out.println("La respuesta es :" + resultado1  );

                }



    }
    
}
