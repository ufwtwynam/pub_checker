import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server; // creates server
    Guest guest; // creates guest

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("Umar", 25);
        guest.setWallet(5, '£');            // set wallet to 5 and currency to £
        guest.setSoberLevel(50);                            // set soberLevel to 100-50
    }

//    Remember bouncer pattern
    // TODO: test that guest can only get served if over 18
    @Test
    public void canOnlyBeServedOver18(){
//        guest needs age
//        check age is over 18
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void cannotBeServedUnder18(){
//        guest needs age
//        check age is over 18
        guest = new Guest("John", 17);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void canOnlyBeServedWithMoney(){
//        guest needs wallet,
//        check wallet greater than 5
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void canOnlyBeServedSober(){
//        guest needs sober level
//        check sobriety level 100-50, under 50 refused
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void notBanned(){
//        server needs banList, an array of Guest
//        check guest isn't on banList
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    @Test
    public void isBanned(){
//        server needs banList, an array of Guest
//        check guest is on banList
        server.addToBanList(guest);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void isLocalCurrency(){
//        guest needs currency type, char of
//        check guest has currency type £
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
