package me.upp.library.intelligod;

import me.upp.library.intelligod.tables.TblUsers;
import net.royalmind.library.lightquery.SimpleSourceBuilder;

public class ExampleClass {

    private static final IntelliGod ROOT = IntelliGod.init(
            new SimpleSourceBuilder()
                    .setUrl("jdbc:mysql://localhost:3306/bddatos?useSSL=false")
                    .setUser("root")
                    .setPassword("")
                    .build()
    );

    public static void main(final String[] args) {
        ROOT.create("test", "test", 123);
        System.out.println(ROOT.read(3));
        ROOT.update(11, TblUsers.NAME.getValue(), "testEdited");
        ROOT.delete(14);
    }
}
