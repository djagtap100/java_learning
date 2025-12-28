public class switchcase {
    public static void main(String[] args) {
        int monthnumber=3;
        String monthname ="";
        switch (monthnumber){
            case 1:
                monthname="jan";
                break;
            case 2:
                monthname="feb";
                break;
            case 3:
                monthname="mar";
                break;
            default:
                monthname="not found";
                break;
        }
        System.out.println("2025-"+monthname+"-"+monthnumber);
    }
}
