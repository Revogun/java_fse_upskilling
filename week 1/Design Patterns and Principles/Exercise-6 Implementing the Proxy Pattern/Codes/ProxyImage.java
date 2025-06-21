import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private static Map<String, RealImage> cache = new HashMap<>();
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        RealImage image = cache.get(filename);
        if (image == null) {
            image = new RealImage(filename);
            cache.put(filename, image);
        }
        image.display();
    }
}
