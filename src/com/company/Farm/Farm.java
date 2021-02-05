package com.company.Farm;

public class Farm {
    Warehouse warehouse = Warehouse.getInstance();

    private SortMachine a = new SortMachine();
    private SortMachine b = new SortMachine();


    public void harvestHigh(int quantity){
        warehouse.importHigh(quantity);
    }


    public void factoryExportHighBrequetes(int quantity){
        if (warehouse.getTenKgHighGradeBriquettePackages()>=quantity) {
            warehouse.tenHighBrequeteExport(quantity);
        }
        else{
            a.SortHighIntoTenKgBrequete(quantity*10);
            warehouse.tenHighBrequeteExport(quantity);
        }
    }

    public void revision(){
        warehouse.showQuantity();
    }


}
