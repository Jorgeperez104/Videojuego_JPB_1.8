package componentes;

public class Narrativa {

    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    public static final String NARANJA = "\u001B[38;5;208m";

    public static void LeerNarrativa(){

        System.out.println(AMARILLO+"\n--- Narrativa del Juego ---"+RESET);
        System.out.println("\nA lo largo de la historia del fútbol, las tandas de penaltis han sido muy decisivas a la hora de definir un ganador en un partido en el que ningún equipo haya sido capaz de ganar al rival en 120 minutos de juego.");
        System.out.println("Estas tandas de penaltis han existido y existen en prácticamente todas las competiciones en el mundo del fútbol, como un mundial, una eurocopa, una copa américa, la champions… etc.");
        System.out.println("Una manera de acabar un partido o una eliminatoria con infinidad de emociones, muy buenas para los que acaban ganando y muy duras para los que pierden. Sobre todo para esos jugadores que fallan su penalti.");
        System.out.println("De hecho, algunos de ellos han arruinado sus carreras deportivas por situaciones como fallar un penalti decisivo en una final y no han sido capaces de levantar cabeza ante una situación así.");
        System.out.println(NARANJA+"\n¿Seras tu como ellos?"+RESET);
    }
}
