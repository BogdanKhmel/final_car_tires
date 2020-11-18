package com.main.java.bl;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentSeason {
    private static String season;


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCurrentSeason() {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        switch (gregorianCalendar.get(Calendar.MONTH)) {
            case (0):
            case (1):
            case (2):
            case (10):
            case (11):
                return season = "winter";
            case (3):
            case (4):
            case (5):
            case (6):
            case (7):
            case (8):
            case (9):

                return season = "summer";

        }
return null;

}
}
