package Chapter8;

public class SimpleTime {
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public  String buildString(){
        return String.format("%24s: %s%n%24s :%s", "this.toUniversalString", this.toUniversalString(),
                "toUniversalString", toUniversalString());
    }
    //Convert to String in the universal-Time format
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",this.hour,this.minute,this.second);
    }
}
    class ThisTest {
        public static void main(String[] args) {
        SimpleTime time = new SimpleTime(11,45,20);
            System.out.println(time.buildString());
        }
    }

