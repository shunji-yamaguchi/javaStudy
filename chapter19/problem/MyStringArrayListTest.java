package chapter19.problem;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

public class MyStringArrayListTest {
    private MyStringArrayList msa = null;

    @Before
    public void msaインスタンス生成() {
        msa = new MyStringArrayList();
    }

    @Test
    public void 生成後はsize0() {
        assertThat(msa.size(), is(0));
    }

    @Test
    public void 生成後のarの実際の長さはINITIAL_CAPACITY() throws Exception {
        String[] ar = (String[])getPrivateField(msa, "ar");
        int initialCapacity = (Integer)getPrivateField(msa, "INITIAL_CAPACITY");
        assertThat(ar.length, is(initialCapacity));
    }

    @Test
    public void arが一杯になると長さが2倍になる() throws Exception {
        String[] ar = (String[])getPrivateField(msa, "ar");
        int size = ar.length;

        for (int i = 0; i < size + 1; i++) {
            msa.add(String.valueOf(i));
        }

        ar = (String[])getPrivateField(msa, "ar");
        assertThat(ar.length, is(size * 2));
    }

    @Test
    public void 要素追加ごとにサイズが1増える() {
        for (int i = 0; i < 100; i++) {
            msa.add(String.valueOf(i));
            assertThat(msa.size(), is(i+1));
        }
    }

    @Test
    public void getで要素を取得できる() {
        int num = 100;
        for (int i = 0; i < num; i++) {
            msa.add(String.valueOf(i));
        }
        for (int i = 0; i < num; i++) {
            assertThat(msa.get(i), is(String.valueOf(i)));
        }
    }

    @Test
    public void 負の数でgetするとIndexOutOfBoundsExceptionを投げる() {
        try {
            msa.get(-1);
            fail();
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void 追加要素数以上でgetしようとするとIndexOutOfBoundsExceptionを投げる() {
        int num = 10;
        for (int i = 0; i < num; i++) {
            msa.add(String.valueOf(i));
        }
        try {
            msa.get(num);
            fail();
        } catch (IndexOutOfBoundsException e) {
        }
    }

    // privateなフィールドを取得
    public static Object getPrivateField(Object target, String field) throws Exception{
        Class<? extends Object> c = target.getClass();
        Field fld = c.getDeclaredField(field);
        fld.setAccessible(true);
        return fld.get(target);
    }
}
