import java.io.*;
public class FileReadWrite {
    public static void main(String[] args)throws IOException {
        FileInputStream in =null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int a;
            while((a=in.read())!=-1)
            {
                out.write(a);
            }
        }
        finally{
            in.close();
            out.close();
        }
    }
}
