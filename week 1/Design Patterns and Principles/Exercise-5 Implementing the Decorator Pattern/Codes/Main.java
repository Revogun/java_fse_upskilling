public class Main {
    public static void main(String[] args) {
        Notifier basic = new EmailNotifier();
        Notifier sms = new SMSNotifierDecorator(basic);
        Notifier slack = new SlackNotifierDecorator(sms);

        slack.send("Server down alert!");
    }
}
