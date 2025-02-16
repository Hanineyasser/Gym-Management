

public class ClassDatabase extends Database<Class> {

    public ClassDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Class createRecordFrom(String record) {
        String[] fields = record.split(",");
        String classId = fields[0].trim();
        String className = fields[1].trim();
        String trainerId = fields[2].trim();
        int classDuration = Integer.parseInt(fields[3].trim());
        int availableSeats = Integer.parseInt(fields[4].trim());
        return new Class(classId, className, trainerId, classDuration, availableSeats);
    }



}
