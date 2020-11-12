package Geography;

public class GovernedRegion {
    public String name;        //Name of the Region.
    public String area;        //Name of the Area it belongs to.
    public int population;     //Population Count of the Region.
    public String fog;         //The Form of Government practiced in the Region.

    //Constructor for Governed Region.
    public GovernedRegion(String name, String area, int population, String fog) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.fog = fog;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFog() {
        return fog;
    }

    public void setFog(String fog) {
        this.fog = fog;
    }
}
