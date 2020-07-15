package randomDataGenerator;

import tShirt.Color;
import tShirt.Fabric;

import tShirt.Size;
import tShirt.Tshirt;

import java.util.Random;
public class RandomTshirtFactory {
	
	public static Tshirt getRandomTshirt() {
		
		Size size = randomSize();
		String name = randomName();
		Color color = randomColor();
		Fabric fabric = randomFabric();
		double price = generatePrice(size,fabric);
		
		Tshirt rdm= new Tshirt( name,  price,  size,  color,  fabric);
		return rdm;
	}

	
	 private static double generatePrice(Size size, Fabric fabric) {
       
        double price = size.ordinal()*30/2 + fabric.ordinal()*50/3;
        return price;
    }

	 private static Size randomSize() {
        Random random = new java.util.Random();
        Size[] sizes = Size.values();
        int randomNumber = random.nextInt(sizes.length);
        return sizes[randomNumber];
    }

    private static String randomName() {
    	
     String[]	names = {"Aloha", "Baseball", "Camp",
                "Epaulette", "Lumberjack", "Granddad", "Golf",
                "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
        
    	
        Random random = new Random();
        int randomNumber = random.nextInt(names.length);
        return names[randomNumber];
    }

    private static Color randomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber];
    }

    private static Fabric randomFabric() {
        Random random = new Random();
        Fabric[] fabrics = Fabric.values();
        int randomNumber = random.nextInt(fabrics.length);
        return fabrics[randomNumber];
    }
	
	
}
