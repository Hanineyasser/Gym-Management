public class Member extends General {
    private final String membershipType;
    private final String name;
    private final String email;
    private final String phone;
    private final String status;


    public Member(String id, String name,String membershipType, String email, String phone, String status) {
        super(id);
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.membershipType = membershipType;
    }

    public String lineRepresentation() {
        return (super.getSearchKey() + "," + this.name + "," + this.membershipType+","+ this.email + "," + this.phone + ","+this.status);
    }
}
