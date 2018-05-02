package study.iteratormodel.java;

/**
 * Created by yaoxiang.sun on 2018/5/2.
 */
public class DriveCars {
    public String cars[] = {"Buick", "Polo", "Volk", "Benci"};

    class CarIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < cars.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return cars[index++];
            }
            return null;
        }
    }

    public Iterator getIterator() {
        return new CarIterator();
    }
}
