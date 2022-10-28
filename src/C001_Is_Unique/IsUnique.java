package C001_Is_Unique;

public class IsUnique {

    /**
     * Using Boolean Array
     * @param str
     * @return all characters in str is unique or not
     */
    public boolean isUnique(String str) {

        // if it is a Unicode String take size as 256 and if it is ASCII String take size as 128
        boolean[] present = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            // if already present
            if (present[val]) return false;
            // mark it as present
            present[val] = true;
        }

        // all are unique characters
        return true;
    }

    /**
     * Test case - 1
     * @return
     */
    public boolean test1() {
        String str = "12@8";
        return isUnique(str);
    }

    /**
     * Test case - 2
     * @return
     */
    public boolean test2() {
        String str = "1218";
        return isUnique(str);
    }

    /**
     * Driver Method
     * @param args
     */
    public static void main(String[] args) {

        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.test1());
        System.out.println(isUnique.test2());
    }
}
