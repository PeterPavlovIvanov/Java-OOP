package WorkingWithAbstractionLab.HotelReservation;

public class PriceCalculator {
    private Reservation reservation;

    public PriceCalculator(Reservation reservation) {
        this.reservation = reservation;
    }

    public double Calculate() {
        double result =
                this.reservation.getNumberOfDays() * this.reservation.getPricePerDay() *
                        this.reservation.getSeason().getSeasonNum();
        double discount = (result * this.reservation.getDiscountType().getPercentage()) / 100.00;

        result -= discount;
        return result;
    }

}
