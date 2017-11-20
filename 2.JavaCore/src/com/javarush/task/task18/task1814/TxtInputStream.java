package com.javarush.task.task18.task1814;

import java.io.*;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    private FileOutputStream outputStream;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.endsWith(".txt")) { return;
        } else { super.close();
            throw new UnsupportedFileNameException();}
    }

    public static void main(String[] args) {
    }
}

