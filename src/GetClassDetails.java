//
//import java.util.Scanner;
//
//public class GetClassDetails {
//    static Scanner sc = new Scanner(System.in);
//
//    public static String getClassId()
//    {
//        do{
//            System.out.println("Enter class ID: ");
//            String classId = sc.nextLine();
//            if(classId.length() != 4 || !classId.startsWith("C") || !classId.substring(1).matches("[0-9]+"))
//            {
//                System.out.println("Invalid class ID. Please enter a valid class ID.");
//            }
//            else
//            {
//                return classId;
//            }
//        }while(true);
//    }
//
//    public static String getClassName()
//    {
//       do {
//           System.out.println("Enter class name: ");
//              String className = sc.nextLine();
//              if(!className.toLowerCase().matches("[a-z\\s]+"))
//              {
//                  System.out.println("Invalid class name. Please enter a valid class name.");
//              }
//              else
//              {
//                  return className;
//              }
//       }while(true);
//    }
//
//    public static int getClassDuration()
//    {
//        do{
//            System.out.println("Enter class duration: ");
//            int duration = sc.nextInt();
//            sc.nextLine();
//            if(duration < 0)
//            {
//                System.out.println("Invalid duration. Please enter a valid duration.");
//            }
//            else
//            {
//                return duration;
//            }
//        }while(true);
//    }
//
//    public static int getAvailableSeats()
//    {
//        do{
//            System.out.println("Enter available seats: ");
//            int availableSeats = sc.nextInt();
//            sc.nextLine();
//            if(availableSeats < 0)
//            {
//                System.out.println("Invalid number of seats. Please enter a valid number of seats.");
//            }
//            else
//            {
//                return availableSeats;
//            }
//        }while(true);
//    }
//
//
//    public static void getClassDetails(String trainerId)
//    {
//        String classId = getClassId();
//        String className = getClassName();
//        int classDuration = getClassDuration();
//        int availableSeats = getAvailableSeats();
//
//        Main.trainerRole.addClass(classId,className,trainerId, classDuration, availableSeats);
//    }
//}
