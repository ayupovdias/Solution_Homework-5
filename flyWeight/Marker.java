public class Marker {
    private String name;
    private double x;
    private double y;
    private MarkerStyle style;
    public Marker(String name, double x, double y, MarkerStyle style) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.style = style;
    }
    public void render(){
        style.display(name,x,y);
    }
}
