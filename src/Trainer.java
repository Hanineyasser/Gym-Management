public class Trainer extends General {
    private final String name;
    private final String email;
    private final String phone;
    private final String Specialty;

    public Trainer(String id, String name, String email, String phone, String Specialty) {
        super(id);
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.Specialty = Specialty;

    }

    public String lineRepresentation() {
        return (super.getSearchKey() + "," + this.name + "," + this.email + "," + this.Specialty + "," + this.phone);
    }

}


