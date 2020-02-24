package day43;

public class Pet {
    private String type;
   private String name;

   public Pet(){
       type="unknown";
       name="no name";

   }


    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        if (type.equalsIgnoreCase("cat")) {
            System.out.println("Meow");
        } else if (type.equalsIgnoreCase("dog")) {
            System.out.println("Hav-hav");
        } else if (type.equalsIgnoreCase("cow")) {
            System.out.println("Moo-moo");
        } else if (type.equalsIgnoreCase("horse")) {
            System.out.println("Iii-ha-ha-ha");

        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }



    public static void showGeneralPetinfo(){
        System.out.println("Pets are friend of humans");
    }

}