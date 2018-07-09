package spittr.test;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;
import org.springframework.core.Conventions;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/7/6 11:26
 */
public class TestA {

    @Test
    public void test() {
        Integer i1 = Integer.valueOf(12);
        Integer i2 = Integer.valueOf(12);
        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }

    @Test
    public void test2() {
        System.out.println(new String().getClass());
        String[] strList = new String[]{};
        System.out.println(strList.getClass().getComponentType());
    }
}
