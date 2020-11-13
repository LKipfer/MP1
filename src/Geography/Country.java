package Geography;

public class Country extends GovernedRegion {

    private String listOfStates = "None";

    public Country(int id, String name, int area, int population, String fog, String listOfStates) {
        super(id,name, area, population, fog);
        this.listOfStates = listOfStates;
    }

    public String getListOfStates()
    {
        return this.listOfStates;
    }

    public void SetListOfStates(String listOfStates)
    {
        this.listOfStates = listOfStates;
    }
}
