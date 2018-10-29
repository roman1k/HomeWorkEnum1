

public enum Countries {
    China("China"), Korea("Korea"), India("India"), USA("USA");

    private String name;

    Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
