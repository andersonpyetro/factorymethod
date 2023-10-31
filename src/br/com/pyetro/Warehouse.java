package br.com.pyetro;

public class Warehouse {

    private String gradeRequest;
    private boolean hasWarehouseContract;

    public Warehouse(String gradeRequest, boolean hasWarehouseContract) {
        this.gradeRequest = gradeRequest;
        this.hasWarehouseContract = hasWarehouseContract;
    }
    public boolean hasWarehouseContract(){
        return hasWarehouseContract;
    }

    public String getGradeRequest(){
        return gradeRequest;
    }

}
