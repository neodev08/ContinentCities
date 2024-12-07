public class Continents{
    public static void main(String[] args) {
        //  Programa que muestra los continentes y ciudades pasado por numero a la variable continent
        int continent = 2;

        switch(continent){
            case 1 -> System.out.println("North America: Mexico City, Mexico.");

            case 2 -> System.out.println("South America: Sao Paulo, Brasil.");

            case 3 -> System.out.println("Europe: Moscow, Russia.");
            
            case 4 -> System.out.println("Africa: Lagos, Nigeria.");

            case 5 -> System.out.println("Asia: Shanghai, China.");

            case 6 -> System.out.println("Australia: Sygney, Australia.");

            case 7 -> System.out.println("Antarctica: McMurdo, US.");

            default -> System.out.println("Undefined continent!");

        }
    }
}