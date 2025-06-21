
public class Computer {
    
    private String cpu;
    private String ram;
    private String storage;

    private String graphicsCard;
    private String wifiCard;

   
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiCard = builder.wifiCard;
    }

   
    public void showConfig() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "None"));
        System.out.println("WiFi Card: " + (wifiCard != null ? wifiCard : "None"));
    }

    
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String wifiCard;

        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWifiCard(String wifiCard) {
            this.wifiCard = wifiCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
