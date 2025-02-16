import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class TrainerRole {
    private final MemberDatabase memberDatabase;
    private final ClassDatabase classDatabase;
    private final MemberClassRegistrationDatabase registrationDatabase;

    public TrainerRole() {
        memberDatabase = new MemberDatabase("Members.txt");
        classDatabase = new ClassDatabase("Class.txt");
        registrationDatabase = new MemberClassRegistrationDatabase("Registration.txt");

    }

    public void addMember(String memberId, String name,String membershipType, String email, String phoneNumber, String address) {
        if (memberDatabase.contains(memberId)) {
            System.out.println("Member already exists");
            return;
        }
        Member newMember = new Member(memberId, name, membershipType,email, phoneNumber, address);
        memberDatabase.insertRecord(newMember);
    }

    public void addClass(String classId, String className, String trainerId, int duration, int availableSeats) {
        if (classDatabase.contains(classId)) {
            System.out.println("Class already exists");
            return;
        }
        Class newClass = new Class(classId, className, trainerId, duration, availableSeats);
        classDatabase.insertRecord(newClass);
    }

    public ArrayList<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public ArrayList<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberId, String classId, LocalDate registrationDate) {
        if (!memberDatabase.contains(memberId)) {
            System.out.println("Member does not exist");
            return false;
        }
        if (!classDatabase.contains(classId)) {
            System.out.println("Class does not exist");
            return false;
        }
        if (registrationDatabase.contains(memberId + classId)) {
            System.out.println("Member already registered for this class");
            return false;
        }
        if (classDatabase.getRecord(classId).getAvailableSeats() == 0) {
            System.out.println("Class is full");
            return false;
        }
        MemberClassRegistration newRegistration = new MemberClassRegistration(memberId, classId, "active", registrationDate);
        registrationDatabase.insertRecord(newRegistration);
        classDatabase.getRecord(classId).setAvailableSeats(classDatabase.getRecord(classId).getAvailableSeats() - 1);
        return true;

    }

    public boolean cancelRegistration(String memberId, String classId) {
        MemberClassRegistration registration = registrationDatabase.getRecord(memberId + classId);
        if (registration == null) {
            System.out.println("Registration not found");
            return false;
        }

        LocalDate registrationDate = registration.getRegistrationDate();
        LocalDate currentDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(registrationDate, currentDate);

        if (daysBetween > 3) {
            System.out.println("Cancellation period has expired.");
            return false;
        }
        registration.setStatus("cancelled");

        Class registeredClass = classDatabase.getRecord(classId);
        registeredClass.setAvailableSeats(registeredClass.getAvailableSeats() + 1);
        registrationDatabase.deleteRecord(registration.getSearchKey());
        return true;
    }

    public ArrayList<MemberClassRegistration> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }


    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }
}
