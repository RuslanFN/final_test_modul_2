package services;

import models.Animal;
import models.TypeAnimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface AnimalServiceInterface {
;
    void createAnimal(int yearBirth, int monthBirth, String Name, TypeAnimal type);
    Animal getChooseAnimal();
    Animal removeAnimal(Animal animal);
    void removeChooseAnimal();
    Animal findAnimal(String name, TypeAnimal type);
    void learnCommand(String command, String execute);
    void executeCommand(String command);
    ArrayList<Animal> getListAnimals();
}
