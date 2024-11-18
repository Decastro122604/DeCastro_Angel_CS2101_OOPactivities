// Dancer.java
public class Dancer extends Artist {
    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, DanceStyle danceStyle) {
        super(name, age, "Dancing");
        this.danceStyle = danceStyle;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDance Style: " + danceStyle;
    }
}
