/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author wcendrzak
 */
public class Log {
    public static void showError(String message) {
        JOptionPane.showMessageDialog(null , message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
