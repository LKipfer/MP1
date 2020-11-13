package Geography;

public class State extends GovernedRegion{

    public String belongingCountry;

    public State(int id, String belongingCountry, String name, int area, int population, String fog) {
        super(id, name, area, population, fog);
        this.belongingCountry = belongingCountry;
    }
}
