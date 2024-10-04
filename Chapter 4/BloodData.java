public class BloodData {

    public static String defaultBloodType = "A";
    public static String defaultRhFactor = "-";

    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = defaultBloodType;
        this.rhFactor = defaultRhFactor;
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void defaultPatient() {
        this.bloodType = defaultBloodType;
        this.rhFactor = defaultRhFactor;
    }

    public void displayBloodInfo() {
        System.out.println("         Your blood type is: " + this.bloodType);
        System.out.println("         Your Rh Factor is: " + this.rhFactor);
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}