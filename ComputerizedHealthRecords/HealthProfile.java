package ComputerizedHealthRecords;

public class HealthProfile extends BMI{


    public static void main(String[] args) {
        HealthProfile profile = new HealthProfile();
        profile.calculateBmi();

        TargetHeartRate rate = new
                TargetHeartRate(profile.getFullName(),profile.getAge(),
                new DateOfBirth("7","2","2011"));
        rate.targetHeartRateRange();

    }
}
