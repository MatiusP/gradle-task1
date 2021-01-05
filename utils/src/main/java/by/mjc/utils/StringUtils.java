package by.mjc.utils;

public class StringUtils {

    public boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            return Double.parseDouble(str) > 0;
        }
        return false;
    }
}
