public class methode {
    public static void main(String[] args)
    {
        int finaladdition=add(2,3,4);
        System.out.println("this is my addition" + finaladdition);
        int finalsubstraction=sub(20,5,4);
        System.out.println("this is my substraction" + finalsubstraction);
    }
    /**
     * this is my addition methode
     * @param a
     * @param b
     * @param c
     * @return
     */
    static int add(int a,int b, int c)
    {
        int add =(a+b+c);
        return add;
    }
    static int sub (int d,int e,int f)
    {
        int sub =(d-e-f);
        return sub;
    }
}
