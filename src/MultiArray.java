public class MultiArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<4;j++)
            {
                //here we typecast the random method it will give
                //random method gives float or double value and
                //by multipling with 10 it will give decimal value;
                nums[i][j] = (int) (Math.random() * 10) ;
            }
        }

        for(int[] n : nums)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }


    }
}
