package models;

import java.util.Date;

public class Dog extends HomeAnimal{
    public Dog(Date birthDate, String Name) {
        super(birthDate, Name);
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
