//Scanner was introduced in 1.5 
///before that BufferedReader was used.

import  java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

class FileInputBR{

    static String getFileContent(String path){
    
    StringBuilder  content=new StringBuilder();
    //if we open Any Resources we need to close it.
    //since we are uusing BufferedReaderwhich might throw an Exception we need to close resource in Finally Block 
    //or we can Use: Try with Resources 
    try(BufferedReader br=new BufferedReader(new FileReader(path))){
        String line="";
        while((line=br.readLine())!=null){
            content.append(line);
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
    return content.toString();
}

    public static void main(String[] args) {
        int num;
        //InputStreamReader object need InputStream Object
        //InputStream Object is present in System Class as
        //static final InputStream in =null;
       // FileReader file=new FileReader("sample.txt");
        //bufferedReader need InputStreamReader object
        //BufferedReader br=new BufferedReader(file);//throws IOException[checked]
        //readLine() reads a String
        // String inputStr=br.readLine();
        // System.out.println(inputStr);
        //   inputStr=br.readLine();
        // System.out.println(inputStr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file Path");
        String filePath=sc.next();
        String fileContent=getFileContent(filePath);
        System.out.println(fileContent);
    }
}