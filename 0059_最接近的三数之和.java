public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        Arrays.sort(numbers);
        int ans=Integer.MAX_VALUE;
        int anstemp;
        for(int i=0;i<numbers.length-2;i++){
            anstemp=Integer.MAX_VALUE;
            int j=i+1;
            int k=numbers.length-1;
            while(j<k){
                int temp=numbers[i]+numbers[j]+numbers[k];
                anstemp=witchclosezero(temp,anstemp,target);
                if(anstemp>target){
                    k--;
                }else if(anstemp<target){
                    j++;
                }else{
                    return anstemp;
                }
            }
            ans=witchclosezero(anstemp,ans,target);
        }
        return ans;
    }
    public int witchclosezero(int A,int B,int t){
        int tempa=A-t;
        tempa=tempa>0?tempa:-tempa;
        int tempb=B-t;
        tempb=tempb>0?tempb:-tempb;
        return tempb>tempa?A:B;
    }
}

