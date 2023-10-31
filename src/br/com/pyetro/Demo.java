package br.com.pyetro;

public class Demo {
    public static void main(String[] args){
        Warehouse client = new Warehouse("A", false);
        DistributionCenter distributionCenter = getDistributionCenter(client);
        AirMail airMail = distributionCenter.createAirMail(client.getGradeRequest());
        airMail.checkedCargo();
    }
    private static DistributionCenter getDistributionCenter(Warehouse client){
        if(client.hasWarehouseContract()){
            return new ContractWarehouse();
        } else {
            return new NoContractWarehouse();
        }
    }
}
