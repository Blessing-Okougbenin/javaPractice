package ComputerizedHealthRecords;

public class TargetHeartRate extends BMI {
    private String fullName;
    private int age;
    private DateOfBirth dob;
    private int mhr = 0;

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getMhr() {
        return mhr;
    }

    public void setMhr(int mhr) {
        this.mhr = mhr;
    }
    public DateOfBirth getDob() {
        return dob;
    }

    public void setDob(DateOfBirth dob) {
        this.dob = dob;
    }

    public TargetHeartRate(String fullName, int age, DateOfBirth dob){
        this.fullName = fullName;
        this.age = age;
        this.dob = dob;

    }
    public void maxHeartRate(){
        mhr = 220 - getAge();
        System.out.print("Your maximum heart range is: " + mhr + "bpm\n");
    }

    public void targetHeartRateRange(){
       maxHeartRate();
       double range1=  0.5 * mhr;
       double range2 = 0.85 * mhr;
       System.out.println("Your target heart rate is in the range: "+ range1 +" - "+ range2 + "bpm");
    }

    public static void main(String[] args) {
        TargetHeartRate rate = new TargetHeartRate("Blessing Eric",23,new DateOfBirth("25","11","2022"));

        display(("Full name: "+ rate.getFullName()+"\n"+
                "Age: " + rate.getAge() + "\n"+
                "D.O.B: " +rate.getDob()));
        rate.targetHeartRateRange();

    }

}
