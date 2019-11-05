public class Assignment11 {
    public static void main(String[] args) {
        String weekday = "XXXXX";
        while (weekday.length()> 0) {
            weekday = Utils.getInput("Enter day of week ");
            int dayNum = getDayOfTheWeek(weekday);
            System.out.println(weekday + " is day # " + dayNum);
        }
    }
    public static int getDayOfTheWeek(String week) {

        int weekday = 0;

        if (week == null) {
            return weekday;
        }

        switch (week.toLowerCase().substring(0, 3)) {
            case "sun":
                weekday = 0;
                break;
            case "mon":
               weekday = 1;
                break;
            case "tue":
                weekday = 2;
                break;
            case "wed":
                weekday  = 3;
                break;
            case "thu":
                weekday  = 4;
                break;
            case "fri":
                weekday  = 5;
                break;
            case "sat":
                weekday  = 6;
                break;
            default:		weekday = 0;		break;
        }
        return weekday;


        }

    }