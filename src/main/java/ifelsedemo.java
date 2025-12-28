public class ifelsedemo {
    public static void main(String[] args) {
        int age =23;
        String agegroup="";

        if(age<=18){
            agegroup ="Child";
        }else {
            agegroup ="Adult";
        }
        System.out.println(agegroup);

        int weight= 65;
        String weightgroup= weight<=70?"Light":"Heavy";

        System.out.println(weightgroup);
    }
}
