public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, String priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public static void main(String args[]) {
        System.out.println("hello");
    }
};


class Rental {
    private Movie _movie;
    private int _dayRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _dayRented = daysRented;
    }

    public int getDaysRented() {
        return _dayRented;
    }

    public Movie getMovie() {
        return _movie;
    }
};

class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRentalPoints = 0;
        Enumeration rentals = _rentals.elemnts();
    }
};

