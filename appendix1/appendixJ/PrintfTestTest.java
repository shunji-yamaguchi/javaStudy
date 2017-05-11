package appendix1.appendixJ;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrintfTestTest {
    private String[] systemOut;

    @Before
    public void main実行して標準出力を1行ごとに取得() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintfTest.main(null);
        systemOut = out.toString().split("\n");
    }

    @Test
    public void 出力は十二行() {
        assertThat(systemOut.length, is(12));
    }

    @Test
    public void 一行目() {
        assertThat(systemOut[0], is("x = 030071, y = 0103, z = 037777776206（8進数表示）"));
    }

    @Test
    public void 二行目() {
        assertThat(systemOut[1], is("x = 12345, y = 67, z = -890（10進数表示）"));
    }

    @Test
    public void 三行目() {
        assertThat(systemOut[2], is("x = 0x3039, y = 0x43, z = 0xfffffc86（16進数表示）"));
    }

    @Test
    public void 四行目() {
        assertThat(systemOut[3], is("12345     円（10桁で左寄せ）"));
    }

    @Test
    public void 五行目() {
        assertThat(systemOut[4], is("+12345    円（10桁で左寄せで符号付き）"));
    }

    @Test
    public void 六行目() {
        assertThat(systemOut[5], is("     12345円（10桁で右寄せ）"));
    }

    @Test
    public void 七行目() {
        assertThat(systemOut[6], is("    +12345円（10桁で右寄せで符号付き）"));
    }

    @Test
    public void 八行目() {
        assertThat(systemOut[7], is("    12,345円（10桁で右寄せで区切り付き）"));
    }

    @Test
    public void 九行目() {
        assertThat(systemOut[8], is("2012-09-07（日付）"));
    }

    @Test
    public void 十行目() {
        assertThat(systemOut[9], is("08:30:59（時刻）"));
    }

    @Test
    public void 十一行目() {
        assertThat(systemOut[10], is("金（曜日）"));
    }

    @Test
    public void 十二行目() {
        assertThat(systemOut[11], is("2012-09-07（金）08:30:59（まとめた日付）"));
    }
}
