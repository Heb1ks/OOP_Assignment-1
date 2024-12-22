public class Sport {
    private String name;
    private String type;
    private String rules;

    public Sport(String name, String type, String rules) {
        this.name = name;
        this.type = type;
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void displayInfo() {
        System.out.println("Sport: " + name);
        System.out.println("Type: " + type);
        System.out.println("Rules: " + rules);
    }
}
