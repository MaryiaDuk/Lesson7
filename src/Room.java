import java.util.ArrayList;

public class Room {
    private String name;
    private int square;
    private int windows;
    ArrayList<Bulb> bulbs = new ArrayList<>();
    ArrayList<Furniture> furnitureArrayList = new ArrayList<>();

    public Room(String name, int square, int windows) throws IlluminationLimitException {
        this.name = name;
        this.square = square;
        this.windows = windows;
        IlluminationTest();
    }

    public void IlluminationTest() throws IlluminationLimitException {
        int intensitySum = 0;
        for (Bulb b : bulbs) {
            intensitySum += b.getIntensity();
        }
        intensitySum += windows * 700;
        if (intensitySum > 4000 || intensitySum < 300) {
            throw new IlluminationLimitException("Достигнут лимит по освещенности");
        }
    }

    public void SpaceTest() throws SpaceLimitException{
        int sum = 0;
        for (Furniture furniture : furnitureArrayList) {
            sum += furniture.getSquare();
        }
        if (sum > square * 0.7) throw new SpaceLimitException("Достигнут лимит по площади");
    }

    public void add(Bulb bulb) throws IlluminationLimitException {
        bulbs.add(bulb);
        IlluminationTest();
    }

    public void add(Furniture furniture) throws SpaceLimitException {
        SpaceTest();
        furnitureArrayList.add(furniture);
    }

    public String getName() {
        return name;
    }

    public int getSquare() {
        return square;
    }

    public int getWindows() {
        return windows;
    }

    public ArrayList<Bulb> getBulbs() {
        return bulbs;
    }

    public ArrayList<Furniture> getFurnitureArrayList() {
        return furnitureArrayList;
    }

    public int getFreeOfSquare() {
        int sum = 0;
        for (Furniture furniture : furnitureArrayList) {
            sum += furniture.getSquare();
        }
        return square - sum;
    }

    public int getIlluminationWindows(){
        return windows*700;
    }
}