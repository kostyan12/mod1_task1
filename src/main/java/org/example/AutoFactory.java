package org.example;

public class AutoFactory {
    public int getProdSize() {
        return prodSize;
    }

    public void setProdSize(int prodSize) {
        this.prodSize = prodSize;
    }

    private int prodSize;

    private ProductionLine productionLine;

    public AutoFactory(int prodSize, ProductionLine productionLine) {
        this.prodSize = prodSize;
        this.productionLine = productionLine;
    }

    public void runProduction(){
        int autosBuilt = 0;
        while (autosBuilt < prodSize){
            productionLine.work();
            autosBuilt ++;

        }

    }
}
