package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Room livingRoom = new Room(2, 3, 4);
        Room bathroom = new Room(1, 2, 0);
        Room kitchen = new Room(1, 5, 1);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(livingRoom);
        rooms.add(bathroom);
        rooms.add(kitchen);

        Building apartment = new Building(rooms, 1, 2, false);

        int lampsInTotal = countLampsInBuilding(rooms);
        System.out.println("Lamps in the building: " + lampsInTotal);

        isNormal(apartment);
    }
        public static int countLampsInBuilding(ArrayList<Room> rooms)
        {
            int count = 0;

            for (int i = 0; i < rooms.size(); i++)
            {
                count = count + rooms.get(i).getNumberOfLamps();
            }
            return count;
        }

        public static void isNormal(Building building)
        {
            int count = building.getRooms().size();
           if(building.getNumberOfFloors() > count)
           {
               System.out.println("This is a normal building");
           }
           else {
               System.out.println("This is an odd building");
           }
        }

}
