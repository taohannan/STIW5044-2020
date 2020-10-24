public class Clock
{
    //Instance variables
    private int hours;
    private int minutes;
    private int seconds;
    private boolean displaySeconds;

    //Class Methods
    public void setHour(int hour)
    {
        hours = hour;
    }
    public void setMinutes(int min)
    {
        minutes = min;
    }
    public void setSeconds(int sec)
    {
        seconds = sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isDisplaySeconds() {
        return displaySeconds;
    }

    public void displayTime() {
        System.out.print("The time is ");
        System.out.print(this.hours + ":");
        System.out.print(this.minutes + ":");
        System.out.println(this.seconds);
    }
}
