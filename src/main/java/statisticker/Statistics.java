package statisticker;

import java.util.List;

public class Statistics 
{
    
    public static class Stats {
        
        public float average;
        public float min;
        public float max;
    }
    
    public static Stats getStatistics(List<___> numbers) {
        Stats stats= new Stats();
        stats.average=getAverage(numbers);
        stats.min=getMin(numbers);
        stats.max=getMax(numbers);
        
        return stats;
    }
    
    
    public static float getAverage(List<Float> numbers){
    float sum=0;
        for(int i=0; i<numbers.size(); i++){
        sum=sum+numbers.get(i);
        }
        
        return (sum/numbers.size());
    }
    
    public static float getMin(List<Float> numbers){
    float min=numbers.get(0);
     for(int i=1; i<numbers.size(); i++){
        if(min>numbers.get(i)){
            min=numbers.get(i);
        }
        }
        return min;
    }
    
    public static float getMax(List<Float> numbers){
    float max=numbers.get(0);
     for(int i=1; i<numbers.size(); i++){
        if(max<numbers.get(i)){
            max=numbers.get(i);
        }
        }
        return max;
    }
}
