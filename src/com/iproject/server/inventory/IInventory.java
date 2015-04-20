/**
 * 
 */
package com.iproject.server.inventory;

import java.util.ArrayList;
import java.util.List;

import com.iproject.api.entity.player.Human;
import com.iproject.api.inventory.Inventory;
import com.iproject.api.inventory.InventoryHolder;
import com.iproject.api.inventory.InventoryType;
import com.iproject.api.item.ItemStack;

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
public class IInventory implements Inventory {

	private List<ItemStack> items = null;
	
	private List<Human> viewers = null;
	
	private InventoryType type;
	
	private int size;
	
	public IInventory(InventoryType type, int size) {
		this.items = new ArrayList<ItemStack>();
		this.viewers = new ArrayList<Human>();
		
		this.size = size;
	}
	
	@Override
	public String getTitle() {
		return InventoryType.getByData(type.getData()).toString().toLowerCase();
	}

	@Override
	public int getSize() {
		return size <= type.getMaxSize() ? size : 0;
	}

	@Override
	public InventoryType getType() {
		return type;
	}

	@Override
	public List<Human> getViewers() {
		return viewers;
	}

	@Override
	public void setViewers(List<Human> viewers) {
		this.viewers = viewers;
	}

	@Override
	public void addItem(ItemStack stack) {
		items.add(stack);
	}

	@Override
	public void removeItem(ItemStack stack) {
		items.remove(stack);
	}
	
	@Override
	public ItemStack get(int index) {
		return items.get(index);
	}
	
	@Override
	public void close(Human holder) {
		this.getViewers().remove(holder);
	}
}
