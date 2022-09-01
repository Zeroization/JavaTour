//3.6-1
public class CodePointAndChar
{
    public static void main(String[] args)
    {
        String str = "\uD835\uDD4623";//𝕆23
        //length()可以查看字符串长度
        //codePointCount(a,b)可以查看字符串从a到b(不包含)的码点长度
        System.out.println("字符串长度：" + str.length() + " 码点长度：" + str.codePointCount(0, str.length()));
        //charAt(i)可以返回位置i的代码单元
        //offsetByCodePoints()和codePointAt()可以返回第i个码点
        int index = str.offsetByCodePoints(0, 1);
        int cp = str.codePointAt(index);
        System.out.println("第2个代码单元：" + str.charAt(1) + " 第2个码点：" + cp);
    }
}
