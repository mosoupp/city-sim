package org.example.citysim.utils.StorageBuilding;

import org.example.citysim.utils.Building;

public abstract class StorageBuilding extends Building {

    protected int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int x) {
        this.capacity = x;
    }
}

