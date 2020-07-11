class Gear
{
    int chainRing,cog;
    double ratio;
    Gear(int chainRing,int cog)
    {
        this.chainRing=chainRing;
        this.cog=cog;
    }
    double getRatio()
    {
        ratio=(double)chainRing/cog;
        return ratio;
    }
}
public class BicycleProblem
{
    public static void playWithGear()
    {
        Gear big=new Gear(52,11);
        Gear small=new Gear(30,27);
        System.out.println("Ratio Of Big Gear="+big.getRatio());
        System.out.println("Ratio of Small Gear="+small.getRatio());
    }
    public static void main(String args[])
    {
        playWithGear();
    }
}