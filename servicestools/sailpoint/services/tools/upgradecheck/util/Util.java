package sailpoint.services.tools.upgradecheck.util;

/**
 * Cloned by surya.nellepalli on 07/11/2017.
 */
public class Util {

    static public int atoi(String a) {

        int i = 0;
        if (a != null && a.length() > 0) {
            try {
                int dotIndex = a.indexOf('.');
                if (dotIndex > 0)
                    a = a.substring(0, dotIndex);

                i = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                // ignore, return 0
            }
        }

        return i;
    }
}
