package Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HotelOperations {
    HotelOperations(){};

    public ArrayList<hotelAttributes> sortRating(ArrayList<hotelAttributes> h1)
    {

        Collections.sort(h1, new hotelAttributes());
        return h1;
    }

    /*public ArrayList<hotelAttributes> sortPrice(ArrayList<hotelAttributes> h1)
    {
        Collections.sort(h1, new hotelAttributes());
        return h1;
    }*/

    public ArrayList<hotelAttributes> filterByLoc(ArrayList<hotelAttributes> h1,String loc)
    {
        ArrayList<hotelAttributes> h2 = new ArrayList<>();
        for(int i = 0; i< h1.size(); i++)
        {
            if(h1.get(i).getLoc() == loc)
                h2.add(h1.get(i));
        }
        return h2;
    }

    public ArrayList<hotelAttributes> bookHotel(ArrayList<hotelAttributes> hotel,String hotelId,int noOfRooms,String loc)
    {
        for(int i =0 ; i< hotel.size(); i++)
        {
            if(hotel.get(i).getHotelId() == hotelId)
            {
                if(hotel.get(i).getTotRooms() >= noOfRooms && hotel.get(i).getLoc() == loc){
                    hotel.get(i).setTotRooms(hotel.get(i).getTotRooms() - noOfRooms);
                    System.out.println("Room Successfull booked");
                }
                else
                {
                    System.out.println("Sorry, we are available with only" + hotel.get(i).getTotRooms()  + "rooms");
                }

            }
        }
        return hotel;

    }

    public void allBookingByHotel(ArrayList<hotelAttributes> hotel,ArrayList<hotelAttributes> glbhotel,String hotelId)
    {
        boolean found = false;
        int rooms = 0;
        for(int i = 0; i < glbhotel.size();i++)
        {
            if(glbhotel.get(i).getHotelId() == hotelId)
            {
                rooms = glbhotel.get(i).getTotRooms();
                System.out.println(rooms);
                found = true;
                break;
            }
        }
        if(found) {
            for (int i = 0; i < hotel.size(); i++) {
                if (hotel.get(i).getHotelId() == hotelId) {
                    System.out.println(rooms +" "+ hotel.get(i).getTotRooms());
                    if(rooms > 0 && hotel.get(i).getTotRooms() > 0 && rooms > hotel.get(i).getTotRooms())
                    {
                        hotelAttributes h1 = new hotelAttributes(hotelId,(rooms - hotel.get(i).getTotRooms()),hotel.get(i).getRating(),hotel.get(i).getLoc(),hotel.get(i).getPrice());
                        System.out.println(h1.toString());

                    }
                    else if(hotel.get(i).getTotRooms() == 0)
                    {
                        hotelAttributes h1 = new hotelAttributes(hotelId,(rooms - hotel.get(i).getTotRooms()),hotel.get(i).getRating(),hotel.get(i).getLoc(),hotel.get(i).getPrice());
                        System.out.println(h1.toString());
                    }
                    break;
                }
            }


        }

    }

    public void allBookingsbyUser(HashMap<User,Bookings> map,User u1)
    {
        for(int i =0 ; i < map.size() ; i++)
        {
            System.out.println(map.get("UD1").toString());
        }
    }

}
