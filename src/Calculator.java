public class Calculator {
    private double double1;
    private double double2;
    public Calculator(double double1, double double2){
        this.double1 = double1;
        this.double2 = double2;

    }
    public double add(){
        return double1 +double2;
    }
    public double subtract(){
        return double1-double2;
    }
    public double multiply(){
        return double1*double2;
    }
    public double divide(){
        return double1/double2;
    }
    public double mod(){
        return double1%double2;
    }
    public double exponent(){
        return Math.pow(double1,double2);
    }
    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100)/100.000;

    }

}
