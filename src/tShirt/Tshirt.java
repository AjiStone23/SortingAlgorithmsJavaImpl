package tShirt;

public class Tshirt {
	
	private String name;
    private double price;
    private Size size;
    private Color color;
    private Fabric fabric;
   


    public Tshirt(String name, double price, Size size, Color color, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
    }
    
    
    public Tshirt(Tshirt shirt) {
    	 this.name = shirt.getName();
         this.price = shirt.getPrice();
         this.size = shirt.getSize();
         this.color = shirt.getColor();
         this.fabric = shirt.getFabric();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Tshirt{" + "name=" + name + ", price=" + price + ", size=" + size + ", color=" + color + ", fabric=" + fabric + '}';
    }

}
