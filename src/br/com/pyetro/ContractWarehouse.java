package br.com.pyetro;

public class ContractWarehouse extends DistributionCenter{
    @Override
    AirMail acessInfoAirMail(String requestedGrade) {
        if ("A".equals(requestedGrade)){
            return new AirPlane(1000,"Full","54829.");
        } else {
            return null;
        }
    }
    @Override
    GroundMail acessInfoGroundMail(String requestedGrade) {
        if ("A".equals(requestedGrade)){
            return new Van(200,"full","526933.");
        }else{
            return null;
        }
    }
}
