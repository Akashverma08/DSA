public class ArraySearch {


    public static int searchIndex(int nums[],int target){
        int min=minSearch(nums);
        //CHECK IN RIGHT HALF
        if(nums[min]<=target && target <=nums[nums.length-1]){
            return search(nums,min,nums.length-1,target);
        }
        //CHECK IN LEFT HALF
        else{
            return search(nums,0,min,target);
        }

    }

    public static int search(int nums[],int left,int right,int target){
        int l=left;
        int r=right;
        while(l<=r){
            int mid=l +(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;

    }
    //FIND MIN ELEMENT INDEX FRON THERE

    public static int minSearch(int nums[]){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left + (right-left)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
            else if(nums[left]<=nums[mid] && nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        int nums[]={4,6,9,1,3,7};
        System.out.println(searchIndex(nums, 7));

    }
    
}
