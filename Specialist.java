public class Specialist {
    private String name;
    private String profession;
    private Rating rating;

    public Specialist(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", rating=" + rating +
                '}';
    }
}
