/**
 * 前 K 个高频元素
 * */
class TopKFreq {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Queue<int[]> queue = new PriorityQueue<>((l1,l2)->l2[1]-l1[1]);
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value= entry.getValue();
            int[] l = new int[]{key,value};
            if(count<=k){

                queue.offer(l);
            }else{
                if(queue.peek()[1]<value){
                    queue.offer(l);
                }else{
                    continue;
                }
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.poll()[0];
        }
        return res;
    }
}