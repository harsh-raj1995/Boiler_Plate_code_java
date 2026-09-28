

// condition
public void count(int[] nums,int left,int mid,int high){
        int right=mid+1;
        for(int i=left;i<=mid;i++){
            while(right<high && 1L*nums[i]>2L*(nums[right])){
                right++;
            }
            ans+=(right-(mid+1));
        }
    }



//sorting

public void merge(int[] nums,int start,int end){
        if(end-start==1) return;
        merge(nums,start,(end+start)/2);
        merge(nums,(end+start)/2,end);
        int i=start;
        int j=(end+start)/2;
        int[] arr= new int[end-start];
        int k=0;
        while(i<(end+start)/2 && j<end){
            if(nums[i]<=nums[j]){
                arr[k++]=nums[i++];
            }else{
                arr[k++]=nums[j++];
            }
        }
        while(i<(end+start)/2){
            arr[k++]=nums[i++];
        }
        while(j<end){
            arr[k++]=nums[j++];
        }
        for(k=0;k<arr.length;k++){
            nums[start++]=arr[k];
        }
    }


    //count of range sum 
    int l=upperBound(nums,nums[i]-low,start,(end+start)/2);
    int u= lowerBound(nums,nums[i]-high,start,(end+start)/2);
            ans+=(l-u);