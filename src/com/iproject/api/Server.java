package com.iproject.api;

import java.util.logging.Logger;

import com.iproject.server.MinecraftServer;

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

public interface Server {

	
	/**
	 * Returns the logger of this server
	 * @return The logger which used for print something in the console :p
	 * */
	public Logger getLogger();
	
	/**
	 * Returns the name of this current server <strong>API<strong>
	 * @return the server name 
	 * */
	public String getName();
	
	/**
	 * Returns the version of this current <strong>API<strong>
	 * @return the current version
	 * */
	public String getVersion();
	
	/**
	 * Returns the subClass of this interface, so the <code>'handle'</code>
	 * @return the subClass of this interface
	 * */
	public MinecraftServer getSubClass();
}
