package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    Visitor visitor = new Visitor(11,120,12);
    Visitor visitor2 = new Visitor(50,170,120);

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
        return (defaultPrice() / 2); } else {
            return defaultPrice();
        }
    }
}
