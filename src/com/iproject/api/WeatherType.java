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
public enum WeatherType {

	CLEAR(0),
	RAIN(1),
	THUNDER(2),
	SNOW(3);
	
	private byte data;
	
	private static final Map<Byte, WeatherType> BY_DATA = Maps.newHashMap();
	
	private WeatherType(int data) {
		this.data = (byte) data;
	}
	
	public static WeatherType getByData(int data) {
		return (WeatherType) BY_DATA.get(data);
	}
	
	public byte getData() {
		return data;
	}
	
	static {
		for(WeatherType type : values()) {
			BY_DATA.put(type.getData(), type);
		}
	}
}
