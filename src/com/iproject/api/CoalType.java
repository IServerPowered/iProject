/**
 * 
 */
package com.iproject.api;

import java.util.Map;

import com.google.common.collect.Maps;

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
public enum CoalType {

	COAL(0),
	CHAR_COAL(1);
	
	private byte data;
	
	private static Map<Byte, CoalType> BY_DATA = Maps.newHashMap();
	
	private CoalType(int data) {
		this.data = (byte) data;
	}
	
	public byte getData() {
		return data;
	}
	
	public static CoalType getByData(int data) {
		return (CoalType) BY_DATA.get((byte) data);
	}
	
	static {
		for(CoalType type : values()) {
			BY_DATA.put(type.getData(), type);
		}
	}
}
