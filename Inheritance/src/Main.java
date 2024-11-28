public class Main {

    public static void main(String[] args) {

        Footballer footballerOne = new Footballer("Ivan", "Zenit");
        System.out.println(footballerOne);
        System.out.println(footballerOne.getName());
        System.out.println(footballerOne.getTeam());
        footballerOne.scoringGoals();
        footballerOne.generalActionAthlete();

        Footballer footballerTwo = new Footballer("Petr", "Rostov");
        System.out.println(footballerTwo);
        System.out.println(footballerTwo.getName());
        System.out.println(footballerTwo.getTeam());
        footballerTwo.scoringGoals();
        footballerTwo.generalActionAthlete();

        HockeyPlayer hockeyPlayerOne = new HockeyPlayer("Oleg", "CSKA");
        System.out.println(hockeyPlayerOne);
        System.out.println(hockeyPlayerOne.getName());
        System.out.println(hockeyPlayerOne.getTeam());
        hockeyPlayerOne.playsDefense();
        hockeyPlayerOne.generalActionAthlete();

        HockeyPlayer hockeyPlayerTwo = new HockeyPlayer("Sergei", "Dinamo");
        System.out.println(hockeyPlayerTwo);
        System.out.println(hockeyPlayerTwo.getName());
        System.out.println(hockeyPlayerTwo.getTeam());
        hockeyPlayerTwo.playsDefense();
        hockeyPlayerTwo.generalActionAthlete();

        Skier skierOne = new Skier("Olga", "Legs of steel");
        System.out.println(skierOne);
        System.out.println(skierOne.getName());
        System.out.println(skierOne.getTeam());
        skierOne.skiing();
        skierOne.generalActionAthlete();

        Skier skierTwo = new Skier("Lena", "Fast turtles");
        System.out.println(skierTwo);
        System.out.println(skierTwo.getName());
        System.out.println(skierTwo.getTeam());
        skierTwo.skiing();
        skierTwo.generalActionAthlete();

    }
}
