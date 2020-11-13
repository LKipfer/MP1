package Geography;

public class State extends GovernedRegion{

    public String belongingCountry;

    public State(int id, String name, int area, int population, String fog, String belongingCountry) {
        super(id, name, area, population, fog);
        this.belongingCountry = belongingCountry;
    }
}
