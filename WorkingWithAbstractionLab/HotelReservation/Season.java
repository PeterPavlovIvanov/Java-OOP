package WorkingWithAbstractionLab.HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int seasonNum;

    Season(int seasonNum) {
        this.seasonNum = seasonNum;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

}
