public class SumFactorial {
//    public static void main(String args[]){
//        int x=1;
//        long ifactorail = 1;
//        float sum = 0;
//        while(x<=20){
//            ifactorail = ifactorail*x;
//            sum = sum + (float)1/ifactorail;
////            System.out.println(ifactorail);
////            System.out.println(1/ifactorail);
////            System.out.println(sum);
//            x++;
//        }
//        System.out.println(sum);
//    }

    public static void main(String args[])
    {
        double sum = 0,a = 1;
        int i = 1;
        while(i <= 20)
        {
            sum = sum+a;
            i = i+1;
            a = a*(1.0/i);
        }
        System.out.println(sum);
    }
}
