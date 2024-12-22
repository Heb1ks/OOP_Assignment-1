import java.util.ArrayList;

public class SportsClub {
    private String name;
    private String address;
    private ArrayList<Sport> sports;
    private ArrayList<Player> players;

    public SportsClub(String name, String address) {
        this.name = name;
        this.address = address;
        this.sports = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addSport(Sport sport) {
        sports.add(sport);
    }

    public void registerPlayer(Player player) {
        players.add(player);
    }

    public void displayClubDetails() {
        System.out.println("Sports Club: " + name);
        System.out.println("Address: " + address);
        System.out.println("Available Sports:");
        for (Sport sport : sports) {
            System.out.println("- " + sport.getName());
        }
        System.out.println("Registered Players: " + players.size());
    }

    public void listPlayersBySport(String sportName) {
        System.out.println("Players in " + sportName + ":");
        for (Player player : players) {
            if (player.getSport().equalsIgnoreCase(sportName)) {
                System.out.println("- " + player.getName());
            }
        }
    }
}
