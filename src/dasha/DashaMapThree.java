package dasha;

public class DashaMapThree implements HashMapX {
    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return (String.valueOf(input.charAt(1)).toLowerCase());
        }
        return null;
    }

    @Override
    public void set(String key, Integer value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}