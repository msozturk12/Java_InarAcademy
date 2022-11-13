package weeks.week_14;

public class Animal {
    protected double weight;
    protected double height;
    protected boolean hasSwimmingSkills;
    protected boolean hasFlyingSkills;

    public Animal() {
        this(0, 0, false, false);
    }


    public Animal(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return this.hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }


    public void runs() {
        System.out.println("Animal can run");
    }

    public void eats() {
        System.out.println("Animal eats....");
    }

    public void sleeps() {
        System.out.println("Nocturnal");

    }
@Override
    public String toString() {
        return String.format("Weight:%s\nHeight:%s\nhasFlyingSkill:%s\nhasSwimmingSkills:%s",weight,height,hasFlyingSkills,hasSwimmingSkills);
    }
}






