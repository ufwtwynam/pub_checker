public class Guest {

//    variables
    private String name;
    private int age;
    private double wallet;
    private int soberLevel;
    private char currency;

//    constructor
    public Guest(String name, int age){
        this.name = name;
        this.age = age;
        this.wallet = 0;
        this.soberLevel = 0;
    }

//    getter n setters
    public int getAge(){        //get age
        return this.age;
    }

    public double getWallet(){      //get wallet
        return this.wallet;
    }

    public void setWallet(double amount, char currency){   //set wallet
        this.wallet = amount;
        this.currency = currency;
    }

    public int getSoberLevel(){
        return this.soberLevel;
    }

    public void setSoberLevel(int soberLevel){
        this.soberLevel = soberLevel;
    }

    public char getCurrency(){
        return currency;
    }
}
