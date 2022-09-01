//3.7-1
//请在命令行上运行此代码！！
import java.io.Console;

public class ConsoleInput
{
    public static void main(String[] args)
    {
        Console cons = System.console();
        String userName = cons.readLine("User Name: ");
        //字符串有共享特性，使用字符数组安全点
        char[] passWd = cons.readPassword("Password: ");

        System.out.println(userName + '\n' + passWd);
    }
}
