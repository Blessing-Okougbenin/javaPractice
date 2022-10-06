package Chapter14;

public class RegexExamples {

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[+]?234-?0?[7-9][0-1]\\d{8}|0[7-9][0-1]\\d{8}");
    }
    public static boolean validateEmail(String email){
        return email.matches("[aA-z]@[gmail][.com]{20}");
    }
}
