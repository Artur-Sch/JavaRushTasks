package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        List<String> result = new ArrayList<>();
        Stack<File> files = new Stack<>();
        files.push(new File(root));
        while (!files.isEmpty()) {
            File current = files.pop();

            if (current.isDirectory()) {
                for (File f : current.listFiles()) {
                    files.push(f);
                }
            }
            if (current.isFile()) {
                result.add(current.getAbsolutePath());
            }
        }





//        ArrayList<File> listFolder = new ArrayList<>();
//        Path path = new File(root).toPath();
//        Path path = new File(root).toPath();
//        Path stream = Files.walkFileTree(path, FileVi);
//            Files.walkFileTree(Paths.get(root), new MyFileVisitor());



//        HashSet<String> listFile = new HashSet<>();
//        ArrayList<String> result = new ArrayList<>();
//        listFile.add(root);
//        if (file.isDirectory()) {
//        File file = new File(root);
//            for (File file1 : file.listFiles()) {
//                if (file1.isFile()) {
//                    listFile.add(file1.getParent());
//                }
//                if (file1.isDirectory()) {
//                    listFolder.add(file1);
//                    for (int i = 0; i < listFolder.size(); i++) {
//                        for (File f : listFolder.get(i).listFiles()) {
//                            if (f.isFile()) {
//                                listFile.add(f.getParent());
//                                listFolder.remove(i);
//                            }
//                            if (f.isDirectory()) {
//                                listFile.add(f.getParent());
//                                listFolder.add(f);
//                            }
//                        }
//                    }
//                }
//            }
//    }
//        result.addAll(listFile);
        return result;
    }

    public static void main(String[] args) {

    }



}

//class MyFileVisitor extends SimpleFileVisitor {
//
//    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
//        Solution.list.add(path.toString());
//        return FileVisitResult.CONTINUE;
//    }
//}
