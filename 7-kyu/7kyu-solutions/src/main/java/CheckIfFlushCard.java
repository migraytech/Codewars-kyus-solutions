import java.util.ArrayList;
import java.util.List;

public class CheckIfFlushCard {


    public static void main(String[] args) {


//        assertEquals(true,Kata.CheckIfFlush(new String[]{"AS", "3S", "9S", "KS", "4S"}));
//        assertEquals(false,Kata.CheckIfFlush(new String[]{"AD", "4S", "7H", "KC", "5S"}));
//        assertEquals(false,Kata.CheckIfFlush(new String[]{"AD", "4S", "10H", "KC", "5S"}));
//        assertEquals(true,Kata.CheckIfFlush(new String[]{"QD", "4D", "10D", "KD", "5D"}));

        String [] cards1 = new String[] {"AS", "3S", "9S", "KS", "4S"};
        String [] cards2 = new String[] {"AD", "4S", "7H", "KC", "5S"};
        String [] cards3 = new String[] {"AD", "4S", "10H", "KC", "5S"};
        String [] cards4 = new String[] {"QD", "4D", "10D", "KD", "5D"};

        System.out.println(CheckIfFlush(cards4));
    }

    public static boolean CheckIfFlush(String [] cards ){

      List<String> newCards = new ArrayList<>();

      for (String card : cards) {
            String newCard = "";
            newCard = card.substring(card.length()-1);
            newCards.add(newCard);
      }

      String first = newCards.get(0);

      for (String newCard : newCards) {
            if (!newCard.equals(first)) {
                return false;
            }
      }
        return true;
    }




}
