class Solution {

    boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') ; 
    }

    public String sortVowels(String s) {

        char[] arr = s.toCharArray();
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (isVowel(arr[i])) {
                chars.add(arr[i]);
            }
        }

        Collections.sort(chars);

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isVowel(arr[i])) {
                arr[i] = chars.get(j++);
            }
        }

        return new String(arr);
    }
}