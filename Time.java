public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        if(isNotValid(hour,minute,second)) return;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isNotValid(hour,0,0)) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(isNotValid(0,minute,0)) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(isNotValid(0,0,second)) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public boolean isNotValid(int hour, int minute, int second){
        return second>=60||minute>=60||hour>=24;
    }

    public Time nextTime(){
        if(++second==60){
            second=0;
            if(++minute==60){
                minute=0;
                if(++hour==24) hour=0;
            }
        }
        return this;
    }

    public String getTime() {
        return "Time : " + (hour < 10 ? "0" + hour : hour) + " : " + (minute < 10 ? "0" + minute : minute) + " : " + (second < 10 ? "0" + second : second);
    }

    public void delayTime(int delayTime){
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
