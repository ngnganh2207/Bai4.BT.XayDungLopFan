public class Fann {
    private final int SLOW=1;
    private final int MEDIUM = 2;
    private final int FAST=3;
    private int speed= SLOW;
    private boolean on= false;
    private double radius=5;
    private String color="blue";
    public Fann(){}
    public Fann(int speed,boolean on,double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(){
        this.color=color;
    }
    @Override
    public String toString() {
        if(this.on){
            return "speed: "+ this.speed+
                    ",radius: "+this.radius+
                    ", color: "+this.color+" fan is on";
        }else {
            return "color: " +this.color+
                    ", radius: "+ this.radius+ " fan is off";
        }
    }
    //Hỏi lại bài này
    public static void main(String[] args) {
        //Fann fan1= new Fann();
        //fan1.setSpeed(fan1.SLOW);
        //fan1.setOn(true);
        //System.out.println(fan1.toString());
        Fann fan0=new Fann();
        Fann fan1= new Fann(fan0.FAST, true,10,"yellow");
        System.out.println(fan1.toString());
        Fann fan2= new Fann(fan0.MEDIUM,false,5,"blue");
        System.out.println(fan2.toString());
    }
}
