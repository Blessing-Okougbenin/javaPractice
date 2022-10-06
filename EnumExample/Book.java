package EnumExample;

public enum Book {
    //Declare constants of enum types
    JHTP("Java How To Program", "2018"),
    CHTP("C How To Program", "2016"),
    IW3HTP("Internet & World Wide Web How To Program", "2012"),
    CPPHTP("C++ How To Program", "2017"),
    VBHTP("Visual Basic How To Proram");
    ;
    // Instance fields
    private final String title;
    private final String copyrightYear;

    //enum constructor
    Book(String title,String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    Book(String title) {
        this(title,"");
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
