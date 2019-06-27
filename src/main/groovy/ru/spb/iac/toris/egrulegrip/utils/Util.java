package ru.spb.iac.toris.egrulegrip.utils;

import groovy.util.slurpersupport.Attributes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;
import ru.spb.iac.toris.egrulegrip.model.EgrulEgripEntity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public abstract class Util {

    public static final int ERROR = 1;
    public static final int SUCCESS = 0;
    private static int entitiesParsed=0;
    private static Logger log = LogManager.getLogger(Util.class);


    public static Date convertToDate(String string) {
        if (string == null) return null;
        if (Objects.equals(string, "")) return null;
        Date date = null;
        DateFormat format=null;
        if( Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",string))
            format = new SimpleDateFormat("yyyy-MM-dd");
        else if (Pattern.matches("^\\d{2}.\\d{2}.\\d{4}$",string))
            format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            log.error(e.toString(), e);
        }
        return date;
    }

    public static Integer convertToInt(Attributes attribute) {
        if (attribute.text() == null) return null;
        if (Objects.equals(attribute.text(), "")) return null;
        Integer integer = Integer.parseInt(attribute.text());
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

    public static String convertToString(Attributes attribute) {
        if (attribute.text() == null) return null;
        if (Objects.equals(attribute.text(), "")) return null;
        return attribute.text();
    }

    public static EgrulEgripEntity check(EgrulEgripEntity egrulegripEntity, List<EgrulEgripEntity> list) {
        int index = list.indexOf(egrulegripEntity);
        if (index != -1) {
            egrulegripEntity = list.get(index);
            return egrulegripEntity;
        } else {
            list.add(egrulegripEntity);
            return egrulegripEntity;
        }

    }

    public static File convert(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        File convFile = new File(fileName.substring(fileName.lastIndexOf("/")+1));
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    public static void deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        directoryToBeDeleted.delete();
    }

    public static String responseString(Map<String,Integer> resultImport){
        int countSuccess = 0, countFails = 0;
        List<Entry<String, Integer>> list = new ArrayList<>(resultImport.entrySet());
        for(int i = entitiesParsed; i < list.size(); ++i){
            if(list.get(i).getValue() == 0) ++countSuccess;
            else ++countFails;
        }
        entitiesParsed = list.size();
        return  "Successful: "+countSuccess+" entries\nFailed: "+countFails+" entries";
    }
}
