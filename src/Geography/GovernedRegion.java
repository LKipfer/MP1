package Geography;

public class GovernedRegion {
    private String name;        //Name of the Region.
    private String area;        //Name of the Area it belongs to.
    private int population;     //Population Count of the Region.
    private String fog;         //The Form of Government practiced in the Region.


    public GovernedRegion(String name, String area, int population, String fog) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.fog = fog;
    }


    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public String getFog() {
        return fog;
    }
}
