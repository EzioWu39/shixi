/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.function;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author VC
 */
public class Window {
    public static void setWindowCenter(Component cp) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		cp.setLocation (screenSize.width / 2 - (cp.getWidth() / 2), 
						screenSize.height / 2 - (cp.getHeight() / 2));
	}
}
