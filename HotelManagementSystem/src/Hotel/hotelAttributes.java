package Hotel;

import java.util.Comparator;

public class hotelAttributes implements Comparator<hotelAttributes> {
    String hotelId;
    int totRooms;
    int rating;
    String Loc;
    int price;
    public enum roomType {classic,delux}

    public hotelAttributes() {
    }

    public hotelAttributes(String hotelId, int totRooms, int rating, String loc, int price) {
        this.hotelId = hotelId;
        this.totRooms = totRooms;
        this.rating = rating;
        Loc = loc;
        this.price = price;
    }

    public String getHotelId() {
        return hotelId;
    }

    public int getTotRooms() {
        return totRooms;
    }

    public int getRating() {
        return rating;
    }

    public String getLoc() {
        return Loc;
    }

    public int getPrice() {
        return price;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setTotRooms(int totRooms) {
        this.totRooms = totRooms;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "hotelAttributes{" +
                "hotelId='" + hotelId + '\'' +
                ", totRooms=" + totRooms +
                ", rating=" + rating +
                ", Loc='" + Loc + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(hotelAttributes h, hotelAttributes h1) {
        if (h1.getRating() < 0  || h.getRating() < 0) {
            return 0;
        }
        if(h1.getRating() > h.getRating())
            return 1;
        else if (h1.getRating() < h.getRating())
            return -1;
        else
            return 0;
    }
}
