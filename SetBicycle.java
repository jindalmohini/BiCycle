class BiCycle
{
    private String size,tape_color,chain,tire_size;
    public BiCycle(String size,String tape_color)
    {
        this.size=size;
        this.tape_color=tape_color;
    }
    public void setSpares()
    {
        chain="10-speed";
        tire_size="23";
    }
    public void display()
    {
        System.out.println("size="+this.size+"\n Tape_Color="+this.tape_color+"\n chain="+this.chain+"\n tire_size="+this.tire_size);
}

}
public class SetBicycle
{
     public static void main(String args[])
    {
        BiCycle bike=new BiCycle("M","red");
        bike.setSpares();
        bike.display();
    }
}