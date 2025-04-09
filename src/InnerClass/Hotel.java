package InnerClass;

public class Hotel {
    private String name ;
    private int totalRooms;
    private int reservedRooms ;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getReservedRooms() {
        return reservedRooms;
    }

    public void setReservedRooms(int reservedRooms) {
        this.reservedRooms = reservedRooms;
    }
    public void reserveRoom(String guestName , int noOfRooms) {
        class ReserveValidator {
            boolean validate() {
                if ( guestName == null || guestName.isBlank()) {
                    System.out.println("Guest name can't be empty !");
                    return false ;
                }
                if (noOfRooms < 0) {
                    System.out.println("Number of room can not be negative or less than zero 😀");
                    return false ;
                }
                if ( reservedRooms + noOfRooms > totalRooms) {
                    System.out.println("Not enough rooms are available");
                    return false ;
                }
                return true ;
            }
        }

        ReserveValidator reserveValidator = new ReserveValidator() ;
        if (reserveValidator.validate()){
            reservedRooms+=noOfRooms ;
            System.out.println("Reservation confirmed for " + guestName + " for " + noOfRooms + " rooms in hotel" + name );
        }
        else {
            System.out.println("Reservation failed ! ");
        }
    }
}
