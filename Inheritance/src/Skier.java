public class Skier extends Sportsman{

    public Skier(String name, String team) {
        super(name, team);
    }

    public void skiing(){
        System.out.println("Спортсмен " + getName() + " бегает на лыжах.");
    }
}
