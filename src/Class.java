public class Class extends General {
    private final String className;
    private final String trainerId;
    private final int duration;
    private int availableSeats;

    public Class(String classId, String className, String trainerId, int duration, int availableSeats) {
        super(classId);
        this.className = className;
        this.trainerId = trainerId;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String lineRepresentation() {
        return (super.getSearchKey() + "," + this.className + "," + this.trainerId + "," + this.duration + "," + this.availableSeats);
    }
}
