package models;

public interface AnimalCommand {
    void executeCommand(String command);
    void learnCommand(String command, String execute);
}
