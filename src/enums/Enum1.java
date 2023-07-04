package enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi rabotat");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Mojno otdohnut");
                break;

        }
        System.out.println(weekDay.getMood());
    }
}