abstract class EnergyResource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergyResource(int id, String name, double energy) {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kW");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println();
    }
}

class SolarEnergy extends EnergyResource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergyResource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class Energy {
    public static void main(String[] args) {
        EnergyResource solar =
            new SolarEnergy(101, "Solar Energy", 4000);

        EnergyResource wind =
            new WindEnergy(102, "Wind Energy", 6000);

        System.out.println("Solar Energy Details:");
        solar.displayDetails();

        System.out.println("Wind Energy Details:");
        wind.displayDetails();
    }
}