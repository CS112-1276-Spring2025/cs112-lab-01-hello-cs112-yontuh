public class City {
    String name;
    long population;

    City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String toString() {
        return name + " " + population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public long getPopulation() {
        return this.population;
    }

    public City() {
        this.name = "Unset";
        this.population = 0;
    }

    public boolean equals(Object obj) {
        City other = (City) obj;
        return this.name.equals(other.getName()) && this.population == other.getPopulation();
    }
}
