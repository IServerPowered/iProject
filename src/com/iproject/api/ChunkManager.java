/**
 * 
 */
package com.iproject.api;

import java.util.Map;
import java.util.logging.Level;

import com.google.common.collect.Maps;
import com.iproject.api.util.ChunkVector;

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
public class ChunkManager {

	private Map<ChunkVector, Chunk> chunks = Maps.newHashMap();
	
	private Server server;
	
	public ChunkManager(Server server) {
		this.server = server;
		
		server.getLogger().log(Level.ALL, "Invoke ChunkManager class.");
	}
	
	public void addChunk(Chunk chunk, double x, double z) {
		chunks.put(new ChunkVector(x, z), chunk);
	}
	
	public void removeChunk(Chunk chunk) {
		if(chunks.containsValue(chunk)) chunks.remove(chunk);
	}
	
	public Chunk getChunk(double x, double z) {
		return (Chunk) chunks.get(new ChunkVector(x, z));
	}
	
	public Server getServer() {
		return server;
	}
}
