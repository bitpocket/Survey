/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Leon
 */
public class Os {
    static String OS = System.getProperty("os.name").toLowerCase();
	
    public static OsType getOs() {

        if (isWindows()) {
            return OsType.Windows;
        } else if (isMac()) {
            return OsType.Mac;
        } else
            return OsType.Undefined;
    }

    public static boolean isWindows() {
        return (OS.contains("win"));
    }

    public static boolean isMac() {
        return (OS.contains("mac"));
    }
    
}
