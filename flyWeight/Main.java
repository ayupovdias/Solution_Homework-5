import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Marker> markers=new ArrayList<>();
        for(int i=1;i<=1000;i++){
            MarkerStyle markerStyle;
            if(i%3==0){
                markerStyle=FlyWeight.getStyle("gas station", "orange","italic");
            }
            else if(i%3==1){
                markerStyle=FlyWeight.getStyle("restaurant", "red","arial");
            }
            else{
                markerStyle=FlyWeight.getStyle("hospital", "green","gray");
            }
            markers.add(new Marker("Marker"+i,i*1.1,i*1.1,markerStyle));
        }
        System.out.println(FlyWeight.getTotalStyles());
        System.out.println(markers.size());
    }
}
