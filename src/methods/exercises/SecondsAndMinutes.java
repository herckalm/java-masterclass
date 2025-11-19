package methods.exercises;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(-2578));
        System.out.println(getDurationString(6723));
        System.out.println(getDurationString(0, 0));
        System.out.println(getDurationString(-712, 0));
        System.out.println(getDurationString(0, -1200));
        System.out.println(getDurationString(1150, 127));
    }

    public static String getDurationString(int timeInSeconds) {
        if (timeInSeconds >= 0) {
            int hours = timeInSeconds / 3600;
            int hoursRemainder = timeInSeconds % 3600;
            int minutes = hoursRemainder / 60;
            int minutesRemainder = hoursRemainder % 60;
            int seconds = minutesRemainder % 60;
            return timeInSeconds + " seconds are " + hours + "h " + minutes + "m " + seconds + "s";
        }
        return "There is not such thing as negative time!";
    }

    public static String getDurationString(int timeInMinutes, int timeInSeconds) {
        int totalSeconds = (timeInMinutes * 60) + timeInSeconds;
        return getDurationString(totalSeconds);
    }
}
