public class Fewest{
    private String tempStr;

    public void fewestComparisons(double temp){
        if (temp < 40) {
            tempStr = "cold";
        } else if (temp < 60 && temp >= 40) {
            tempStr = "cool";
        } else if (temp < 80 && temp >= 60) {
            tempStr = "warm";
        } else if (temp >= 80) {
            tempStr = "hot";
        }
        System.out.println(tempStr);
    }

}