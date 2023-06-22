
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int ownPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
      
        return Math.abs(ownPrice - comparedPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int ownPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        
        if(ownPrice > comparedPrice){
            return true;
        }
        return false;
    }
}
