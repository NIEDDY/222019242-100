public class breakstatement{
    public static void main(String[] args) {
        int day = 1;
        String dayOfWeek;

        while (true) {
            
            switch (day) {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                case 7:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "Invalid day";
                    break;
            }

            System.out.println("Day " + day + ": " + dayOfWeek);

            if (day == 7) {
                break;
            }

            day++;
        }
    }
}
