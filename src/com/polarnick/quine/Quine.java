package com.polarnick.quine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Nickolay Polyarnyi
 */
public class Quine {
    private static final String FILE_NAME = "com/polarnick/quine/Quine.java";
    private static final char QUOTE = '"';
    private static final String SOURCE_CODE = "package com.polarnick.quine;import java.io.File;import java.io.FileWriter;import java.io.IOException;import java.io.PrintWriter;/** * @author Nickolay Polyarnyi */public class Quine {    private static final String FILE_NAME = ;    private static final char QUOTE = '';    private static final String SOURCE_CODE = ;    private static final int INDEX_FILE_NAME = 227;    private static final int INDEX_QUOTE = 267;    private static final int INDEX_SOURCE_CODE = 315;    public static void main(String[] args) throws IOException {        File file = new File(FILE_NAME);        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {            throw new IllegalStateException();        }        PrintWriter out = new PrintWriter(new FileWriter(file));        out.print(SOURCE_CODE.substring(0, INDEX_FILE_NAME) + QUOTE + FILE_NAME + QUOTE);        out.print(SOURCE_CODE.substring(INDEX_FILE_NAME, INDEX_QUOTE) + QUOTE);        out.print(SOURCE_CODE.substring(INDEX_QUOTE, INDEX_SOURCE_CODE) + QUOTE + SOURCE_CODE + QUOTE);        out.print(SOURCE_CODE.substring(INDEX_SOURCE_CODE));        out.close();    }}";
    private static final int INDEX_FILE_NAME = 227;
    private static final int INDEX_QUOTE = 267;
    private static final int INDEX_SOURCE_CODE = 315;

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_NAME);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            throw new IllegalStateException();
        }
        PrintWriter out = new PrintWriter(new FileWriter(file));
        out.print(SOURCE_CODE.substring(0, INDEX_FILE_NAME) + QUOTE + FILE_NAME + QUOTE);
        out.print(SOURCE_CODE.substring(INDEX_FILE_NAME, INDEX_QUOTE) + QUOTE);
        out.print(SOURCE_CODE.substring(INDEX_QUOTE, INDEX_SOURCE_CODE) + QUOTE + SOURCE_CODE + QUOTE);
        out.print(SOURCE_CODE.substring(INDEX_SOURCE_CODE));
        out.close();
    }
}