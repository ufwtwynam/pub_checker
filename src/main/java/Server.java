import java.util.ArrayList;

public class Server {

    private ArrayList<Guest> banList = new ArrayList<>();

    public boolean canServeGuest(Guest guest){
        //check if age over 18
        if(guest.getAge() >= 18 &&              //if guest older than 18 AND
                guest.getWallet() >= 5 &&       //if wallet more than 5 AND
                guest.getSoberLevel() >= 50 &&  //if soberLevel 100-50 AND
                !(banList.contains(guest)) &&   //if guest not on banList
                guest.getCurrency() == '£'      //if guest has currency type £
        ) {
            return true;
        }
        return false;
    }

    public ArrayList<Guest> getBanList(){
        return banList;
    }

    public void addToBanList(Guest guest){
        this.banList.add(guest);
    }
}
