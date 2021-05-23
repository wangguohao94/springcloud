import java.time.ZonedDateTime;

public class Test {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        //2021-05-23T21:43:38.183+08:00[Asia/Shanghai]
        System.out.println(zonedDateTime);
    }
}
