class Bicycle
{
    private String size;
    private Parts parts;
    Bicycle(String size,Parts parts)
    {
        this.size=size;
        this.parts=parts;
    }
    public void spares()
    {
        parts.spares();
    }
}
/*class Parts
{
    private String chain,tire_size;
    Parts(String tire_size)
    {
        this.chain="10-speed";
        this.tire_size=tire_size;
    }
    public String getChain()
    {
        return "10-speed";
    }
    public void spares()
    {
        System.out.println("\n tire_size:"+tire_size+"\n chain :"+getChain());
    }
}
class RoadBike extends Parts
{
    private String tape_color;
    RoadBike(String tape_color)
    {
        super("23");
        this.tape_color=tape_color;
    }
    public void spares()
    {
        super.spares();
        System.out.println("tape_color :"+this.tape_color);
    }

    
}*/
class Parts
{
    private Part[] part;
    Parts(Part... part)
    {
       this.part=part;
    }
    public void spares()
    {
        for(int i=0;i<part.length;i++)
        {
            if(part[i].need_spares==true)
            System.out.print(part[i].name+":"+part[i].description+"\n");
        }
    }
}
class Part
{
    public String name,description;
    public Boolean need_spares;
    Part(String name,String description,Boolean need_spares)
    {
        this.name=name;
        this.description=description;
        this.need_spares=need_spares;
    }
}
/*class MountainBike extends Parts
{
    private String front_shock,rear_shock;
    MountainBike(String front_shock,String rear_shock)
    {
        super("2.1");
        this.front_shock=front_shock;
        this.rear_shock=rear_shock;
    }
    public void spares()
    {
        super.spares();
        System.out.println("rear_shock :"+this.rear_shock);
    }
   
}*/
class CompositionBicycle
{
    public static void playWithPartObject()
    {
        Part chain=new Part("chain","10-speed",true);
        Part road_tire=new Part("tire_size","23",true);
        Part tape=new Part("tape_color","red",true);
        Part mountain_tire=new Part("tire_size","2.1",true);
        Part front_shock=new Part("front_shock","Manitou",false);
        Part rear_shock=new Part("rear_shock","Fox",true);
       /* System.out.println("RoadBike:  ");
       Part road_bike_parts=new Parts(chain,road_tire,tape);
        road_bike_parts.spares();
        System.out.println("MountainBike:  ");
        Parts mountain_bike_parts=new Parts(chain,mountain_tire,front_shock,rear_shock);
        mountain_bike_parts.spares();*/
         System.out.println("RoadBike:  ");
        Bicycle road_bike=new Bicycle("L",new Parts(chain,road_tire,tape));
        road_bike.spares();
         System.out.println("MountainBike:  ");
        Bicycle mountain_bike=new Bicycle("L",new Parts(chain,mountain_tire,front_shock,rear_shock));
        mountain_bike.spares();
    }
    public static void main(String args[])
    {
        System.out.println("Function:playWithPartObject\n");
        playWithPartObject();
    }
}
