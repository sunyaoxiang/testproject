package cloneable.java;

abstract public class MainFactory implements Cloneable {

    private String id;
    protected String type;

    abstract void make();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException cerr) {
            cerr.printStackTrace();
        }
        return clone;
    }
}