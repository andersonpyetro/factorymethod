package br.com.pyetro;

public abstract class DistributionCenter {
    public AirMail createAirMail(String requestedGrade) {
        AirMail airMail = acessInfoAirMail(requestedGrade);
        airMail = prepareDeliveryAirMail(airMail);
        return airMail;
    }

    private AirMail prepareDeliveryAirMail(AirMail airMail){
        airMail.checkedCargo();
        airMail.fuelVehicle();
        airMail.loadedCargo();
        return airMail;
    }
    abstract AirMail acessInfoAirMail(String requestedGrade);

    public GroundMail createGroundMail(String requestedGrade){
        GroundMail groundMail = acessInfoGroundMail(requestedGrade);
        groundMail = prepareDeliveryGroundMail(groundMail);
        return groundMail;
    }

    private GroundMail prepareDeliveryGroundMail(GroundMail groundMail) {
        groundMail.checkedCargo();
        groundMail.loadedCargo();
        groundMail.fuelVehicle();
        return groundMail;

    }

    abstract GroundMail acessInfoGroundMail(String requestedGrade);
}