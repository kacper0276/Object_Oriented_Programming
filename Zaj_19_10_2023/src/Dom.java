public class Dom {
    public int area;
    public int rooms;
    public boolean garage;
    public boolean garden;
    public int floors;

    public int valueHouse() {
        return area * 3000;
    }

    public Dom(int area, int rooms, boolean garage, boolean garden, int floors) {
        this.area = area;
        this.rooms = rooms;
        this.garage = garage;
        this.garden = garden;
        this.floors = floors;
    }

    public Dom() {}

}
