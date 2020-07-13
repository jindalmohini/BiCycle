
class Gear
{
   private int chainRing,cog;
    private double ratio;
    wheel wheel;
   
    Gear(int chainRing,int cog,wheel wheel)
    {
        this.chainRing=chainRing;
        this.cog=cog;
        this.wheel=wheel;
    }
   public double getRatio()
    {
        ratio=(double)chainRing/cog;
        return ratio;
    }
    public double gearInches()
    {
        this.getRatio();
        return ratio*diameter();
    }
    public double diameter()
    { 
       return wheel.diameter();
    }
}
 class wheel{
        private double rim,tyre,PI=3.14;
        wheel(double rim,double tyre)
        {
            this.rim=rim;
            this.tyre=tyre;
        }
        public double diameter()
        {
            return rim+(2*tyre);
        }
        public double circumference()
        {
            return PI*diameter();
        }
    }



public class BicycleProblem
{
  /*  public static void playWithGearRatio()
    {
        Gear big=new Gear(52,11);
        Gear small=new Gear(30,27);
        System.out.println("Ratio Of Big Gear="+big.getRatio());
        System.out.println("Ratio of Small Gear="+small.getRatio());
    }*/

     public static void playWithGearInches()
    {
        Gear g1=new Gear(52,11,(new wheel(26,1.5)));
       // wheel w1=new wheel(26,1.5);
       // System.out.println("Diameter of tyre="+w1.diameter());
        //System.out.println("circumference of wheel="+w1.circumference());
        System.out.println("Gear Inches for Gear1="+g1.gearInches());
        
    }

    public static void main(String args[])
    {
       // System.out.println("function: playWithGearRatio");
        //playWithGearRatio();
        System.out.println("function:playWithGearInches");
        playWithGearInches();
    }
}