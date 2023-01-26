public class WorldSeries {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            game();
        }
    }

    public static void game() {
        double strongerTeamWinProbStart = 0.50;
        int strongTeamWins = 0;
        int weakTeamWins = 0;

        if (strongTeamWins != 4 || weakTeamWins != 4) {
            if (Math.random() <= strongerTeamWinProbStart) {
                weakTeamWins += 1;
            } else {
                strongTeamWins += 1;
            }
        }
        System.out.println("The strong team has: " + strongTeamWins + " wins and the weak team has: " + weakTeamWins + " wins.");
    }
}
