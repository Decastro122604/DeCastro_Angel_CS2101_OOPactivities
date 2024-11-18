// Main.java
public class Main {
    public static void main(String[] args) {
        // Base Artist
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        System.out.println(artist);

        // Singer
        Singer singer = new Singer("Nayeon Im", 29, Singer.Genre.POP);
        System.out.println("\n" + singer);

        // Painter
        Painter painter = new Painter("Vincent", 40, Painter.Medium.OIL);
        System.out.println("\n" + painter);

        // Writer
        Writer writer = new Writer("Jane Doe", 35, Writer.WritingStyle.FICTION);
        System.out.println("\n" + writer);

        // Dancer
        Dancer dancer = new Dancer("Mia", 25, Dancer.DanceStyle.BALLET);
        System.out.println("\n" + dancer);
    }
}
