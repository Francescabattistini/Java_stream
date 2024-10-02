public class Customer {
     String name;
    Long id;
    Integer tier;

    public Customer(Long id, Integer tier, String name) {
        this.id = id;
        this.tier = tier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tier=" + tier +
                '}';
    }
}
