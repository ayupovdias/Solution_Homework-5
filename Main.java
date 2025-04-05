public class Main{
    public static void main(String[] args){
        Image image =new ImageImpl("property.png");
        Image imageOne=new ImageProxy("house.jpg");
        Image imageTwo=new ImageProxy("apartment.webp");
        imageOne.displayFullImage();
        imageTwo.displayLowRes();
        image.displayFullImage();
        imageTwo.displayFullImage();

        
    }
}