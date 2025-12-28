public class assignmentswapvariables {
    public static void main(String[] args) {
        int i= 7;
        int j= 10;

        i=i^j;
        j=i^j;
        i=i^j;

        System.out.println(i);
        System.out.println(j);
    }
}
