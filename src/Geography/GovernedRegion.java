package Geography;

public class GovernedRegion {
    private int id;          //Entry ID.
    private String name;     //Name of the Region.
    private int area;        //Name of the Area it belongs to.
    private int population;  //Population Count of the Region.
    private String fog;      //The Form of Government practiced in the Region.

    //Constructor for Governed Region.
    public GovernedRegion(int id,String name, int area, int population, String fog) {
        this.id=id;
        this.name = name;
        this.area = area;
        this.population = population;
        this.fog = fog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
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
