import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//T extends general so that it can access getSearchKey and getLineRepresentation
public abstract class Database<T extends General> {
    private ArrayList<T> records;
    private String fileName;

    public Database(String fileName) {
        this.records = new ArrayList<>();
        this.fileName = fileName;
        this.readFromFile();
    }

    public abstract T createRecordFrom(String record);

    public void readFromFile() {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                if(record.equals("\n")){
                    continue;
                }
                records.add(createRecordFrom(record));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<T> returnAllRecords() {
        return this.records;
    }

    public Boolean contains(String key) {
        for (T record : this.records) {
            if (Objects.equals(record.getSearchKey(), key)) {
                return true;
            }
        }
        return false;
    }

    public T getRecord(String key) {
        for (T record : this.records) {
            if (Objects.equals(record.getSearchKey(), key)) {
                return record;
            }
        }
        return null;
    }

    public void insertRecord(T record) {
        if (contains(record.getSearchKey())) {
            return;
        }
        this.records.add(record);
    }

    public void deleteRecord(String key) {
        for (T record : this.records) {
            if (Objects.equals(record.getSearchKey(), key)) {
                this.records.remove(record);
                return;
            }
        }

    }

    public void saveToFile()
    {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (T record : records) {
                fileWriter.write(record.lineRepresentation() + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
}
}