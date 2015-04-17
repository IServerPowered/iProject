/**
 * 
 */
package com.iproject.api.util;

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

public class Vector {

	private double x, y, z;

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector(Vector other) {
		this.x = other.x;
		this.y = other.y;
		this.z = other.z;
	}

	public Vector copy(Vector other) {
		return new Vector(other);
	}

	public Vector divide(Vector other) {
		this.x /= other.x;
		this.y /= other.y;
		this.z /= other.z;
		return this;
	}

	public Vector multiply(Vector other) {
		this.x *= other.x;
		this.y *= other.y;
		this.z *= other.z;
		return this;
	}

	public Vector substract(Vector other) {
		this.x -= other.x;
		this.y -= other.y;
		this.z -= other.z;
		return this;
	}

	public Vector add(Vector other) {
		this.x += other.x;
		this.y += other.y;
		this.z += other.z;
		return this;
	}
	
	public Vector sqrt(Vector other) {
		this.x = Math.sqrt(other.x);
		this.y = Math.sqrt(other.y);
		this.z = Math.sqrt(other.z);
		return this;
	}
	
	public Vector cos(Vector other) {
		this.x = Math.cos(other.x);
		this.y = Math.cos(other.y);
		this.z = Math.cos(other.z);
		return this;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}
	
	public String toString() {
		return "Vector { x=" + String.valueOf(getX()) + " y=" + String.valueOf(getY()) + " z=" + String.valueOf(getZ()) + " } ";
	}
}
