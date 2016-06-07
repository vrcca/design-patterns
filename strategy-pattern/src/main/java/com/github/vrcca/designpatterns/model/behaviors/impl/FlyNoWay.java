package com.github.vrcca.designpatterns.model.behaviors.impl;

import com.github.vrcca.designpatterns.model.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
