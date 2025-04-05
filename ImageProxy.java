public class ImageProxy implements Image{
    private String imageName;
    private ImageImpl imageImpl;
    public ImageProxy(String imageName){
        if(imageName.substring(imageName.length()-4).contains(".png") ||
                imageName.substring(imageName.length()-4).contains(".jpg") ||
                imageName.substring(imageName.length()-5).contains(".webp")){
            this.imageName=imageName;

            displayLowRes();
        }
        else{
            throw new IllegalArgumentException("file have to contain .png, .jpg or .webp in the end");
        }
    }
    public void displayLowRes(){
        System.out.println("Displaying low-resolution thumbnail: "+imageName);
    }
    public void displayFullImage(){
         if(imageImpl==null){
             imageImpl=new ImageImpl(imageName);

         }
         imageImpl.displayFullImage();
    }
}
