package com.javarush.task.task31.task3111;


import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.FileVisitResult.CONTINUE;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private List<Path> foundFiles = new ArrayList<>();

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    boolean checkMinSize;
    boolean checkMaxSize;
    boolean checkName;
    boolean checkContent;

    public SearchFileVisitor() {
        this.partOfName = null;
        this.partOfContent = null;
        this.minSize = 0;
        this.maxSize = 0;

        this.checkMaxSize = false;
        this.checkMinSize = false;
        this.checkContent = false;
        this.checkName = false;
    }

    public void setPartOfName(String partOfName) {
        this.checkName = true;
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.checkContent = true;
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.checkMinSize = true;
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.checkMaxSize = true;
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return this.foundFiles;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (!attrs.isRegularFile()) {
            return CONTINUE;
        }
        if (checkName && file.getFileName().toString().indexOf(this.partOfName) == -1) {
            return CONTINUE;
        }
        if (checkContent && new String(Files.readAllBytes(file)).indexOf(partOfContent) == -1) {
            return CONTINUE;
        }
        if (checkMinSize && attrs.size() < minSize) {
            return CONTINUE;
        }
        if (checkMaxSize && attrs.size() > maxSize) {
            return CONTINUE;
        }

        foundFiles.add(file);
        return CONTINUE;
    }
}
