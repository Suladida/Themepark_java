package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    int minAge = 15;
    Visitor visitor = new Visitor(12,120,12);
    Visitor visitor2 = new Visitor(50,170,120);

    public Playground(String name, int rating) {
        super(name, rating);
        minAge = minAge;
        visitor = visitor;
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
