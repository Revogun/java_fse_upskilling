
public class Main {
    public static void main(String[] args) {
        
        Computer basicPC = new Computer.Builder("Intel i5", "8GB", "512GB SSD")
                .build();

       
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB", "1TB NVMe")
                .setGraphicsCard("NVIDIA RTX 4070")
                .setWifiCard("Intel AX200")
                .build();

        System.out.println("=== Basic PC Config ===");
        basicPC.showConfig();

        System.out.println("\n=== Gaming PC Config ===");
        gamingPC.showConfig();
    }
}
