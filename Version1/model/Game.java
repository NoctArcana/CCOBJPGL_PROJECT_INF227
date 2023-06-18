package model;

abstract class Game {

    private String gameID;
    private String gameName;
    private String gameGenre;
    private double gamePrice;
    private String gameImage;
    private boolean availStock = true;
    private boolean isSelected = false;
    private double qty;

    public String getGameID() {
        return this.gameID;
    }

    public void setGameID(String id) {
        this.gameID = id;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String name) {
        this.gameName = name;
    }

    public String getGameGenre() {
        return this.gameGenre;
    }

    public void setGameGenre(String genre) {
        this.gameGenre = genre;
    }

    public double getGamePrice() {
        return this.gamePrice;
    }

    public void setGamePrice(double price) {
        this.gamePrice = price;
    }

    public boolean getGameNoStock() {
        return this.availStock;
    }

    public void setGameNoStock(boolean stock) {
        this.availStock = stock;
    }

    public String getGameImage() {
        return this.gameImage;
    }

    public void setGameImage(String path) {
        this.gameImage = path;
    }

    public boolean getGameStatus() {
        return this.isSelected;
    }

    public void setGameStatus(boolean status) {
        this.isSelected = status;
    }

    public double getGameQuantity() {
        return this.qty;
    }

    public void setGameQuantity(double quantity) {
        this.qty = quantity;
    }
}