public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");
        Image img3 = new ProxyImage("photo1.jpg");

        img1.display();
        img2.display();
        img3.display();
    }
}
