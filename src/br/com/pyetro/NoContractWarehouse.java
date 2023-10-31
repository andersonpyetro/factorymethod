package br.com.pyetro;

public class NoContractWarehouse extends DistributionCenter{
    @Override
    AirMail acessInfoAirMail(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Drone(200,"Full","78969.");
        }else{
            return null;
        }
    }

    @Override
    GroundMail acessInfoGroundMail(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Truck(1000,"Full","412314123");
        } else {
            return null;
        }
    }
}
