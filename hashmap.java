import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reg;
        HashMap<Integer,String> students = new HashMap<>();
        for(int k = 1;k<=n;k++){
            System.out.println("Enter the reg no:");
            reg = sc.nextInt();
            System.out.println("Enter the name:");
            String name = sc.next();
            students.put(reg,name);
        }
        int num;
        System.out.println("Want to search a student Y/N:");
        char choice = sc.next().charAt(0);
        if(choice == 'Y'||choice == 'y')
        {
            System.out.println("Enter the reg no:");
            num = sc.nextInt();
            System.out.println("The student in "+students.get(num));
        }
        else
        {
            System.out.println("Well next time");
        }

    }

}