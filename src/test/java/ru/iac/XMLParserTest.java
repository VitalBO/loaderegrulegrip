package ru.iac;

import org.junit.Assert;
import org.junit.Test;
import ru.iac.MainParser;


import java.io.File;

/**
 * Created by konenkov on 10.02.2015.
 */
public class XMLParserTest extends Assert {

    private static File filePathEgrip = new File("src\\test\\java\\ru\\iac\\testEGRIP.XML");
    private static File filePathEgrul = new File("src\\test\\java\\ru\\iac\\testEGRUL.XML");

    @Test
    public void xmlParserEGRIPTest() {

        MainParser.parse(filePathEgrip);
        //System.out.println(tempIP.get(0).toString());

    }

    @Test
    public void xmlParserEGRULTest() {

        MainParser.parse(filePathEgrul);
        //System.out.println(tempIP.get(0).toString());

    }

    @Test
    public void testMain() {

        MainParser.parse(filePathEgrul);
        //System.out.println(tempIP.get(0).toString());

    }
}
