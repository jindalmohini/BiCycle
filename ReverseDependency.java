
class Gear1
{
   private int chainRing,cog;
    private double ratio;
   
    Gear1(int chainRing,int cog)
    {
        this.chainRing=chainRing;
        this.cog=cog;
    }
   public double getRatio()
    {
        ratio=(double)chainRing/cog;
        return ratio;
    }
    public double gearInches(double diameter)
    {
        this.getRatio();
        return ratio*diameter;
    }
   
}
 class wheel1{
        private double rim,tyre,PI=3.14;
        Gear1 gear;
        wheel1(double rim,double tyre,Gear1 gear)
        {
            this.rim=rim;
            this.tyre=tyre;
            this.gear=gear;
        }
        public double diameter()
        {
            return rim+(2*tyre);
        }
        public double gearInches()
        {
        return gear.gearInches(diameter());
         }

        public double circumference()
        {
            return PI*diameter();
        }
    }



public class ReverseDependency
{
  
     public static void playWithReverseDependency()
    {
       
         wheel1 w1=new wheel1(26,1.5,(new Gear1(52,11)));
        System.out.println("Gear Inches for Gear1="+w1.gearInches());
        
    }

    public static void main(String args[])
    {
       // System.out.println("function: playWithGearRatio");
        //playWithGearRatio();
        System.out.println("function:playWithGearInches");
        playWithReverseDependency();
    }
}