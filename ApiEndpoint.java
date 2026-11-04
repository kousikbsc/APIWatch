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
    public boolean isEnabled() {
    return enabled;
}
public String getName() {
    return name;
}
public void setName(String name) {
    if (name != null && !name.isBlank()) {
        this.name = name;
    } else {
        System.out.println("API Name cannot be null or empty");
    }
}

public String getUrl() {
    return url;
}

public void setUrl(String url) {
    if (url != null && !url.isBlank()) {
        this.url = url;
    } else {
        System.out.println("API URL cannot be null or empty");
    }
}
    
public void setEnabled(boolean enabled){
    this.enabled=enabled;
}
    public static void main(String[]args){
        ApiEndpoint api1 =new ApiEndpoint("YouTube","https://www.youtube.com",true);
        api1.setName("Google");
        api1.setName("");
        api1.setName(null);
        api1.setName("  ");

    }
}
    
