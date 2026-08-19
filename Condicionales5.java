public class Condicionales5 {
    public static void main(String[] args) {
        int Total_de_Compra ;
        
        System.out.println("Ingresa  el total a pagar");
        Total_de_Compra= Integer.parseInt(System.console().readLine());
        double inversion, prestbancario, inversion2, fab, intfab, pagoinv, pagobanco, pagofabric, tasa1, pagoinv2, pagofabric2, tasa2;

        inversion=55;
        prestbancario=30;
        inversion2=70;
        fab=30;
        intfab=20;

        if (Total_de_Compra > 500000) {
            pagoinv = (Total_de_Compra*inversion)/100;
            pagobanco=(Total_de_Compra*prestbancario)/100;
            pagofabric=(Total_de_Compra*fab)/100;
            tasa1=(pagofabric*intfab)/100;

            System.out.println("El monto que paga la empresa es: "+pagoinv);
            System.out.println("El monto que presta el banco es de:"+pagobanco);
            System.out.println("El monto que pesta el fabricante es de:"+pagofabric+" y la tasa de interes es de:"+tasa1);
        }else {
            pagoinv2=(Total_de_Compra*inversion2)/100;
            pagofabric2=(Total_de_Compra*fab)/100;
            tasa2=(pagofabric2*intfab)/100;
            System.out.println("El monto que paga la empresa es: "+pagoinv2);
            System.out.println("El monto que pesta el fabricante es de:"+pagofabric2+" y la tasa de interes es de:"+tasa2);
        }
    }
}
