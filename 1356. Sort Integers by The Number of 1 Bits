class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int bitCompare = Integer.bitCount(a) - Integer.bitCount(b);
                if (bitCompare == 0) {
                    if (a < b) return -1;
                    else if (a > b) return 1;
                    else return 0;  
                }
                return bitCompare;
            }
        );        
        for (int num : arr) {
            pq.add(num);
        }
        
        int i = 0;
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }
        
        return arr;
    }
}
