package cz.zemlasoft.cryptoclicker.models;

import java.util.ArrayList;

public class PlayerModel {
    //Account info
    int id;
    String username;
    String password;
    String emailAddress;

    //In-game info
    int currencyAmount;
    String currentCurrency;
    ArrayList<ItemModel> inventory = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(int currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public String getCurrentCurrency() {
        return currentCurrency;
    }

    public void setCurrentCurrency(String currentCurrency) {
        this.currentCurrency = currentCurrency;
    }

    public ArrayList<ItemModel> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<ItemModel> inventory) {
        this.inventory = inventory;
    }
}
