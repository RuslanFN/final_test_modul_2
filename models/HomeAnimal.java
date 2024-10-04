package models;

import java.util.Date;

public class HomeAnimal extends Animal{
    @Override
    public String toString() {
        return "models.HomeAnimal{} " + super.toString();
    }

    public HomeAnimal(Date birthDate, String Name) {
        super(birthDate, Name);
    }
}
