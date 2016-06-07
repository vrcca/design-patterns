package com.github.vrcca.designpatterns.model;

import com.github.vrcca.designpatterns.model.behaviors.impl.FlyWithWings;
import com.github.vrcca.designpatterns.model.behaviors.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
