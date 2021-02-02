package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    int minHeight = 145;
    int minAge = 12;
    Visitor visitor = new Visitor(12,120,12);
    Visitor visitor2 = new Visitor(50,210,120);

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        double height = visitor.getHeight();
        int age = visitor.getAge();
        if (height > minHeight && age > minAge) {
            return true;
        }
        else { return false; }
    }


    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200){
        return (defaultPrice() * 2);} else {return defaultPrice();}
    }
}
