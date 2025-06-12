package Week5.Vehicles;

public class LandVehicles {
    private int doors;
    private int windows;

    private boolean hasAc;
    private boolean hasRearviewMirrors;
    private boolean isElectric;


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public boolean isHasAc() {
        return hasAc;
    }

    public void setHasAc(boolean hasAc) {
        this.hasAc = hasAc;
    }

    public boolean isHasRearviewMirrors() {
        return hasRearviewMirrors;
    }

    public void setHasRearviewMirrors(boolean hasRearviewMirrors) {
        this.hasRearviewMirrors = hasRearviewMirrors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}


