package ru.spb.iac.toris.egrulegrip.parser;

import java.io.File;
import java.util.HashMap;

public interface IMainParser {
    HashMap parse(File filePath);

    HashMap parse(File[] filePath);

    HashMap parseFile(File filePath);

    void parse();
}
