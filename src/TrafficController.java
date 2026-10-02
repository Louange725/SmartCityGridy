import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class TrafficController {
    BiPredicate<Vehicle, Intersection> StopLogic = (vehicle, intersection) -> intersection.getCurrentLight().equals("RED") && !vehicle.isAutonomous() ||
            vehicle.isEmergency();

    BiConsumer<Vehicle, Intersection> TheActionExecutor = (vehicle, intersection) -> {
        if (StopLogic.test(vehicle, intersection)) {
            System.out.println(intersection.getIntersectionID() + ": Vehicle " + vehicle.getId() + "command to Stop");
        } else {
            System.out.println(intersection.getIntersectionID() + ": Vehicle " + vehicle.getId() + "roting through");
        }


    };

    action.TheActionExecutor (vehicle,intersectin);
    return StopLogic(vehicle, intersection);


}
}
