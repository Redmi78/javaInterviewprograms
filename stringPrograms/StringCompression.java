package stringPrograms;

class StringCompression {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        StringBuilder compressed = new StringBuilder();

        int count = 1; // start with count 1 for the first character
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // same char, increment count
            } else {
                // different char, append previous char and count
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1; // reset count for new char
            }
        }
        // append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        System.out.println(compressed.toString());
    }
}
