package com.github.vrcca.designpatterns.model.behaviors.impl;

import com.github.vrcca.designpatterns.model.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
