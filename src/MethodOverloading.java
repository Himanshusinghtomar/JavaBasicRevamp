class Calculator{
    public int add(int num, int num2)
    {
        return num + num2;
    }
    //method overloading signature
    public int  add(int num, int num2,int num3)
    {
        return num + num2 + num3;
    }

}


public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int r1 = cal.add(3,4);

        System.out.println(r1);

        int r2 = cal.add(3,4,8);

        System.out.println(r2);

    }
}
