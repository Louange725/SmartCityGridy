import java.util.function.Function;
import java.util.function.Predicate;

public class RuleFactory {
    public static Predicate<Vehicle>createSpeedLimitRule(int maxSpeed){
        Predicate<Vehicle>vehiclePredicate=(v)->v.getSpeedKmh()>maxSpeed;
        return vehiclePredicate;
    }
    public static Function<Intersection, Integer> calculateGreenLightDuration(){
        Function<Intersection, Integer>CacSecond = i->i.getCurrentLight().equals("GREEN")?i.getCongestionLevel()-2:30;
        return CacSecond;

    }


    }

