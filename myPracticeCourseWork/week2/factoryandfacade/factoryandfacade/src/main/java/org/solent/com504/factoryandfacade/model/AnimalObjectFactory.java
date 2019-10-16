package org.solent.com504.factoryandfacade.model;

import org.solent.com504.factoryandfacade.springimpl.FarmFacadeSpringImpl;

public class AnimalObjectFactory{

    public static Animal createCat() {
        return new Cat();
    }

    public static Animal createDog() {
        return new Dog();
    }

    public static Animal createCow() {
        return new Cow();
    }

    public static FarmFacade createFarmFacade() {
        return new FarmFacadeSpringImpl();
    }
}
