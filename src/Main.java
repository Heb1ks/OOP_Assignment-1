public class Main {
    public static void main(String[] args) {
        Sport football = new Sport("Football", "Team", "Two teams compete to score goals.");
        Sport tennis = new Sport("Tennis", "Individual", "Players hit the ball over the net to score points.");

        Player player1 = new Player(1, "Gleb", 24, "Football");
        Player player2 = new Player(2, "Ali", 30, "Tennis");

        SportsClub club = new SportsClub("Arsenal", "Arsenal Football Club" + "Highbury House" + "75 Drayton Park" + "London,");

        club.addSport(football);
        club.addSport(tennis);
        club.registerPlayer(player1);
        club.registerPlayer(player2);

        club.displayClubDetails();
        System.out.println();

        football.displayInfo();
        System.out.println();

        player1.displayProfile();
        System.out.println();

        club.listPlayersBySport("Football");

        if (player1.getAge() > player2.getAge()) {
            System.out.println(player1.getName() + " Older " + player2.getName());
        } else if (player1.getAge() < player2.getAge()) {
            System.out.println(player2.getName() + " Younger " + player1.getName());
        } else {
            System.out.println(player1.getName() + " and " + player2.getName() + " same");
        }
    }
}
