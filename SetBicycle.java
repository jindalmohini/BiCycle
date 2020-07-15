class BiCycle
{
    protected String size,chain,tire_size;
    public BiCycle(String size,String tire_size)
    {
        this.size=size;
        this.chain="10-speed";
        this.tire_size=tire_size;
    }
}

class RoadBike extends BiCycle
{

    private String tape_color;
    public RoadBike(String size,String tape_color)
    {
        super(size,"23");
        this.tape_color=tape_color;

    }
     public void setSpares()
    {
        
         System.out.println(" Size:"+this.size+"\n chain="+this.chain+"\n tire_size="+this.tire_size+"\n tape_color="+this.tape_color);
    }
}
class MountainBike extends BiCycle
{
    private String front_shock,rear_shock;
    public MountainBike(String size,String front_shock,String rear_shock)
    {

        super(size,"2.1");
        this.front_shock=front_shock;
        this.rear_shock=rear_shock;
    }
    public void setSpares()
    {
        
         System.out.println(" size:"+this.size+" \n chain="+this.chain+"\n tire_size="+this.tire_size+"\n rear_shock:"+this.rear_shock);
       
    }
}

   
public class SetBicycle
{
     public static void main(String args[])
    {
        System.out.println("\nRoadBike:");
        RoadBike rbike=new RoadBike("M","RED");
         rbike.setSpares();
         System.out.println("\nMountainBike:");
        MountainBike mbike=new MountainBike("S","MAintou","Fox");
          mbike.setSpares();
    }
}