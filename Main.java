public class Main {

    public static void main(String[] args) {

        ApiEndpoint api1 = new ApiEndpoint(
            "Google",
            "https://www.google.com",
            true
        );

        ApiEndpoint api2 = new ApiEndpoint(
            "GitHub",
            "https://github.com",
            true
        );

       ApiEndpoint api3 = new ApiEndpoint(
        "YouTube",
            "https://www.youtube.com",
            true
        );
         ApiEndpoint api4 = new ApiEndpoint(
            "Netflix",
            "https://www.netflix.com",
            false
        );

        

        api1.displayDetails();

        System.out.println("--------------------");

        api2.displayDetails();

        System.out.println("--------------------");

        api3.displayDetails();

         System.out.println("--------------------");

        api4.displayDetails();

        System.out.println("--------------------");

        System.out.println("Before update: " + api1.isEnabled());

api1.setEnabled(false);

System.out.println("After update: " + api1.isEnabled());

 System.out.println("Original name: " + api1.getName());

api1.setName("Google");
System.out.println("After valid update: " + api1.getName());

api1.setName("");
System.out.println("After empty update: " + api1.getName());

api1.setName(null);
System.out.println("After null update: " + api1.getName());

api1.setName("  ");
System.out.println("After whitespace update: " + api1.getName());   
}
}
