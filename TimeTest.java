public class TimeTest
{
    public static void main(String[] args) {
        Time localTime=new Time(9,15,20);
        while (true){
            System.out.print(localTime.nextTime().getTime());
            localTime.delayTime(1000);
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        }
    }
}
