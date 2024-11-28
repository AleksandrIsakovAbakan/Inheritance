public class Sportsman {

    private String name;
    private String team;

    public Sportsman(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void generalActionAthlete(){
        System.out.println("Спортсмен " + name + " играет в " + team + ".");
    }
}
