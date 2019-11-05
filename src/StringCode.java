import javax.lang.model.SourceVersion;
import javax.lang.model.element.NestingKind;

public class StringCode {
    public static void main(String[] args) {
        String name = "Liya Yohannes Brown";
        System.out.println("name = " + name);
        System.out.println("name = " + name);
        System.out.println(name.length());
        String upper = name.toUpperCase();
        System.out.println("upper = " + upper);
        System.out.println("name = " + name);
        name = name + "\t Programmer";
        System.out.println("name = " + name);
        int x = name.indexOf('Y');
        System.out.println("x = " + x);
        int y = name.toUpperCase().indexOf('B');
        System.out.println("x = " + y);

        boolean foundOrNot = name.contains ("nes");
        System.out.println("foundOrNot = " + foundOrNot);

        boolean isDr = name.startsWith("Dr");
        System.out.println("isDr = " + isDr);

        int firstA = name.indexOf('a');
        System.out.println("firstA = " + firstA);


        String replace = name.replace ("a", "_");
        System.out.println("replace = " + replace);

        replace = name.replace("r", "012345".charAt( (int) (Math.random()*5))+"");
        System.out.println("replace = " + replace);

        String[] names = name.split(" ");
        System.out.println();

        String me = "Liya Yohannes Brown";
        System.out.println("name = " + me);

        int age = 42;
        System.out.println("age = " + age);
    }
}
