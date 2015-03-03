package ru.iac;

import groovy.util.slurpersupport.Attributes;
import ru.iac.entity.EgrulEntity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by konenkov on 12.02.2015.
 * Some util methods for converts type*
 */
public abstract class Util {

    public static final int ERROR = 1;
    public static final int SUCCESS = 0;

    public static Date convertToDate(Attributes attribute) {
        String string = attribute.text();
        if (string == null) return null;
        if (Objects.equals(string, "")) return null;
        Date date = null;
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date convertToDate(String string) {
        if (string == null) return null;
        if (Objects.equals(string, "")) return null;
        Date date = null;
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Integer convertToInt(Attributes attribute) {
        if (attribute.text() == null) return null;
        if (Objects.equals(attribute.text(), "")) return null;
        Integer integer = null;
        integer = Integer.parseInt(attribute.text());
        return integer;
    }

    public static BigInteger convertToBInt(Attributes attribute) {
        if (attribute.text() == null) return null;
        if (Objects.equals(attribute.text(), "")) return null;
        return new BigInteger(attribute.text());
    }

    public static BigDecimal convertToBDec(Attributes attribute) {
        if (attribute.text() == null) return null;
        if (Objects.equals(attribute.text(), "")) return null;
        return new BigDecimal(attribute.text());
    }

    public static EgrulEntity check(EgrulEntity egrulEntity, List<EgrulEntity> list) {
        int index = list.indexOf(egrulEntity);
        if (index != -1) {
            egrulEntity = list.get(index);
            return egrulEntity;
        } else {
            list.add(egrulEntity);
            return egrulEntity;
        }

    }
}
