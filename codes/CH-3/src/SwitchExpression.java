//3.5-1
public class SwitchExpression {
    enum Season {SPRING, SUMMER, AUTUMN, WINTER}

    public static void main(String[] args) {
        Season season = Season.SPRING;
        String seasonName = switch (season) {
            case SPRING -> "春天";
            case SUMMER -> "夏天";
            case AUTUMN -> "秋天";
            case WINTER -> "冬天";
            //标签为枚举的话，可以省略default
        };
        System.out.println("The seasonName is " + seasonName);

        String isSeason = switch (season){
            case SPRING, SUMMER, AUTUMN, WINTER -> "是";
            default -> "否";
        };
        System.out.println(isSeason + "季节");
    }
}
