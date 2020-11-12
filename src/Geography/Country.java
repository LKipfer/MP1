package Geography;

public class Country extends GovernedRegion {

    public String listOfStates;

    public Country(int id, String listOfStates, String name, int area, int population, String fog) {
        super(id,name, area, population, fog);
        this.listOfStates = listOfStates;
    }
}
