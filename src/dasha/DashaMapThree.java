package dasha;

public class DashaMapThree extends DashaMap {

    @Override
    protected String HashFunction(String input) {
        if (input.length() > 1) {
            return String.valueOf(input.charAt(0)).toLowerCase() + String.valueOf(input.charAt(1)).toLowerCase();
        }
        return null;
    }
}
