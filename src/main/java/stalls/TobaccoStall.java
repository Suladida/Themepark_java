package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    int minAge = 15;
    Visitor visitor = new Visitor(12,120,12);

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        if (age > minAge) {
            return true;
        }
        else { return false; }
    }
}
