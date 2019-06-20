package ru.spb.iac.toris.egrulegrip.parser;

import java.io.File;
import java.util.HashMap;

public interface IMainParser {
    public abstract void parse(File filePath);

    public abstract void parse(File[] filePath);

    public abstract HashMap parseFile(File filePath);

    public abstract void parse();
}
