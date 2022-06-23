import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
        assert true;
    }
    @Test
    public void test_method_3() {
        assert true;
    }
    @Test
    public void test_method_4() {
        assert true;
    }
    @Test
    public void test_method_5() {
        assert false;
    }
    @Test
    public void test_method_6() {
        assert false;
    }
}