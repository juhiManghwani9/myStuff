package Hotel;

import java.util.*;

public class HotelUserIteraction {
    static HotelOperations hot = new HotelOperations();
    static Scanner scan = new Scanner(System.in);

    public static ArrayList<hotelAttributes> addHotel()
    {
        ArrayList<hotelAttributes> hotels = new ArrayList<>(6);

        hotelAttributes hotel = new hotelAttributes("h1",4,3,"abc",1000);
        hotels.add(hotel);
        hotelAttributes hotel1 = new hotelAttributes("h2",4,5,"bcd",1000);
        hotels.add(hotel1);
        hotelAttributes hotel2 = new hotelAttributes("h3",4,2,"try",1000);
        hotels.add(hotel2);
        hotelAttributes hotel3 = new hotelAttributes("h4",4,1,"abc",1000);
        hotels.add(hotel3);
        hotelAttributes hotel4 = new hotelAttributes("h5",4,6,"row",1000);
        hotels.add(hotel4);
        hotelAttributes hotel5 = new hotelAttributes("h6",4,4,"abc",1000);
        hotels.add(hotel5);

        return hotels;
    }

    public static void sortRatings(ArrayList<hotelAttributes> h1)
    {
        h1 = hot.sortRating(h1);
        for(int i =0 ;i < h1.size(); i++)
        {
            System.out.println(h1.get(i).toString());
        }
    }

    public static void filterbyLoc(ArrayList<hotelAttributes> h1,String loc)
    {
        h1 = hot.filterByLoc(h1,loc);
        for(int i =0 ;i < h1.size(); i++)
        {
            System.out.println(h1.get(i).toString());
        }
    }

    public static ArrayList<hotelAttributes> bookRooms(ArrayList<hotelAttributes> h1, String hotelId, int noOfRooms, String loc)
    {
        return hot.bookHotel(h1,hotelId,noOfRooms,loc);

    }
    /*public static void sortPrice(ArrayList<hotelAttributes> h1)
    {
        for(int i =0 ;i < h1.size(); i++)
        {
            System.out.println(h1.get(i));
        }
    }*/
    public static void main(String[] args)
    {
        ArrayList<hotelAttributes> hotels1 = new ArrayList<>(6);
        hotels1 = addHotel();
        ArrayList<hotelAttributes> glbhotel = addHotel();
        ArrayList<User> users = new ArrayList<>();
        System.out.println("Enter yr name in nos:");
        int id = scan.nextInt();
        HashMap<User,Bookings> ma = new HashMap<>();
        while (id > 0 && !users.contains("UD"+id)) {
            users.toString();
            users.add(new User("UD" + id));
            int contd = 1;
            while (contd == 1) {

                System.out.println("Operations:\n 1.sort by rating \n 2.filter by loc \n 3. book rooms \n 4. All the booking of a particular hotel");
                int op = scan.nextInt();
                switch (op) {
                    case 1:
                        sortRatings(hotels1);
                        break;
                    case 2:
                        filterbyLoc(hotels1, "row");
                        break;
                    case 3:
                        hotels1 = bookRooms(hotels1, "h2", 2, "bcd");
                        Bookings b = new Bookings("h2",2,"bcd");
                        ma.put(new User("UD" + id),b);
                        for (User key : ma.keySet()) {
                        System.out.println(key);
                    }

                    break;
                    case 4:
                        hot.allBookingByHotel(hotels1,glbhotel,"h2");
                    case 5:
                        hot.allBookingsbyUser(ma, new User("UD" + id));

                }
                System.out.println("Do you want to contd(1/0)");
                contd = scan.nextInt();

            }
            System.out.println("want to try new user, enter id no:");
            id = scan.nextInt();
        }

        //sortPrice(hotels1);




    }
}
