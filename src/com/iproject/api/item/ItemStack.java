/**
 * 
 */
package com.iproject.api.item;

import java.util.List;

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
public class ItemStack {

	private short durability;
	private int stack;
	private int maxStackSize;
	private Material value;
	private ItemMeta meta;
	
	public ItemStack(Material material) {
		this.value = material;
	}
	
	public ItemStack(ItemStack item) {
		this.durability = item.durability;
		this.stack = item.stack;
		this.maxStackSize = item.maxStackSize;
		this.value = item.value;
		this.meta = item.meta;
	}
	
	public ItemStack(short durability, int stack, Material value) { 
		this.durability = durability;
		this.stack = stack;
		this.value = value;
	}

	/**
	 * @return the display name 
	 * */
	public String getDisplayName() {
		return getItemMeta().getDisplayName();
	}
	
	/**
	 * @return the lore
	 * */
	public List<String> getLore() {
		return getItemMeta().getLore();	
	}
	
	/**
	 * @return the durability
	 */
	public short getDurability() {
		return durability;
	}

	/**
	 * @return the stack
	 */
	public int getStack() {
		return stack;
	}

	/**
	 * @return the maxStackSize
	 */
	public int getMaxStackSize() {
		return maxStackSize;
	}

	/**
	 * @return the value
	 */
	public Material getValue() {
		return value;
	}
	
	/**
	 * change the itemMeta
	 * */
	public void setItemMeta(ItemMeta meta) {
		this.meta = meta;
	}
	
	/**
	 * @return the meta
	 * */
	public ItemMeta getItemMeta() {
		return meta;
	}
}
