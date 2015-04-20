/**
 * 
 */
package com.iproject.server.inventory;

import java.util.Arrays;

import com.iproject.api.entity.player.Human;
import com.iproject.api.inventory.Inventories;
import com.iproject.api.inventory.Inventory;
import com.iproject.api.inventory.InventoryHolder;

/**
 * The MIT License (MIT)
 * 
 * Copyright (c) <2015> <iPowered>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class IInventoryHolder implements InventoryHolder {

	public IInventoryHolder(Inventory basic) {
		this.defaulte = basic;
	}
	
	private Inventory defaulte = null;
	private Inventory current = null;

	@Override
	public Inventory getInventory() {
		return defaulte;
	}

	public void setCurrentInventory(Inventory inv) {
		inv.getViewers().add(((Human) this));
		this.current = inv;
	}
	
	public Inventory getCurrentInventory() {
		return current;
	}
	
	@Override
	public void closeInventory() {
		boolean closed;

		Inventory[] currents = Arrays.asList(getCurrentInventory()).toArray(new Inventory[Arrays.asList(getCurrentInventory()).size()]);

		closed = true;

		int iclosed = 0;

		if (closed) {
			for (int i = 0; i < currents.length;) {
				for (iclosed = i; iclosed < currents.length; iclosed++) {
					if (currents[iclosed] != null) {
						currents[iclosed].close((Human)this);
					}
				}
			}
		}
	}
}
