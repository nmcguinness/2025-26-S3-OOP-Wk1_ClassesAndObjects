public class SodaCan {

    //region Fields
    private float height;
    private float radius;
    //endregion

    //region Getters & Setters
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    //endregion

    //region Constructors
    public SodaCan() {
        this.radius = 0;
        this.height = 0;
    }

    public SodaCan(float height, float radius)
    {
        this.height = height;
        this.radius = radius;
    }
    //endregion

    //region Class-specific
    public float getSurfaceArea()
    {
        return (float)(2*Math.PI * radius * height + 2*Math.PI*radius*radius);
    }
    public float getVolume()
    {
        return (float)(Math.PI * radius * radius * height);
    }
    //endregion
}
