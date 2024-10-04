package models;

import java.util.Date;

public class Hourse extends PackAnimal{
    @Override
    public String toString() {
        return "Hourse{} " + super.toString();
    }

    public Hourse(Date birthDate, String Name) {
        super(birthDate, Name);
    }
}
