package com.github.vrcca.designpatterns.model.behaviors.impl;

import com.github.vrcca.designpatterns.model.behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flywing with a rocket!");
    }
}
