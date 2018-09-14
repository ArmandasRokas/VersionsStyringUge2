import java.util.Scanner;

public class Kinematics {

    public static void main(String[] args) {

        double altitude; // meters
        double time;  // seconds
        double finalSpeed;  // m/s
        double accelerationSpeed = 9.82; // m/s*s

        Scanner s = new Scanner(System.in);
// test 2
        System.out.print("Enter altitude: ");
        altitude = s.nextDouble();

        time = Math.sqrt(2*altitude/accelerationSpeed);
        finalSpeed = accelerationSpeed*time;

        System.out.println("It is going to take: " + time + " seconds");
        System.out.println("And the final speed is: " + finalSpeed + " m/s");
        s.close();
    }
}

