import java.util.ArrayList;

public class Building {
    private String name;
    ArrayList<Room> rooms = new ArrayList<Room>();

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(String name, int square, int windows) throws IlluminationLimitException {
       Room room = new Room(name, square, windows);
       rooms.add(room);
    }

    public void add(int roomIndex, Bulb bulb) throws IlluminationLimitException {
      Room room = rooms.get(roomIndex);
      room.add(bulb);
    }

    public void add(int roomIndex, Furniture furniture) throws SpaceLimitException {
        Room room = rooms.get(roomIndex);
        room.add(furniture);
    }

    public void getInformation() {
        ArrayList<Bulb> bulbsList;
        ArrayList<Furniture> furnitureList;
        System.out.println(rooms.get(0).getName());
        bulbsList = rooms.get(0).getBulbs();
        furnitureList = rooms.get(0).getFurnitureArrayList();
        System.out.println("Освещенность = " + rooms.get(0).getWindows() + " окна по " + rooms.get(0).getIlluminationWindows() + " лампочки " + bulbsList.get(0).getIntensity() + " , " + bulbsList.get(1).getIntensity()+ "и "+bulbsList.get(1).getIntensity()+"лк");
        System.out.println("Площадь = " + rooms.get(0).getSquare() + " м^2 " + " свободно " + rooms.get(0).getFreeOfSquare());
        if (rooms.get(0).getFreeOfSquare()==0)System.out.println("Мебели нет");
        else {
            System.out.println("Мебель: ");
            for (Furniture furniture : furnitureList) {
                System.out.println(furniture.getName() + " (площадь " + furniture.getSquare() + "м^2 )");
            }
        }
        System.out.println(rooms.get(1).getName());
        System.out.println("Освещенность = " + rooms.get(1).getWindows() + " окна по " + rooms.get(1).getIlluminationWindows() + " лампочки " + bulbsList.get(1).getIntensity() + " лк и " + bulbsList.get(1).getIntensity());
        System.out.println("Площадь = " + rooms.get(1).getSquare() + " м^2 " + " свободно " + rooms.get(1).getFreeOfSquare());
        if (rooms.get(1).getFreeOfSquare()==0)System.out.println("Мебели нет");
        else {
            System.out.println("Мебель: ");
            for (Furniture furniture : furnitureList) {
                System.out.println(furniture.getName() + " (площадь " + furniture.getSquare() + "м^2 )");
            }
        }
    }
}