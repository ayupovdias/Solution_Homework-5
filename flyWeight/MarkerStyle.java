public class MarkerStyle{
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    public void display(String name, double x, double y){
        System.out.println("Market: "+name+" is in "+x+" "+y+" with icon "+icon);
    }
}