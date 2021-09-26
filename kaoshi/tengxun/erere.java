package tengxun;

public class maxTotalDemo{
    public int maxTotal(int n,int[]nums){
        int res =0;
        for(int i=0;i<n;i++){
            int index =i+nums[i];
            int nn= nums[i];
            while (index<n){
                nn=nums[i]+nums[index];
            }
            res=Math.max(res,nn);
        }
        return res;
    }
    public static void main(String[]args){
        int re =new maxTotalDemo().maxTotal(3,new int[]{2,10,4});
        System.out.println(re);
    }
}
