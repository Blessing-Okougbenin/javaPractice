package Chapter8;

public class OverloadedConstructors {
    private int hour;
    private int minute;
    private int second;
    // No-argument constructor- Initializes each instance variable to zero
    public OverloadedConstructors() {
    this(0,0,0);
    }
    //hour supplied
    public OverloadedConstructors(int hour) {
        this( hour,0,0);

    }
    //hour and minute supplied
    public OverloadedConstructors(int hour,  int minute) {
         this(hour,minute,0);
    }
    // hour, minute and second supplied
    public OverloadedConstructors(int hour,int minute,int second){
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be btw 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be btw 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be btw 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    // Another OverloadedConstructors supplied
    // A constructor that receives a reference to another of this class'
    //object. The argument object’s values are passed to the three-argument constructor
    // to initialize the hour, minute and second. Line 46 directly accesses the hour, minute and second
    //values of the argument time with the expressions time.hour, time.minute and
    //time.second—even though hour, minute and second are declared as private variables of
    //class Time2. This is due to a special relationship between objects of the same class.

    // When one object of a class has a reference to another object of the same class, the first object
    //can access all the second object’s data and methods (including those that are private).

    public OverloadedConstructors(OverloadedConstructors time) {
        //Invoke constructor with three arguments
        this(time.hour, time.minute,time.second);
    }
    //There are four delegating constructors here; 1,2,3 and 5
    //   A constructor that does this-|
    // reusing initialization code provided by another of the
    // class’s constructors rather than defining similar
    // code in the no-argument constructor’s body.
    // is called a delegating constructor.

    //If we need to change
    //how objects of class Time2 are initialized,
    // only the constructor that the class’s other
    // constructors call will need to be modified

    // Generate setters and getters
    public void setTime(int hour,int minute,int second){
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be btw 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be btw 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be btw 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be btw 0-23");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be btw 0-59");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be btw 0-59");
        }
        this.second = second;
    }
    //Convert to String in Universal-Time format
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d:",getHour(),getMinute(),getSecond());
    }
    //Standard-Time format(H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(),getSecond(),(getHour() < 12 ? "AM" : "PM"));
    }
}
