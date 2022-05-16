package statisticker;

import java.util.List;


public class StatsChecker{

private float maxThershold;

private IAlerter[] alerters;


public StatsChecker(float thersholdLimit, IAlerter[] alerters){
this.maxThershold=thersholdLimit;
this.alerters=alerters;

}

public void checkAndAlert(List<Float>  numbers){
for(int i=0; i< numbers.size(); i++){
 if(numbers.get(i)>this.maxThershold){
       this.alerters[0].setEmailSent(true);
       this.alerters[1].setLedGlows(true);
 }

}
}
}
