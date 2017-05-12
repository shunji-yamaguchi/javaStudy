package appendix1.appendixJ;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class PrintfTestTest {
    @Test
    public void mainの出力テスト() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintfTest.setPrintStream(new PrintStream(out));
        PrintfTest.main(null);
        assertThat(out.toString(), is(
                "x = 030071, y = 0103, z = 037777776206（8進数表示）\n"
                + "x = 12345, y = 67, z = -890（10進数表示）\n"
                + "x = 0x3039, y = 0x43, z = 0xfffffc86（16進数表示）\n"
                + "12345     円（10桁で左寄せ）\n"
                + "+12345    円（10桁で左寄せで符号付き）\n"
                + "     12345円（10桁で右寄せ）\n"
                + "    +12345円（10桁で右寄せで符号付き）\n"
                + "    12,345円（10桁で右寄せで区切り付き）\n"
                + "2012-09-07（日付）\n"
                + "08:30:59（時刻）\n"
                + "金（曜日）\n"
                + "2012-09-07（金）08:30:59（まとめた日付）\n"
                ));
    }
}
