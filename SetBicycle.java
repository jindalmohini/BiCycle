class BiCycle
{
    private String size,tape_color,chain,tire_size,style,front_shock,rear_shock;
    public BiCycle(String style,String size,String tape_color)
    {
        this.size=size;
        this.tape_color=tape_color;
        this.style=style;
    }
    public BiCycle(String style,String size,String front_shock,String rear_shock)
    {
        this.size=size;
        this.style=style;
        this.front_shock=front_shock;
        this.rear_shock=rear_shock;
    }
    public void setSpares()
    {
        if(style.equals("mountain"))
        {
         System.out.println(" chain=10-speed"+"\n tire_size=2.1"+"\n rear_shock:"+this.rear_shock);
        }
        else
        System.out.println(" chain=10-speed"+"\n tire_size=23"+"\n tape_color:"+this.tape_color);
        
    }
   


}
public class SetBicycle
{
     public static void main(String args[])
    {
        BiCycle bike=new BiCycle("mountain","S","MAintou","Fox");
        bike.setSpares();
    }
}