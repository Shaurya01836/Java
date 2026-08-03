class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> res = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : cpdomains) {

            String[] temp = s.split(" ");
            String cnt = temp[0];

            String domain[] = temp[1].split("\\.");

            StringBuilder str = new StringBuilder();

            str.append(domain[domain.length - 1]);

            map.put(str.toString(), map.getOrDefault(str.toString(), 0) + Integer.parseInt(cnt));

            for (int i = domain.length - 2; i >= 0; i--) {
                str.insert(0, domain[i] + ".");

                map.put(str.toString(), map.getOrDefault(str.toString(), 0) + Integer.parseInt(cnt));
            }
        }

        for (String key : map.keySet()) {
            res.add(map.get(key) + " " + key);
        }

        return res;

    }
}