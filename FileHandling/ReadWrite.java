package FileHandling;

/**
 * ReadWrite
 */
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.IOException;
// public class ReadWrite {

//     public static void main(String[] args)  {
//         String openpath="C:\\Users\\u\\Desktop\\Sumith_Bilamkar_1NH21CS241 pdf(1).pdf";
//         String writepath="C:\\Users\\u\\Desktop\\temp.pdf";
//         try(BufferedReader br=new BufferedReader(new FileReader(openpath));
//             BufferedWriter bw=new BufferedWriter(new FileWriter(writepath)))
//             {
//                 String line;
//                 while((line=br.readLine())!=null)
//                 {
//                     System.out.println(line);
//                     bw.write(line);
//                     bw.newLine();
//                 }
//                 System.out.println("copied succfully");
//             }
//             catch(IOException e)
//             {
//               e.printStackTrace();
//             }
//     }
// }

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

    public static void main(String[] args) {
        String openpath = "C:\\Users\\u\\Desktop\\Sumith_Bilamkar_1NH21CS241 pdf(1).pdf";
        String writepath = "C:\\Users\\u\\Desktop\\temp.pdf";
        try (FileInputStream fis = new FileInputStream(openpath);
             FileOutputStream fos = new FileOutputStream(writepath)) {

            // byte[] buffer = new byte[1024];
            // int bytesRead;
            // while ((bytesRead = fis.read(buffer)) != -1) {
            //     fos.write(buffer, 0, bytesRead);
            // }
           byte[] buffer=new byte[1024];
           int byteRead;
           while((byteRead=fis.read(buffer))!=-1)
           {
            fos.write(buffer,0,byteRead);
           }
            System.out.println("Copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
