package com.company.Farm;

public class Warehouse {

    private static volatile Warehouse instance;

    private int highGradeHopKg = 0;
    private int mediumGradeHopKg = 0;
    private int lowGradeHopKg = 0;
    private int tenKgHighGradeBriquettePackages = 0;
    private int twoKgHighGradePowderPackages = 0;
    private int fiveKgHighGradePowderPackages = 0;
    private int tenKgHighGradePowderPackages = 0;
    private int twoKgHighGradeBriquettePackages = 0;
    private int fiveKgHighGradeBriquettePackages = 0;

    public int getTenKgHighGradeBriquettePackages() {
        return tenKgHighGradeBriquettePackages;
    }
    public int getHighGradeHopKg() { return highGradeHopKg; }


    private Warehouse(){
    }
                    ////IMPORT METHODS

    //import Hop
    public void importHigh(int quantity)
    {
        this.highGradeHopKg+=quantity;
        System.out.println(quantity+"kg High Grade Hop was Imported");
    }



    //import Brequetes
    public void twoBrequeteImport(int quantity){
        twoKgHighGradeBriquettePackages+=quantity;
    }

    public void fiveBrequeteImport(int quantity){
        fiveKgHighGradeBriquettePackages+=quantity;
    }

    public void tenBrequeteImport(int quantity){
        tenKgHighGradeBriquettePackages+=quantity;
        System.out.println(quantity+"packages of 10kg High Grade Hop Brequetes was Imported");
    }

    //import Powder
    public void twoPowderImport(int quantity){
        twoKgHighGradePowderPackages+=quantity;
    }

    public void fivePowderImport(int quantity){
        fiveKgHighGradePowderPackages+=quantity;
    }

    public void tenPowderImport(int quantity){
        tenKgHighGradePowderPackages+=quantity;
    }

    ////EXPORT Methods

    public void highExport(int quantity){
        if(this.highGradeHopKg>=quantity){
            this.highGradeHopKg=this.highGradeHopKg-quantity;
            System.out.println(quantity+"kg High Grade Hop was Exported");
        }
        else {
            System.out.println("Not Enough High Grade Hop");
        }
    }

    public void tenHighBrequeteExport(int quantity){
        if (this.tenKgHighGradeBriquettePackages>=quantity){
        this.tenKgHighGradeBriquettePackages-=quantity;
        System.out.println(quantity+"packages of 10kg High Grade Hop Brequetes was Exported");
        }
        else{
            System.out.println("Not Enough High Grade TenKg-Packages of Briquets: "+(quantity-this.tenKgHighGradeBriquettePackages));
        }
    }

    public void showQuantity(){
        System.out.println("high=" + this.highGradeHopKg+ " High Brequetes: " +this.tenKgHighGradeBriquettePackages);
    }


    public static Warehouse getInstance() {

        Warehouse result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Warehouse.class) {
            if (instance == null) {
                instance = new Warehouse();
            }
            return instance;
        }
    }


}
