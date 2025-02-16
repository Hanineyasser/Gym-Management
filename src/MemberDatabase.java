
public class MemberDatabase extends Database<Member> {

    public MemberDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Member createRecordFrom(String record) {
        String[] fields = record.split(",");
        String memberId = fields[0].trim();
        String memberName = fields[1].trim();
        String membershipType = fields[2].trim();
        String memberEmail = fields[3].trim();
        String memberPhone = fields[4].trim();
        String memberStatus = fields[5].trim();
        return new Member(memberId, memberName, membershipType, memberEmail, memberPhone, memberStatus);
    }

}
