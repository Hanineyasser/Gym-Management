
import java.time.LocalDate;

public class MemberClassRegistrationDatabase extends Database<MemberClassRegistration> {

    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public MemberClassRegistration createRecordFrom(String record) {
        String[] fields = record.split(",");
        String memberId = fields[0].trim();
        String classId = fields[1].trim();
        LocalDate registrationDate = LocalDate.parse(fields[2].trim());
        String status = fields[3].trim();
        return new MemberClassRegistration(memberId, classId, status, registrationDate);
    }

}
