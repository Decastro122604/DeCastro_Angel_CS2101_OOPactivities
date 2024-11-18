// Painter.java
public class Painter extends Artist {
    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Painting");
        this.medium = medium;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedium: " + medium;
    }
}
