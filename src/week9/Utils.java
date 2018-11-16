package week9;



import java.io.*;


public class Utils {

    public static String readContentFromFile(String path) {
        String str = new String();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void writeContentToFile(String path) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter(path,"UTF-8");
//        printWriter.println("Nhap thong tin cho file Text!!");
//        printWriter.append("1: Yeu to quoc, yeu dong bao.\n");
//        printWriter.append("2: Hoc tap tot, lao dong tot.\n");
//        printWriter.append("3: Doan ket tot, ki luat tot.\n");
//        printWriter.append("4: Giu gin ve sinh that tot.\n");
//        printWriter.append("5: Khiem ton, that tha, dung cam.\n");
//        printWriter.append("Them cau cuoi\n");
        printWriter.append("them cau");
        printWriter.close();
    }
    public static void write(String Path) throws FileNotFoundException{
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try{
            fileWriter= new FileWriter (Path,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println("Them cau !!");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if(file.exists()) {
            if (file.isDirectory()) {
                for (File f : file.listFiles()
                ) {
                    if (f.getName().equals(fileName)) {
                        return f;
                    }
                }
            }
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        writeContentToFile("D:\\week9.txt");
        write("week9.txt");
        readContentFromFile("D:\\week9.txt");
        System.out.println(findFileByName("D:","week9.txt"));
    }

}
