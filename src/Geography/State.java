package Geography;

public class State extends GovernedRegion{

    public String belongingState;

    public State(int id, String belongingState, String name, int area, int population, String fog) {
        super(id, name, area, population, fog);
        this.belongingState = belongingState;
    }
}
