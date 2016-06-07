package com.github.vrcca.designpatterns.model;


import com.github.vrcca.designpatterns.utils.StringUtils;

public abstract class Beverage {
    String description = "Unknown Beverage";
    private BeverageSize size = BeverageSize.TALL;

    public String getDescription() {
        return StringUtils.capitalize(size.name()) + " " + description;
    }

    public abstract double cost();

    public BeverageSize getSize() {
        return size;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
    }
}
