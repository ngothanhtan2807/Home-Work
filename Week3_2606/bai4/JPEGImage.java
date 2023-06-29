package Week3_2606.bai4;

public class JPEGImage extends Image implements Filter {

    @Override
    public void applyFilter() {
        System.out.println("Filter image");
    }

    @Override
    public void display() {
        System.out.println("Display image");
    }

    @Override
    public void resize() {
        System.out.println("Resize image");
    }

    @Override
    public void rotate() {
        System.out.println("Rotate image");
    }

}
