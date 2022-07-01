public class PasswordValidation {

    public static void main(String[] args) {

    }
    public static int PasswordLength(String password) {
        return password.length();
    }

    public static boolean NumbersIncluded(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean ContainUpperCase(String password) {
        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean PassCheck(String password) {
        if(PasswordLength(password)>=8 && NumbersIncluded(password) && ContainUpperCase(password))
        return true;
        else return false;
            }
    }