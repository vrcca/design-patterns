package com.github.vrcca.designpatterns.model;

import com.github.vrcca.designpatterns.model.behaviors.impl.FlyNoWay;
import com.github.vrcca.designpatterns.model.behaviors.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
