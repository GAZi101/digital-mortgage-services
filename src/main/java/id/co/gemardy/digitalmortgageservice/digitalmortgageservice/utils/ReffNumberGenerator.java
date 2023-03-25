package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReffNumberGenerator {

    private final static String PREFIX_REFF_KPR = "KPR";
    public static String generateReffNumberMortgage(){

        String nowDate = new SimpleDateFormat( "yyyyMMddHHmmss" ).format(new Date());

        return PREFIX_REFF_KPR + nowDate;
    }
}
