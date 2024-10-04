package views;

import models.Animal;

import java.util.ArrayList;

public interface ViewInterface {
    void printStart();
    void printFunctionList();
    void printAnimalList(ArrayList<Animal> animals);
    void printChooseAnimal(Animal animal);
    void printAskNewAnimal();
    void printAskFindAnimal();
}
