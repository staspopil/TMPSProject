package com.company;

import com.company.Farm.Farm;
import com.company.Farm.Warehouse;

public class Main {

    public static void main(String[] args) {
     Farm a = new Farm();
     a.revision();
     a.harvestHigh(130);
     a.revision();
     a.factoryExportHighBrequetes(12);
     a.revision();
     a.factoryExportHighBrequetes(3);
    }
}
