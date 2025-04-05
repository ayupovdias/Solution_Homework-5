public interface ManageImages {
    void uploadNewImage(String imageName);
    void replaceImage(String oldImage,String newImage);
    void uploadedImages();
}
