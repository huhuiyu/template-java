package top.huhuiyu.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试用例
 *
 * @author 胡辉煜
 */
public class AppTest {

  @Test
  public void test() {
    String x = "abc";
    String y = "abc";
    String z = new String("abc");
    assertEquals(x, y);
    assertEquals(x, z);
    assertTrue(x.equals(y));
    assertTrue(x == y);
    assertFalse(x == z);

  }
}
