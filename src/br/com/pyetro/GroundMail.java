package br.com.pyetro;

public abstract class GroundMail {

    private int cargoWeight;
    private String fuelSource;
    private String vehicleCode;

    public GroundMail (int cargoWeight, String fuelSource, String vehicleCode){
        this.cargoWeight = cargoWeight;
        this.fuelSource = fuelSource;
        this.vehicleCode = vehicleCode;
    }

    public void checkedCargo(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The" + fuelSource + "engine has been started, and is ready to delivery the cargo " + cargoWeight + "pounds.n");
    }

    public void loadedCargo(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The cargo it's loaded and the " + vehicleCode.toLowerCase() + "is ready to get the road with it.");
    }

    public void fuelVehicle(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The vehicle is being filled with " + fuelSource.toLowerCase());
    }
}
