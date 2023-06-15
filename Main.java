// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var numeroIf = 2;
        if (numeroIf>0){
            System.out.println("La variable numeroIf es positivo");
        } else if (numeroIf < 0) {
            System.out.println("La variable numeroIf es negativo");
        } if (numeroIf == 0) {
            System.out.println("La variable numeroIf es cero");
        };

        var numeroWhile = -1;
        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        };

        do{
           System.out.println(numeroWhile);
           numeroWhile++;
        } while(numeroWhile < 4);
        ;

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        };

        var estacion = "primavera";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;

            case "otoño":
                System.out.println("Es otoño");
                break;

            case "invierno":
                System.out.println("Es invierno");
                break;

            case "primavera":
                System.out.println("Es primavera");
                break;

            default:
                System.out.println("No estamos en ninguna estacion");
        }

    }
}