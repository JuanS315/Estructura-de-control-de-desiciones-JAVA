public class Condicionales8 {
    public static void main(String[] args) {
        int pagonormal = 5000;
        System.out.println("Cuál fue la distancia recorrida");
        int distancia = Integer.parseInt(System.console().readLine());

        if (distancia <= 300) {
            System.out.println("El cliente debe cancelar "+pagonormal+"bs");
        } if (300<distancia) {
            if (distancia<1000) {
                int kmadd = distancia-300;
                int pagoadicional = kmadd*200;
                System.out.println("El cliente debe pagar " + (pagonormal+pagoadicional) + "bs");
            } else {
                int pago2 = (1000-300)*200;
                int pago3 = (distancia - 1000)*150;
                System.out.println("El cliente debe cancelar "+(pagonormal+pago2+pago3)+"bs");
            }
        }
    }
}