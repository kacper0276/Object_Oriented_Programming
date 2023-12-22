public class Email implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Wysłanie wiadomości o treści: " + wiadomosc);
    }
}
