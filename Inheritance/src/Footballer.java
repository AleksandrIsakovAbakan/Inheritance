public class Footballer extends Sportsman{

    public Footballer(String name, String team) {
        super(name, team);
    }

    public void scoringGoals(){
        System.out.println("Спортсмен " + getName() + " забивает голы.");
    }
}
