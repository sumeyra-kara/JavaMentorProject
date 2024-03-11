package day32_inheritance;

public class Z02_Parent extends Z01_GrantParent{
    static {
        System.out.println("2");
    }
    public Z02_Parent() {
       super("name");
       System.out.println("Parent constructor");
    }
}
