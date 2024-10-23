class Solution {
    public String reorganizeString(String str) {
	HashMap<Character, Integer> hashMap = new HashMap<>();
        int n=str.length();
        for (int i=0; i<n; ++i) {
            char currChar=str.charAt(i);
            hashMap.put(currChar, hashMap.getOrDefault(currChar, 0)+1);
            if (hashMap.get(currChar)>(n+1)/2) {
                return "";
            }
        }
        PriorityQueue<Pair> maxHeap=new PriorityQueue<>((a, b)->b.freq-a.freq);
        for (Map.Entry<Character, Integer> entry: hashMap.entrySet()) {
            maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
        }
        char[] res=new char[n];
        int i=0;
        while (!maxHeap.isEmpty()) {
            Pair pair=maxHeap.poll();
            while (pair.freq>0&&i<n) {
                res[i]=pair.c;
                pair.freq--;
                i+=2;
            }
            if (i>=n) {
                i=1;
            }
            while (pair.freq>0&&i<n) {
                res[i]=pair.c;
                pair.freq--;
                i+=2;
            }
        }
        return new String(res);
	}
	 class Pair {
        char c;
        int freq;

        Pair(char c, int freq) {
            this.c=c;
            this.freq=freq;
        }
    }
}