public class Problem3 {
    public static void main (String args[]) {
        double x = 67.3424;

        double temp = x - (int)x; 
        int bemp = (int) (temp * 1000);
        System.out.println(bemp); 

        int digit1 = (bemp/100) % 10;
        int digit2 = (bemp/10) % 10;
        int digit3 = bemp % 10;
    

        System.out.print("First three digits: " + digit1 + " " + digit2 + " " + digit3);
}
}