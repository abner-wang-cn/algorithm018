/**
 * 组合
 * */
class Combination{
    private List<List<Integer>> ans=new ArrayList<>();
    private List<Integer> tmp = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return ans;
    }
    private void dfs(int count,int n, int k){
        if(tmp.size()==k){
            ans.add(new ArrayList<>(tmp));
            return;
        }
        if(count==n+1){
            return;
        }
        tmp.add(count);
        dfs(count+1,n,k);
        tmp.remove(tmp.size()-1);
        dfs(count+1,n,k);
    }
}