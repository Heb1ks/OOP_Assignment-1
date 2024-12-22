public class Player {
    private int id;
    private String name;
    private int age;
    private String sport;

    public Player(int id, String name, int age, String sport) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void displayProfile() {
        System.out.println("Player ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sport: " + sport);
    }
}
