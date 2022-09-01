import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

//3.7-1
public class FileIO
{
    public static void main(String[] args) throws IOException
    {
        //(IDE)获取创建新文件的目录
        String dir = System.getProperty("user.dir");
        //System.out.println(dir);

        //用PrintWriter来创建新文件
        PrintWriter out = new PrintWriter("fileIO.txt", StandardCharsets.UTF_8);
        out.println("啦啦啦");
        //结束写入得用close方法，否则数据会丢失
        out.close();

        //用Scanner来读取文件
        Scanner in = new Scanner(Path.of(dir + "\\fileIO.txt"), StandardCharsets.UTF_8);
        String str = in.nextLine();
        System.out.println(str);
    }
}
