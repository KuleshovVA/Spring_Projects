package Spring_introduction;

public interface Pet {
    public default void say(){
        System.out.println("Bow-Wow");

    }
}
