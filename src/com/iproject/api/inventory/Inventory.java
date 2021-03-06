package com.iproject.api.inventory;

import java.util.List;

import com.iproject.api.entity.player.Human;
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

public interface Inventory {

	/**
	 * Returns the title of this inventory
	 * @return the title
	 * */
	public String getTitle();
	
	/**
	 * Returns the size of this inventory
	 * @return the size
	 * */
	public int getSize();
	
	/**
	 * Returns the type of this inventory
	 * @return the type
	 * */
	public InventoryType getType();
	
	/**
	 * Returns the current viewers of this inventory
	 * @return the current viewers
	 * */
	public List<Human> getViewers();
	
	/**
	 * Sets the viewers of this inventory
	 * */
	public void setViewers(List<Human> viewers);
	
	/**
	 * Add an item
	 * */
	public void addItem(ItemStack stack);
	
	/**
	 * Remove an item 
	 * */
	public void removeItem(ItemStack stack);
	
	/**
	 * Get an item at the specified index
	 * @return item at the specified index
	 * */
	public ItemStack get(int index);
	
	public void close(Human human);
}
