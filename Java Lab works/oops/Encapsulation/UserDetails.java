package FWSA;

public class UserDetails {

    public static void main(String[] args) {

            UserData myObj = new UserData();

            myObj.setAccountNumber(638185);
            myObj.setPassword("KASI");

            System.out.println(myObj.getAccountNumber() + " " +myObj.getPassword() );
        }
}
