package tutorial.swiperefreshlayout;

/**
 * Created by lorence on 19/04/2018.
 *
 */

public class Utils {

    static final int DOUBLE_CLICK_TIME_DELTA = 500;
    private static long sLastClickTime = 0;

    public static boolean isDoubleClick() {
        long clickTime = System.currentTimeMillis();
        if (clickTime - sLastClickTime < DOUBLE_CLICK_TIME_DELTA) {
            sLastClickTime = clickTime;
            return true;
        }
        sLastClickTime = clickTime;
        return false;
    }
}
