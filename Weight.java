public class Weight {
    private int pounds;
    private int ounces;

    public Weight(int ounces) {
        this(ounces, 0);
    }



    public Weight(int ounces, int pounds) {
        if(ounces >= 0) {
            if(ounces < 16){
                this.ounces = ounces;
            }
        }
        if(pounds > 0) {
            this.pounds = pounds;
        }

    }

    public int totalOunces() {
        return this.ounces + 16 * this.pounds;
    }



    public boolean isHeavier(Weight other) {
        int totalW = this.totalOunces();  
        int otherW = other.totalOunces(); 
        if(totalW > otherW)
            return true;
        else
            return false;     
        //return totalW > otherW;   (same thing)
    }

    public Weight multiple(int scale) {
        int total = this.totalOunces() * scale;
        int p = total / 16; 
        int o = total % 16;   // or total - (p*16);
        return new Weight(p, o);
    }

    public void print(){
        System.out.println(this.pounds + " pounds " + this.ounces + " ounces");
    }

}