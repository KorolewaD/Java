class Hall{
    private int hallNumber;
    private int capacity;
    private String type;

    public Hall(int hallNumber, int capacity, String type){
        this.hallNumber = hallNumber;
        this.capacity = capacity;
        this.type = type;
    }
    public int getHallNumber() {
        return hallNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}
