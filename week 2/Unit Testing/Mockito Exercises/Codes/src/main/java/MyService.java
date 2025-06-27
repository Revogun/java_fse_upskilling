public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }

    public void processData(String data) {
        externalApi.sendData(data);
    }

    public String fetchDataMultipleTimes() {
        StringBuilder sb = new StringBuilder();
        sb.append(externalApi.getData()).append(" | ");
        sb.append(externalApi.getData()).append(" | ");
        sb.append(externalApi.getData());
        return sb.toString();
    }

    public void executeRiskyAction() {
        externalApi.riskyAction();
    }

    public void callSequence() {
        externalApi.getData();
        externalApi.sendData("Ordered Call");
    }
}
