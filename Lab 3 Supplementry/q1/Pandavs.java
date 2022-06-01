class Pandavs extends Bharatvanshi
 {
     protected int kindness;
     protected int obedience;
     public Pandavs() { kindness=obedience=10; }

     public void SetKindness(int x) { kindness=x; }
     public void SetObedience(int x) { obedience=x; }
     public int GetKindness() { return(kindness); }
     public int GetObedience() { return(obedience); }

     @Override public void fight()
     {
        System.out.println(" Kauravs fight ");
     }

     public void kind() 
     {
        System.out.println(" kindness = " + kindness);
     }

    public void obey()
    {
       System.out.println(" obedience = " + obedience);
    }
 }