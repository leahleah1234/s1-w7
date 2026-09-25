public class Not {
    
    public boolean areIncreasing(int a, int b, int c) {
        //return a < b && b < c; 
        return !(a >= b || b >=c);
    }

    public boolean hasSameSign(int a, int b) {
        //return (a < 0 && b < 0) || (a >= 0 && b >= 0); 

        return a * b > 0; 
    }
}
