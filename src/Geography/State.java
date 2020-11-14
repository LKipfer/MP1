package Geography;

public class State extends GovernedRegion{

    private String belongingCountry = "None";

    public State(int id, String name, int area, int population, String fog, String belongingCountry)
    {
        super(id, name, area, population, fog);
        this.belongingCountry = belongingCountry;
    }

    public String getBelongingCountry() {
        return belongingCountry;
    }

    public void setBelongingCountry(String belongingCountry) {
        this.belongingCountry = belongingCountry;
    }
}
