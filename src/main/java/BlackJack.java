public class BlackJack extends Game{

    public BlackJack() {
        super();
    }

    public void playBlackJack() {
        Player player = (Player) this.getPlayers().get(0);
        Dealer dealer = this.getDealer();

        Integer playerHandValue = player.getRankTotal();
        Integer dealerHandValue = dealer.getRankTotal();

        int playerProximity = 21 - playerHandValue;
        int dealerProximity = 21 - dealerHandValue;

        if(playerHandValue > 21 && dealerHandValue <= 21) {
            this.setWinner(dealer);
        } else if(playerHandValue <= 21 && dealerHandValue > 21) {
            this.setWinner(player);
        } else if(playerHandValue == 21 && dealerHandValue != 21) {
            this.setWinner(player);
        } else if(playerHandValue != 21 && dealerHandValue == 21) {
            this.setWinner(dealer);
        } else if(playerHandValue < 21 && dealerHandValue < 21) {
            if(playerProximity < dealerProximity) {
                this.setWinner(player);
            } else {
                this.setWinner(dealer);
            }
        }
    }
}
