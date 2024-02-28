package main;
import java.io.File;

public class main {
    // file checker 
    static void Filechecker(String name){
        File file = new File(name);
        try{
            if(file.isAbsolute()==true)
            System.out.printf("%s exists", file);
            if(file.isDirectory()==true)
            System.out.println(file +" is a directory");
            if(file.isFile())

        }
        
    }


}
