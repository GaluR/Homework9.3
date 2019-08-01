public class CalendarConverter {
    public static final int MONDAY = 1;
    public static final int WEDNESDAY = 3;
    public static final int TUESDAY = 2;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    static String convertDayToString( int dayNumber){
        switch(dayNumber){
            case MONDAY:
                System.out.println("Poniedziałek");
               break;
            case TUESDAY:
                System.out.println("Wtorek");
            break;
            case WEDNESDAY:
                System.out.println("Środa");
            break;
            case THURSDAY:
                System.out.println("Czwartek");
            break;
            case FRIDAY:
                System.out.println("Piątek");
            break;
            case SATURDAY:
                System.out.println("Sobota");
            break;
            case SUNDAY:
                System.out.println("Niedziela");
            break;
            default:
                return "Nie ma takiego dnia";
        }
        return ;
    }
}
