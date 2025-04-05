import java.util.Set;
import java.util.HashSet;
public class ManageImagesImpl implements ManageImages{
    private Set<String> images;
    public static boolean verifyFile(String imageName){
        if(imageName.substring(imageName.length()-4).contains(".png") ||
                imageName.substring(imageName.length()-4).contains(".jpg") ||
                imageName.substring(imageName.length()-5).contains(".webp")) {
            return true;
        }
        return false;

    }
    public ManageImagesImpl(){
        images=new HashSet<>();
    }
    public void uploadNewImage(String imageName){
         if(verifyFile(imageName)){
             images.add(imageName);
             System.out.println(imageName +" was uploaded successfully");
         }
         else{
             throw new IllegalArgumentException("file must contain .png, .jpg or .webp in the end");
         }
    }

    public void replaceImage(String oldImage, String newImage){
        if(verifyFile(newImage)){
            if(images.contains(oldImage)){
                images.remove(oldImage);
                images.add(newImage);
                System.out.println(oldImage+" was replaced with "+newImage+" successfully");
            }
            else{
                System.out.println("There is no such image: "+oldImage);
            }
        }
        else{
            throw new IllegalArgumentException(" file "+newImage+" must contain .png, .jpg or .webp in the end");
        }

    }
    public void uploadedImages(){
        System.out.println("Uploaded images:");
        for(String i:images){
            System.out.println(i);
        }
    }

}
