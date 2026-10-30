class Solution {
    int[] arr;
    Set<Integer>[] s;
    public int sumCounts(int[] nums) {
        arr=nums;
        int n = nums.length;
        s= new HashSet[4*n];
        for(int i=0;i<s.length;i++){
            s[i]=new HashSet<>();
        }
        rec(0,n-1,0);
        int ans=0;
        for(int i=0;i<4*n;i++){
            ans+=(s[i].size()*s[i].size());
        }
        return ans;
    }
    public void rec(int st,int end,int idx){
        if(st==end){
            s[idx].add(arr[end]);
            return;
        }
        long mid= (0L+st+end)/2;
        rec(st,(int)mid,idx*2+1);
        rec((int)mid+1,end,idx*2+2);
        s[idx].addAll(s[idx*2+1]);
        s[idx].addAll(s[idx*2+2]);
    }
}


// range sum query
//modify for other type of question

public void build(int idx,int low,int high){
    if(low==high){
        seg[idx]=nums[low];
        return;
    }
    build(2*idx+1,low,(low+high)/2);
    build(2*idx+2,(low+high)/2+1,high);
    seg[idx]=seg[2*idx+1]+seg[2*idx+2];
}
public int query(int idx,int low,int high,int l,int r){
    if(low>=l && high<=r){
        return seg[idx];
    }
    if(low>r || l>high){
        return 0;
    }
    int mid=(low+high)/2;
    return query(2*idx+1,low,mid,l,r)+query(2*idx+2,mid+1,high,l,r);
}
public void up(int idx,int low,int high,int pos,int val){
    if(low==high){
        seg[idx]=val;
        return;
    }
    int mid=(low+high)/2;
    if(pos<=mid){
        up(2*idx+1,low,mid,pos,val);
    }else{
        up(2*idx+2,mid+1,high,pos,val);
    }
    seg[idx]=seg[2*idx+1]+seg[2*idx+2];
}