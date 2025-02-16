//import java.util.Scanner;
//
//public class GetMemberDetails {
//    static Scanner sc = new Scanner(System.in);
//
//    //id has to start with M followed by 4 nums
//    public static String getMemberId()
//    {
//        do{
//            System.out.println("Enter member ID: ");
//            String memberId = sc.nextLine();
//            if(memberId.length() != 5 || !memberId.startsWith("M") || !memberId.substring(1).matches("[0-9]+"))
//            {
//                System.out.println("Invalid member ID. Please enter a valid member ID.");
//            }
//            else
//            {
//                return memberId;
//            }
//        }while (true);
//    }
//
//    // checks that the name only contains letters ans spaces
//    public static String getMemberName()
//    {
//        do{
//            System.out.println("Enter member name: ");
//            String memberName = sc.nextLine();
//            if(!memberName.toLowerCase().matches("[a-z\\s]+"))
//            {
//                System.out.println("Name cannot contain numbers. Please enter a valid name.");
//            }
//            else
//            {
//                return memberName;
//            }
//        }while(true);
//
//    }
//
//    public static String getMembershipType() {
//        do {
//            System.out.println("Enter membership type: ");
//            String type = sc.nextLine().toLowerCase();
//            if (!type.equals("monthly") && !type.equals("yearly") && !type.equals("premium")) {
//                System.out.println("Invalid membership type. Please enter a valid membership type.");
//            } else {
//                return type;
//            }
//        } while (true);
//    }
//
//    //email has to have @ and .com separated by at least 1 character
//    public static String getMemberEmail()
//    {
//        do{
//            System.out.println("Enter member email: ");
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
//    //has to be 11 digits long
//    public static String getMemberPhoneNumber()
//    {
//        do{
//            System.out.println("Enter member phone number: ");
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
//    public static String getMemberStatus()
//    {
//        do{
//            System.out.println("Enter member Status(active/cancelled): ");
//            String status = sc.nextLine().toLowerCase();
//            if(!status.equals("active") && !status.equals("cancelled"))
//            {
//                System.out.println("Invalid status. Please enter a valid status.");
//            }
//            else
//            {
//                return status;
//            }
//        }while(true);
//    }
//
//    public static void getMemberDetails()
//    {
//        String memberId = getMemberId();
//        String memberName = getMemberName();
//        String membershipType = getMembershipType();
//        String memberEmail = getMemberEmail();
//        String memberPhoneNumber = getMemberPhoneNumber();
//        String memberStatus = getMemberStatus();
//
//        Main.trainerRole.addMember(memberId, memberName,membershipType,memberEmail, memberPhoneNumber, memberStatus);
//    }
//}
