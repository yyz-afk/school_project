import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author yyz
 * @date 2026/9/15 17:56
 */

@SpringBootTest
public class test_01 {


    @Test
    public void test_ch1() {
        String fileName = "1234567";
        String name = fileName.substring(0, 13) + "|||||||||";
        System.out.println(name);
    }

}
