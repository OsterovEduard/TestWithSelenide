public class BrowserProperty {
    private final String browser;
    private final String url;
    private final boolean maximized;

    public BrowserProperty(String browser, String url, boolean maximized) {
        this.browser = browser;
        this.url = url;
        this.maximized = maximized;
    }

    public String getBrowser() {
        return browser;
    }

    public String getUrl() {
        return url;
    }

    public boolean isMaximized() {
        return maximized;
    }
}
