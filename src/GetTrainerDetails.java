//import java.util.Scanner;
//
//public class GetTrainerDetails {
//    static Scanner sc = new Scanner(System.in);
//// SAME VALIDATIONS AS MEMBER
//    public static String getTrainerId()
//    {
//        do{
//            System.out.println("Enter trainer ID: ");
//            String trainerId = sc.nextLine();
//        if(trainerId.length() != 5 || !trainerId.startsWith("T") || !trainerId.substring(1).matches("[0-9]+"))
//            {
//                System.out.println("Invalid trainer ID. It should begin with 'T' followed by 4 digits.");
//            }
//            else
//            {
//                return trainerId;
//            }
//        }while(true);
//    }
//
//    public static String getTrainerName()
//    {
//        do{
//            System.out.println("Enter trainer name: ");
//            String trainerName = sc.nextLine();
//            if(!trainerName.toLowerCase().matches("[a-z\\s]+"))
//            {
//                System.out.println("Please enter a valid name.");
//            }
//            else
//            {
//                return trainerName;
//            }
//        }while (true);
//    }
//
//    public static String getTrainerEmail()
//    {
//        do{
//            System.out.println("Enter trainer email: ");
//            String email = sc.nextLine();
//            if(!email.contains("@") || !email.contains(".com") || email.indexOf('@') > (email.indexOf('.') - 2))
//            {
//                System.out.println("Invalid email. Please enter a valid email.");
//            }
//            else
//            {
//                return email;
//            }
//        }while(true);
//    }
//
//    public static String getTrainerPhoneNumber()
//    {
//        do{
//            System.out.println("Enter trainer phone number: ");
//            String phoneNumber = sc.nextLine();
//            if(phoneNumber.length() != 11 || !phoneNumber.startsWith("01") || !phoneNumber.substring(2).matches("[0-9]+"))
//            {
//                System.out.println("Invalid phone number. Please enter a valid phone number.");
//            }
//            else
//            {
//                return phoneNumber;
//            }
//        }while(true);
//    }
//
//    public static String getTrainerSpecialty()
//    {
//        System.out.println("Enter trainer specialty: ");
//        return sc.nextLine();
//    }
//
//    public static void getTrainerDetails()
//    {
//        String trainerId = getTrainerId();
//        String trainerName = getTrainerName();
//        String trainerEmail = getTrainerEmail();
//        String trainerPhoneNumber = getTrainerPhoneNumber();
//        String trainerSpecialty = getTrainerSpecialty();
//        Main.adminRole.addTrainer(trainerId, trainerName, trainerEmail, trainerSpecialty, trainerPhoneNumber);
//    }
//}
