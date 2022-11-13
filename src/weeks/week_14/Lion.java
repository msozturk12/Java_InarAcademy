package weeks.week_14;

public class Lion extends Animal {
    private double tailSize;

    public Lion() {
        super();
        super.hasFlyingSkills = true;//parents class için
        this.tailSize = 10;
        //hasFlyingSkills=true;

        // this(10, 750, 20, true, false);
    }

    public Lion(double tailSize) {
        super(100,100,true,false);
        this.tailSize = tailSize;

    }

    public double getTailSize() {
        return this.tailSize;
    }

    public void setTailSize(double tailSize) {
        this.tailSize = tailSize;

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
        return hasSwimmingSkills;
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

    public void roar() {
        System.out.println("Lion can roar");
    }

    @Override
    public void eats() {
        System.out.println("Lion eat");
    }


    @Override
    public String toString(){
        return "Lion TailSize-->" + tailSize;
    }
}
