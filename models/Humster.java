package models;

import java.util.Date;

public class Humster extends Animal{
    @Override
    public String toString() {
        return "Humster{} " + super.toString();
    }

    public Humster(Date birthDate, String Name) {
        super(birthDate, Name);
    }
}
