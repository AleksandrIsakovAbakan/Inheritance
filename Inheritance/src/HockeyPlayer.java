public class HockeyPlayer extends Sportsman{

    public HockeyPlayer(String name, String team) {
        super(name, team);
    }

    public void playsDefense(){
        System.out.println("Спортсмен " + getName() + " играет в защите.");
    }
}
