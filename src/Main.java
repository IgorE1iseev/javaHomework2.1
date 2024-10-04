public class Main {

    public static void main(String[] args) {

        int ticketPrice = 15000;
        int bonusMile = 20;

        int bonusReceived = ticketPrice / bonusMile;

        System.out.println("За купленный билет начислено " + bonusReceived + " бонусных миль.");

    }
}
