/*
 *  This file is part of the Alchemy project - http://al.chemy.org
 * 
 *  Copyright (c) 2007 Karl D.D. Willis
 * 
 *  Alchemy is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  Alchemy is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with Alchemy.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package alchemy.ui;

import alchemy.AlcConstants;
import javax.swing.BorderFactory;
import javax.swing.JMenu;

public class AlcMenu extends JMenu implements AlcConstants {

    public AlcMenu(String title) {

        this.setText(title);
        this.setContentAreaFilled(false);
        //this.setMnemonic(KeyEvent.VK_A);
        //this.getAccessibleContext().setAccessibleDescription("Some decription text");
        //this.setOpaque(false);
        // Top Left Bottom Right
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 2));
        this.setBackground(AlcToolBar.toolBarHighlightColour);
        this.setFont(AlcToolBar.toolBarFont);

    }
}