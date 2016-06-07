package com.github.vrcca.designpatterns.model.interfaces;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
