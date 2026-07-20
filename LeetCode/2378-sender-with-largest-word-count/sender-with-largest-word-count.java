class Solution {
    public String largestWordCount(String[] messages, String[] senders) {

        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String ans = "";

        for (int i = 0; i < senders.length; i++) {
            String message[] = messages[i].split(" ");
            String sender = senders[i];

            map.put(sender, map.getOrDefault(sender, 0) + message.length);
        }

        for (int i = 0; i < senders.length; i++) {
            if (map.get(senders[i]) > max) {
                max = map.get(senders[i]);
                ans = senders[i];
            } else if (map.get(senders[i]) == max) {
                if (senders[i].compareTo(ans) > 0) {
                    ans = senders[i];
                 }
            }

        }

        return ans;
    }
}