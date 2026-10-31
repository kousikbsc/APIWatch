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
    }
}