package day49;

public interface Edible {

  public  static final boolean ISFOOD =true;

//  public Burger(){
//      super();
//  }


    public abstract void eat();
   abstract void  drink();
    default void digest(){
      System.out.println("digeeesttt");
    }



}
