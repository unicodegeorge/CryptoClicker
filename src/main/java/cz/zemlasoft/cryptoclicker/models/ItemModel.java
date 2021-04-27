package cz.zemlasoft.cryptoclicker.models;

public class ItemModel {
    int itemId;
    String itemName;
    int currencyPerSecond;
    String itemDescription;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCurrencyPerSecond() {
        return currencyPerSecond;
    }

    public void setCurrencyPerSecond(int currencyPerSecond) {
        this.currencyPerSecond = currencyPerSecond;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
