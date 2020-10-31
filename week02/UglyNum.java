/**
*丑数
*/
class UglyNum{
    public int nthUglyNumber(int n) {
        Queue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        int[] l = {2,3,5};

        long res = 1L;
        queue.offer(res);
        for(int i=0;i<n;i++){
            res=queue.poll();
            for(int j:l){
                if(!set.contains(res*j)){
                    queue.offer(res*j);
                    set.add(res*j);
                }
            }
        }
        return (int)res;
    }
}