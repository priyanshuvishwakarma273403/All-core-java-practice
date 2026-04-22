package lldFlightWeight;

import java.util.HashMap;
import java.util.Map;

class AsteroidFlyweight{
    // Intrinsic properties (shared among asteroids of same type)
    private int length;
    private int width;
    private int weight;
    private String color;
    private String texture;
    private String material;

    public AsteroidFlyweight(int l, int w, int wt, String col, String tex, String mat) {
        this.length = l;
        this.width = w;
        this.weight = wt;
        this.color = col;
        this.texture = tex;
        this.material = mat;
    }

    public void render(int posX, int posY, int velocityX, int velocityY) {
        System.out.println("Rendering " + color + ", " + texture + ", " + material
                + " asteroid at (" + posX + "," + posY
                + ") Size: " + length + "x" + width
                + " Velocity: (" + velocityX + ", "
                + velocityY + ")");
    }

    public static long getMemoryUsage() {
        return Integer.BYTES * 3 + 40 * 3;
    }
}

class AsteroidFactory{
    public static Map<String, AsteroidFlyweight> flyweights = new HashMap<>();

    public static AsteroidFlyweight getAsteroid(int length, int width, int weight, String color, String texture, String material) {
        String key = length + "_" + width + "_" + weight + "_" + color + "_" + texture + "_" + material;

        if(!flyweights.containsKey(key)){
            flyweights.put(key, new AsteroidFlyweight(length, width, weight, color, texture, material));
        }
        return flyweights.get(key);
    }

    public static int getFlyweightCount(){
        return flyweights.size();
    }

    public static long getTotalFlyweightMemory() {
        return flyweights.size() * AsteroidFlyweight.getMemoryUsage();
    }

    public static void cleanup() {
        flyweights.clear();
    }
}


public class WithFlightWeight {
    public static void main(String[] args) {

    }
}
