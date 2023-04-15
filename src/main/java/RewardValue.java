public class RewardValue {

    double cash;
    int miles;
    //constructor 1
    RewardValue(double cash){
        this.cash=cash;
        this.miles=(int)(cash/0.0035);
    }
     //constructor 2
     RewardValue(int miles){
        this.miles=miles;
        this.cash=(double)(miles*0.0035);
     }
     //method for getCashValue
    public double getCashValue(){
        return this.cash;
    }
    //method for getMilesValue
    public int getMilesValue(){
        return this.miles;
    }
}
