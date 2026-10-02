import java.util.function.Function;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args){
        Vehicle vehicle= new Vehicle("001",120,"AMBULANCE",true);
        Intersection intersection=new Intersection("001","GREEN",5);
        EmergencyOverride emergency = (v , i) -> (v.getType().equals("AMBULANCE") || v.getType().equals("POLICE")) && i.getCongestionLevel() > 7 ;
        System.out.println(emergency.shouldOverride(vehicle , intersection));

        Predicate<Vehicle> SpeedPridicate = RuleFactory.createSpeedLimitRule(300);
        System.out.println(SpeedPridicate.test(vehicle));

        Function<Intersection, Integer> SignalTiming = RuleFactory.calculateGreenLightDuration();
        System.out.println(SignalTiming.apply(intersection));



    }
}

