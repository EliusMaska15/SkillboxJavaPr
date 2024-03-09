
public class infoCargo {
    private final  Dimensions cargo;
    private final int mass;
    private final String deliveryAddress;
    private final boolean canTurn;
    private final String regNumber;
    private final boolean isFragility;
    public infoCargo ( int W, int H, int L, int M, String dA, boolean cT, String rN, boolean iFr ) {
        cargo = new Dimensions( W, H,L);
        mass = M;
        deliveryAddress =dA;
        canTurn = cT;
        regNumber = rN;
        isFragility = iFr;
    }
    public infoCargo (Dimensions C,int M, String dA, boolean cT, String rN, boolean iFr ) {
        cargo = C;
        mass = M;
        deliveryAddress =dA;
        canTurn = cT;
        regNumber = rN;
        isFragility = iFr;
    }
public  infoCargo changeDimensions ( int W, int H ,int L) {
        infoCargo copy = new infoCargo( W, H, L, mass, deliveryAddress,canTurn,regNumber,isFragility);
        return copy;


}
public infoCargo changeMass ( int M) {
        infoCargo copy = new infoCargo( cargo, M, deliveryAddress,canTurn,regNumber,isFragility);
    return copy;

}
    public infoCargo changeDA ( String dA) {
        infoCargo copy = new infoCargo( cargo, mass, dA,canTurn,regNumber,isFragility);
        return copy;
    }


}
  class Dimensions {
      private final int  width;
      private  final int  height;
      private  final int lenght;

      public Dimensions ( int W, int H, int L) {
          width = W;
          height = H;
          lenght = L;
      }
      public int getVolume () {
          int volume = width * height * lenght;
          return volume;
      }


  }


