public class Cal {
    public static void main(String[] args) {

        int num = 10;
        int num2 = 20;

        //this is a class initialization
        Addition add = new Addition();

        System.out.println(add.calculate(num,num2));


    }
}

class Addition{

    public int calculate(int num1,int num2)
    {
        return  num1 + num2;
    }
}
