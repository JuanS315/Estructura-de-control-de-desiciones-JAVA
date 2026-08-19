public class Condicionales15 {
    public static void main(String[] args){
        int mes, dia, año;

        System.out.println("¿Cuál es su mes de nacimiento?");
        mes=Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su dia de nacimiento?");
        dia=Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es su año de nacimiento?");
        año=Integer.parseInt(System.console().readLine());

        int edad=2026-año;
        if (mes<=8 && 18<=dia) {   
            System.out.println("su edad es:  "+ edad);
        } else {
            System.out.println("su edad es: "+(edad-1));
        }
        
        if ((11==mes && 22<=dia && dia<=31) || (12==mes&&0<=dia&&dia<=21)) {
            System.out.println("su signo del zodiaco es sagitario");
        } if ((12==mes && 22<=dia && dia<=31) || (1==mes&&0<=dia&&dia<=20)) {
            System.out.println("su signo del zodiaco es capricornio");
        } if ((1==mes && 21<=dia && dia<=31) || (2==mes&&0<=dia&&dia<=19)) {
            System.out.println("su signo del zodiaco es acuario");
        } if ((2==mes && 20<=dia && dia<=31) || (3==mes&&0<=dia&&dia<=19)) {
            System.out.println("su signo del zodiaco es piscis");
        } if ((3==mes && 20<=dia && dia<=31) || (4==mes&&0<=mes&&mes<=20)) {
            System.out.println("su signo del zodiaco es aries");
        } if ((4==mes && 21<=dia && dia<=31) || (5==mes&&0<=dia&&dia<=21)) {
            System.out.println("su signo del zodiaco es tauro");
        } if ((5==mes && 22<=dia && dia<=31) || (6==mes&&0<=dia&&dia<=21)) {
            System.out.println("su signo del zodiaco es geminis");
        } if ((6==mes && 22<=dia && dia<=31) || (7==mes&&0<=dia&&dia<=22)) {
            System.out.println("su signo del zodiaco es cancer");
        } if ((7==mes && 23<=dia && dia<=31) || (8==mes&&0<=dia&&dia<=23)) {
            System.out.println("su signo  del zodico es leo");
        } if ((8==mes && 24<=dia && dia<=31) || (9==mes&&0<=dia&&dia<=22)) {
            System.out.println("su signo del zodiaco es virgo");
        } if ((9==mes && 23<=dia && dia<=31) || (10==mes&&0<=dia&&dia<=22)) {
            System.out.println("su signo del zodiaco es libra");
        } if ((10==mes && 23<=dia && dia<=31) || (11==mes&&0<=dia&&dia<=21)) {
            System.out.println("su signo del zodiaco es escorpio");
        }
    }
}