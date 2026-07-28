class Solution {
    public String sortVowels(String s) {

        char[] arr = s.toCharArray();
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a' || arr[i] == 'e' ||
                    arr[i] == 'i' || arr[i] == 'o' ||
                    arr[i] == 'u' || arr[i] == 'A' ||
                    arr[i] == 'E' || arr[i] == 'I' ||
                    arr[i] == 'O' || arr[i] == 'U') {
                chars.add(arr[i]);
            }
        }

        Collections.sort(chars) ;

        int j = 0 ;  

         for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a' || arr[i] == 'e' ||
                    arr[i] == 'i' || arr[i] == 'o' ||
                    arr[i] == 'u' || arr[i] == 'A' ||
                    arr[i] == 'E' || arr[i] == 'I' ||
                    arr[i] == 'O' || arr[i] == 'U') {
                arr[i] = chars.get(j++) ; 
            }
        }

        return new String(arr);
    }
}