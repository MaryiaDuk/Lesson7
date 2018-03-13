public class Main {
    public static void main(String[] args) {
        Building building = new Building("Образовательный центр");
        try {
            building.addRoom("Аудитория 57", 30, 5);
            building.addRoom("Аудитория 54", 30, 5);
        } catch (IlluminationLimitException e) {
            e.printStackTrace();
        }
        try {
            building.add(0, new Bulb(125));
            building.add(0, new Bulb(150));
            building.add(0, new Bulb(150));
            building.add(1, new Bulb(150));
            building.add(1, new Bulb(120));
        } catch (IlluminationLimitException e) {
            e.printStackTrace();
        }
        try {
            building.add(0, new Furniture("Столы", 15));
            building.add(0, new Furniture("Стулья", 10));
            building.add(1, new Furniture("Стулья", 10));
        } catch (SpaceLimitException e) {
            e.printStackTrace();
        }
        building.getInformation();
    }
}