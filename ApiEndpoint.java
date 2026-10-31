public class ApiEndpoint {

    private String name;
    private String url;
    private boolean enabled;

    public ApiEndpoint(String name, String url, boolean enabled) {
        this.name = name;
        this.url = url;
        this.enabled = enabled;
    }

    public void displayDetails() {
        System.out.println("API Name: " + name);
        System.out.println("URL: " + url);
        System.out.println("Enabled: " + enabled);
    }
}