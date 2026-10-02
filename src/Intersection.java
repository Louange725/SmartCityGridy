public class Intersection {
    private String intersectionID;
    private String currentLight;
    private int congestionLevel;

    public Intersection(String intersectionID, String currentLight, int congestionLevel) {
        this.intersectionID = intersectionID;
        this.currentLight = currentLight;
        this.congestionLevel = congestionLevel;
    }

    public String getIntersectionID() {
        return intersectionID;
    }

    public void setIntersectionID(String intersectionID) {
        this.intersectionID = intersectionID;
    }

    public String getCurrentLight() {
        return currentLight;
    }

    public void setCurrentLight(String currentLight) {
        this.currentLight = currentLight;
    }
    public int getCongestionLevel() {
        return congestionLevel;
    }
    public void setCongestionLevel(int congestionLevel) {
        this.congestionLevel = congestionLevel;
    }
    @Override
    public String toString() {
        return "Intersection{" +
                "intersectionID='" + intersectionID + '\'' +
                ", currentLight='" + currentLight + '\'' +
                ", congestionLevel=" + congestionLevel +
                '}';
    }
}
