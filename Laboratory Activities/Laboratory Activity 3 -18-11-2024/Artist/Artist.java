// Artist.java
public class Artist {
    private String name;
    private int age;
    private String specialty;

    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Artist Name: " + name + "\nAge: " + age + "\nSpecialty: " + specialty;
    }
}
