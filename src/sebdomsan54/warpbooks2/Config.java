package sebdomsan54.warpbooks2;


public class Config{
    public final Main main;

    public Config(Main main) {
        this.main = main;
    }

    public void buildConfig() {
        main.getConfig().addDefault("warpItem", "WRITTEN_BOOK");
        main.getConfig().options().copyDefaults(true);
        main.saveConfig();
    }
}
