package appendix1.appendixJ;

import java.io.PrintStream;
import java.util.Calendar;

public class PrintfTest {
    private static PrintStream printStream = System.out;

    public static void setPrintStream(PrintStream newPrintStream) {
        printStream = newPrintStream;
    }

    public static void main(String[] args) {
        int x = 12345;
        int y = 67;
        int z = -890;

        // 2012-09-07 08:30:59
        Calendar cal = Calendar.getInstance();
        cal.set(2012, 9 - 1, 7, 8, 30, 59);

        printStream.printf("x = %#o, y = %#o, z = %#o（8進数表示）\n", x, y, z);
        printStream.printf("x = %d, y = %d, z = %d（10進数表示）\n", x, y, z);
        printStream.printf("x = %#x, y = %#x, z = %#x（16進数表示）\n", x, y, z);

        printStream.printf("%-10d円（10桁で左寄せ）\n", x);
        printStream.printf("%+-10d円（10桁で左寄せで符号付き）\n", x);
        printStream.printf("%10d円（10桁で右寄せ）\n", x);
        printStream.printf("%+10d円（10桁で右寄せで符号付き）\n", x);
        printStream.printf("%,10d円（10桁で右寄せで区切り付き）\n", x);

        printStream.printf("%tF（日付）\n", cal);
        printStream.printf("%tT（時刻）\n", cal);
        printStream.printf("%ta（曜日）\n", cal);
        printStream.printf("%tF（%<ta）%<tT（まとめた日付）\n", cal);
    }
}
