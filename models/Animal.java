package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements AnimalCommand{
    private Date birthDate;
    private String Name;
    private Map<String, String> commands;

    Animal(Date birthDate, String Name){
        SimpleDateFormat dateFormat = new SimpleDateFormat("y MM");
        this.Name = Name;
        this.birthDate = birthDate;
        commands = new HashMap<>();
    }

    @Override
    public String toString() {
        return "models.Animal{" +
                "birthDate=" + birthDate +
                ", Name='" + Name + '\'' +
                ", commands=" + commands +
                '}';
    }

    @Override
    public void executeCommand(String command) {
        if (commands.containsKey(command)){
            System.out.println(this.getName() + ": " + commands.get(command));
        }else{
            System.out.println("Не знаю такой команды");
        }

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return Name;
    }

    public Map<String, String> getCommands() {
        return commands;
    }

    @Override
    public void learnCommand(String command, String execute) {
        commands.put(command, execute);
    }

}
