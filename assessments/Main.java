import java.io.*;

class Main {
    public static void main(String[] args) {
        splitVehiclesFile("input", "output");
    }
    public static void splitVehiclesFile(String input, String output) {
        File outputDir = new File("output");
        outputDir.mkdir();
        try {
            File inputFile = new File("C:\\Users\\dkhateeb493\\Documents\\GitHub\\random\\assessments\\input\\vehicles.csv");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            File carsFile = new File(outputDir, "cars.csv");
            File motorcyclesFile = new File(outputDir, "motorcycles.csv");
            BufferedWriter carsWriter = new BufferedWriter(new FileWriter(carsFile));
            BufferedWriter motorcycleWriter = new BufferedWriter(new FileWriter(motorcyclesFile));
            String line;
            while ((line = reader.readLine()) != null) {
                line = reader.readLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String vehicleType = parts[0].trim();
                    String make = parts[1].trim();
                    String model = parts[2].trim();
                    if ("Car".equals(vehicleType)) {
                    carsWriter.write(vehicleType + "," + make + "," + model);
                    carsWriter.newL
                }
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

class Vehicle {
  private int numWheels;
  protected String make;
  protected String model;

  protected Vehicle(int numWheels, String make, String model) {
    if (numWheels < 2) {
      throw new IllegalArgumentException("Vehicles must have at least 2 wheels");
    }
    this.numWheels = numWheels;
    this.model = model;
    this.make = make;
  }

  @Override
  public String toString() {
    return make + " " + model;
  }
}

class Car extends Vehicle {
  String transmissionType;

  public Car(String make, String model, String transmissionType) {
    super(4, make, model);
    this.transmissionType = transmissionType;
  }

  @Override
  public String toString() {
    return make + " " + model + " " + transmissionType;
  }
}

class Motorcycle extends Vehicle {
  String ridingPosture;

  public Motorcycle(String make, String model, String ridingPosture) {
    super(2, make, model);
    this.ridingPosture = ridingPosture;
  }

  public String toString() {
    return make + " " + model + " " + ridingPosture;
  }
}