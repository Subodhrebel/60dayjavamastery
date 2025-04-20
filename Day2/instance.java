package Day2;
class instance {

    
    public String first;
    public int i;
    public Integer I;
    public instance()
    {
        
        this.first = "Subodh kumar";
    }

    
    public static void main(String[] args)
    {
        
        instance name = new instance();

        
        System.out.println("first name is: " + name.first);
        System.out.println("Default value for int is "+ name.i);
      
        
        System.out.println("Default value for Integer is "+ name.I);
    }
}