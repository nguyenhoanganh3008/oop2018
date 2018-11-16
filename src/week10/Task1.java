package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<String> getAllFunctions(String path) throws IOException {
        List<String> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            str = str.trim();
            if (str.contains("static")) {
                list.add(str);
            }
        }
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
        return list;
    }

    public static String findFunctionByName(String name) throws IOException {
        int dem = 0;
        FileInputStream f = new FileInputStream("C:\\Users\\Linh\\IdeaProjects\\oop20181\\src\\week9\\Utils.java");
        InputStreamReader i = new InputStreamReader(f);
        BufferedReader b = new BufferedReader(i);
        String str;
        while ((str = b.readLine()) != null) {
            str = str.trim();
            if (str.contains(name) == true) {
                dem++;
            }
        }
        if (dem == 0) return null;
        else return name;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getAllFunctions("C:\\Users\\Linh\\IdeaProjects\\oop20181\\src\\week9\\Utils.java"));
        System.out.println("=========================");
        String nameFile="findFi0eByName";
        String string = Task1.findFunctionByName(nameFile);
        if(string==null){
            System.out.println("khong tim thay pt: " +"'"+ nameFile+"'");
        }
        else System.out.println("co pt " + "'" + string +"'"+ " trong File");
    }
}
