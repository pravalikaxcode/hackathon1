import java.util.Scanner;
public class Water {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter water consumption: ");
int water = sc.nextInt();
if (water <= 500) {
System.out.println("Water Bill: Rs.100");
} 
else {
System.out.println("Water Bill: Rs.200");
}
}
}