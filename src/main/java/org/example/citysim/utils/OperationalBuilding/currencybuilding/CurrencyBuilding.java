package org.example.citysim.utils.OperationalBuilding.currencybuilding;

import org.example.citysim.utils.OperationalBuilding.OperationalBuilding;
/**
 * Abstract class for Currency buildings
 * has a currencyProdRate
 */
public abstract class CurrencyBuilding extends OperationalBuilding {
    /**
     * Rate at which currency is produced
     */
    protected int currencyProdRate;

    /**
     * Get rate at which currency is produced
     * @return rate at which currency is produced
     */
    public int getCurrencyProdRate() {
        return currencyProdRate;
    }

    /**
     * Set rate at which currency is produced
     * @param currencyProdRate the rate at which currency is produced
     */
    public void setCurrencyProdRate(int currencyProdRate) {
        this.currencyProdRate = currencyProdRate;
    }
}
