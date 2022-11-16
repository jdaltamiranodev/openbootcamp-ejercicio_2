public class Main {
    public static void main(String[] args) {
        String estacion = "VERANO";

        switch (estacion){
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Debe ingresar una estación válida");
        }
    }
}