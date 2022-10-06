package ComputerizedHealthRecords;

public class DateOfBirth {
    String day;
    String month;
    String year;

    public DateOfBirth(String day,String month,String year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return String.format("%2s/%2s/%2s",day,month,year);
    }

}
