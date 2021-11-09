package u5pp;
public class MyMath{

    public static int abs(int x){
        x = Math.abs(x);
        return x;
    }
        public static double abs(double x){
            x = Math.abs(x);
            return x;
        }
            public static double pow(double base, int exponent){
                double ans;
                ans = Math.pow(base, exponent);
                return ans;
            }
            public static int perfectSqrt(int x){
                double sqrt = Math.sqrt(x);
                if (sqrt % 1 == 0.0){
                    x = (int)sqrt;
                }
                else{
                    x = -1;
                }
                return x;
            }

}