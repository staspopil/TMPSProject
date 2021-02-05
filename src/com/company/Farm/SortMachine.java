package com.company.Farm;

public class SortMachine {



    public void SortHighIntoTwoKgBrequete(int highGradeHop){
        Warehouse.getInstance().highExport(highGradeHop);
        Warehouse.getInstance().twoBrequeteImport(highGradeHop/2);
    }

    public void SortHighIntoFiveKgBrequete(int highGradeTop){
        Warehouse.getInstance().highExport(highGradeTop);
        Warehouse.getInstance().fiveBrequeteImport(highGradeTop/5);
    }

    public void SortHighIntoTenKgBrequete(int highGradeHopKg){
        if(Warehouse.getInstance().getHighGradeHopKg()>=highGradeHopKg){
            Warehouse.getInstance().highExport(highGradeHopKg);
            Warehouse.getInstance().tenBrequeteImport(highGradeHopKg/10);
        }

    }

    public void SortHighIntoTwoKgPowder(int highGradeHop){
        Warehouse.getInstance().highExport(highGradeHop);
        Warehouse.getInstance().twoPowderImport(highGradeHop/2);
    }

    public void SortHighIntoFiveKgPowder(int highGradeHop){
        Warehouse.getInstance().highExport(highGradeHop);
        Warehouse.getInstance().fivePowderImport(highGradeHop/5);
    }

    public void SortHighIntoTenKgPowder(int highGradeHop){
        Warehouse.getInstance().highExport(highGradeHop);
        Warehouse.getInstance().tenPowderImport(highGradeHop/10);
    }

}
