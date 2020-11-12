package Geography;

public class State extends GovernedRegion{

    public String belongingState;

    public State(String belongingState, String name, String area, int population, String fog) {
        super(name, area, population, fog);
        this.belongingState = belongingState;
    }
}
