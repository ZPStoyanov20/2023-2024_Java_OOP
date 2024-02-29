class Dell extends Laptop{
    public Dell()
    {

    }
    public Dell(String name)
    {
        super(name);
    }
    public String getDetails()
    {
        return getName();
    }
}
