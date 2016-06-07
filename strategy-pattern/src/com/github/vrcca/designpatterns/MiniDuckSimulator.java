package com.github.vrcca.designpatterns;

import com.github.vrcca.designpatterns.model.Duck;
import com.github.vrcca.designpatterns.model.MallardDuck;
import com.github.vrcca.designpatterns.model.ModelDuck;
import com.github.vrcca.designpatterns.model.behaviors.impl.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
