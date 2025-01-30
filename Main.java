
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        give_citation("Quaking");

        //City mexico_city = new City("Mexico City", 9000000);
        City mexico_city = new City();
        City ciudad_de_mexico = new City("Ciudad de México", 9200000);
        mexico_city.setName("Ciudad de México");
        mexico_city.setPopulation(9200000);
        System.out.println(mexico_city.getName() + " has a population of " + mexico_city.getPopulation());
        System.out.println(ciudad_de_mexico.toString());
        System.out.println(mexico_city.equals(ciudad_de_mexico));
        
    }

    public static String fine(double fine_amount) {
        return "You were fined: $" + fine_amount + ".";
    }

    public static void give_citation(String Violation) {
        if (Violation == "Speeding") {
            System.out.println( "You were given a Speeding Citation.\n" + fine(6.0));
        }
        else if (Violation == "Theft") {
            System.out.println("You were convicted of Theft.\n" + fine(8.0));
        }
        else if (Violation == "Arson") {
            System.out.println("You were convicted of Arson.\n" + fine(2.0));
        }
        else {
            System.out.println("You were convict of a miscellaneous crime, noted as " + Violation + ".");
        }

    }
}