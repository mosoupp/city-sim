package org.example.citysim.utils.OperationalBuilding;

import org.example.citysim.utils.Building;

public abstract class OperationalBuilding extends Building {
    protected int minWorkerCount;
    protected int maxWorkerCount;
    protected int workerCount;


    public int getMinWorkerCount() {
        return minWorkerCount;
    }

    public void setMinWorkerCount(int minWorkerCount) {
        this.minWorkerCount = minWorkerCount;
    }

    public int getMaxWorkerCount() {
        return maxWorkerCount;
    }

    public void setMaxWorkerCount(int maxWorkerCount) {
        this.maxWorkerCount = maxWorkerCount;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }
}
