import java.util.Map;
import java.util.HashMap;
public class FlyWeight {
    private static Map<String, MarkerStyle> map=new HashMap<>();
    public static MarkerStyle getStyle(String icon,String color,String labelStyle){
        String all=icon+color+labelStyle;
        if(!map.containsKey(all)){
            map.put(all,new MarkerStyle(icon,color,labelStyle));
        }
        return map.get(all);
    }
    public static int getTotalStyles(){
        return map.size();
    }

}

