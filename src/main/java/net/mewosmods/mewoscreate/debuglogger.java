package net.mewosmods.mewoscreate;

public class debuglogger {
    public static boolean commandlog;
    public static void logcommands() {
        if(commandlog) {
            System.out.println("onregistercommands exists");
        }

    }
}
