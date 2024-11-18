// Writer.java
public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, WritingStyle writingStyle) {
        super(name, age, "Writing");
        this.writingStyle = writingStyle;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWriting Style: " + writingStyle;
    }
}
