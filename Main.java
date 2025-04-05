public class Main{
    public static void main(String[] args){
        Image image =new ImageImpl("property.png");
        Image imageOne=new ImageProxy("house.jpg");
        Image imageTwo=new ImageProxy("apartment.webp");
        imageOne.displayFullImage();
        imageTwo.displayLowRes();
        image.displayFullImage();
        imageTwo.displayFullImage();

        System.out.println();

        ManageImages manageImages=new ManageImagesProxy(true);
        manageImages.uploadNewImage("flat.webp");
        manageImages.uploadedImages();
        manageImages.uploadNewImage("castle.jpg");
        manageImages.uploadNewImage("villa.png");
        manageImages.uploadedImages();
        manageImages.replaceImage("glad.png","houseOne.jpg");
        manageImages.uploadedImages();
        manageImages.replaceImage("castle.jpg","apartment.png");
        manageImages.uploadedImages();
        manageImages.uploadNewImage("flat.webp");
        manageImages.uploadedImages();
        manageImages.uploadNewImage("flat.jpg");
        manageImages.uploadedImages();
        manageImages.uploadNewImage("flat.jpg");
        ManageImages manage=new ManageImagesProxy(false);
        manage.uploadedImages();
        manage.uploadNewImage("apartment");
        ManageImages manageOne=new ManageImagesProxy(true);
        manageOne.replaceImage("bigHouse.webp","hudehouseOne.jpg");

    }
}