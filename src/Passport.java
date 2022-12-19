public class Passport {
    private long numPassport;
    private String lastName;
    private String firstName;
    private String midlName;
    private String dateBD;

    public Passport(long numPassport, String lastName, String firstName, String midlName, String dateBD) {
        this.numPassport = numPassport;
        if (lastName != null && !lastName.isEmpty() && !lastName.isBlank()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException();
        }
        if (firstName != null && !firstName.isEmpty() && !firstName.isBlank()) {
            this.firstName = firstName;
        }
        this.midlName = midlName;
        if (dateBD != null && !dateBD.isEmpty() && !dateBD.isBlank()) {
            this.dateBD = dateBD;
        }
    }

    public long getNumPassport() {
        return numPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidlName() {
        return midlName;
    }

    public String getDateBD() {
        return dateBD;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numPassport=" + numPassport +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", midlName='" + midlName + '\'' +
                ", dateBD='" + dateBD + '\'' +
                '}';
    }
}