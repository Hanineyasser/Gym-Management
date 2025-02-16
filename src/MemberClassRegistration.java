import java.time.LocalDate;

public class MemberClassRegistration extends General{
    private final String memberId;
    private final String classId;
    private String status;
    private final LocalDate registrationDate;

    public MemberClassRegistration(String memberId, String classId, String status, LocalDate registrationDate) {
        super(memberId + classId);
        this.memberId = memberId;
        this.classId = classId;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public String lineRepresentation() {
        return (this.memberId + "," + this.classId +  "," + this.registrationDate+","+ this.status );
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getMemberId() {
        return this.memberId;
    }

    public String getClassId() {
        return this.classId;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }
}
