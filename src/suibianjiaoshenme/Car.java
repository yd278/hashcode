package suibianjiaoshenme;

import java.util.ArrayList;

public class Car {
    public int index;
    public Position lastPosition;
    public int lastTime;
    public ArrayList<Ride> assigned= new ArrayList<>();
    public void pick(Ride ride){
        assigned.add(ride);
        int pickTime = lastTime+Position.dist(lastPosition,ride.start);
        lastTime = pickTime+Position.dist(ride.start,ride.end);
        lastPosition = ride.end;
    }

}
