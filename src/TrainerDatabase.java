public class TrainerDatabase extends Database<Trainer> {

    public TrainerDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Trainer createRecordFrom(String record) {
        String[] fields = record.split(",");
        String trainerId = fields[0].trim();
        String trainerName = fields[1].trim();
        String trainerEmail = fields[2].trim();
        String trainerSpecialty = fields[3].trim();
        String trainerPhone = fields[4].trim();
        return new Trainer(trainerId, trainerName, trainerEmail, trainerPhone, trainerSpecialty);
    }
}