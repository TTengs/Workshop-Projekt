package workshop.projekt;



public class Aktuator {
    
    private double value;
    private String name;
    
    public Aktuator(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Aktuator { " + "value = " + getValue() + ", name = " + getName() + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}