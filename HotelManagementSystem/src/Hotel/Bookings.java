package Hotel;

public class Bookings {
    String hotelId;
    int noOfRooms;
    String loc;

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getHotelId() {
        return hotelId;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "hotelId='" + hotelId + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", loc='" + loc + '\'' +
                '}';
    }

    public String getLoc() {
        return loc;
    }

    public Bookings(String hotelId, int noOfRooms, String loc) {
        this.hotelId = hotelId;
        this.noOfRooms = noOfRooms;
        this.loc = loc;
    }
}
