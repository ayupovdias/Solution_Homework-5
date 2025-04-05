public class ManageImagesProxy implements ManageImages{
    private ManageImagesImpl manageImagesImpl;
    private boolean isAgent;
    public ManageImagesProxy(boolean isAgent){
        this.isAgent=isAgent;
    }
    public void uploadNewImage(String imageName){
        if(isAgent) {

                if(manageImagesImpl==null){
                    manageImagesImpl=new ManageImagesImpl();
                }
                manageImagesImpl.uploadNewImage(imageName);


        }
        else{
            System.out.println("Only agents can upload an image");
        }
    }
    public void replaceImage(String oldImage, String newImage){
         if(isAgent){
            manageImagesImpl.replaceImage(oldImage, newImage);
         }
         else{
            System.out.println("Only agents can replace an image");
        }
    }
    public void uploadedImages(){
        manageImagesImpl.uploadedImages();
    }

}