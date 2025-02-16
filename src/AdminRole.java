import java.util.ArrayList;

public class AdminRole {
    private final TrainerDatabase database;

    public AdminRole() {
        this.database = new TrainerDatabase("Trainers.txt");
    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        if (this.database.contains(trainerId)) {
            System.out.println("Trainer already exists");
            return;
        }
        Trainer newTrainer = new Trainer(trainerId, name, email, phoneNumber, specialty);
        this.database.insertRecord(newTrainer);

    }

    public ArrayList<Trainer> getListOfTrainers() {
        return this.database.returnAllRecords();
    }

    public void removeTrainer(String key) {
        if (!this.database.contains(key)) {
            System.out.println("Trainer does not exist");
            return;
        }
        this.database.deleteRecord(key);
        logout();

    }

    public void logout() {
        this.database.saveToFile();
    }
}
