public class TwoSumArray {

    void sum(int[] numbers,int target)
    {
        int flag=0;
        for(int x=0;x<numbers.length;x++)
        {
            for(int y=0;y<numbers.length;y++)
            {
                if(numbers[x]+numbers[y]==target && x!=y && flag==0)
                {
                    System.out.println("["+x+","+y+"]");
                    flag=1;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        TwoSumArray obj = new TwoSumArray();
        int[] numbers = {2, 7, 11, 15};
        int target = 17;
        obj.sum(numbers, target);
    }
    
}
