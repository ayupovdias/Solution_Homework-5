public class ImageImpl implements Image{
    private String imageName;
    public ImageImpl(String imageName){
        if(imageName.substring(imageName.length()-4).contains(".png") ||
                imageName.substring(imageName.length()-4).contains(".jpg") ||
                imageName.substring(imageName.length()-5).contains(".webp")) {
            this.imageName = imageName;
            load();

        }
        else{
            throw new IllegalArgumentException("file must contain .png, .jpg or .webp in the end");
        }
    }
    private void load(){
        System.out.println(imageName+" was loaded");
    }
    public void displayLowRes(){
        System.out.println("Low-resolution thumbnail "+imageName+" is displayed");
    }
    public void displayFullImage(){
        System.out.println("High-resolution image "+imageName+" is being displayed");
    }
}
