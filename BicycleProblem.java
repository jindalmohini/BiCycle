class Gear
{
   private int chainRing,cog;
    private double ratio;
    wheel w;
    class wheel{
        private double rim,tyre;
        wheel(double rim,double tyre)
        {
            this.rim=rim;
            this.tyre=tyre;
        }
        public double diameter()
        {
            return rim+(2*tyre);
        }
    }
    Gear(int chainRing,int cog,double rim,double tyre)
    {
         w=new wheel(rim,tyre);
        this.chainRing=chainRing;
        this.cog=cog;
    }
    Gear(int chainRing,int cog){
        this.chainRing=chainRing;
        this.cog=cog;
    }
   public double getRatio()
    {
        ratio=(double)chainRing/cog;
        return ratio;
    }
    public double gearInches()
    {
        this.getRatio();
        return ratio*w.diameter();
    }
}



public class BicycleProblem
{
    public static void playWithGearRatio()
    {
        Gear big=new Gear(52,11);
        Gear small=new Gear(30,27);
        System.out.println("Ratio Of Big Gear="+big.getRatio());
        System.out.println("Ratio of Small Gear="+small.getRatio());
    }

     public static void playWithGearInches()
    {
        Gear g1=new Gear(52,11,26,1.5);
        Gear g2=new Gear(52,11,24,1.25);
        System.out.println("Gear Inches for Gear1="+g1.gearInches());
        System.out.println("Gear Inches for Gear2="+g2.gearInches());
    }

    public static void main(String args[])
    {
        System.out.println("function: playWithGearRatio");
        playWithGearRatio();
        System.out.println("function:playWithGearInches");
        playWithGearInches();
    }
}