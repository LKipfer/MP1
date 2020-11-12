package Geography;

public class Country extends GovernedRegion {

    public String listOfStates;

    public Country(String listOfStates, String name, String area, int population, String fog) {
        super(name, area, population, fog);
        this.listOfStates = listOfStates;
    }
}
