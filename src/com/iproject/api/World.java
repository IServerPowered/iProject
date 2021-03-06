/**
 * 
 */
package com.iproject.api;

import java.util.Collection;

import com.iproject.api.block.Block;
import com.iproject.api.entity.Entity;
import com.iproject.api.util.Location;

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
public interface World {

	public String getWorldName();
	
	public long getSeed();
	
	public Collection<Entity> getEntities();
	
	public Location getSpawnLocation();
	
	public boolean isThundering();
	
	public boolean isRaining();
	
	public boolean isSnowy();
	
	public Chunk getChunkAt(double x, double z);
	
	public Chunk getChunkAt(Block block);
	
	public Chunk getChunkAt(Location location);

	public boolean createExplosion(Class<? extends Entity> explosion, Location location, int force, boolean flags);
	
	public void loadChunk(Chunk chunk);
	
	public void unloadChunk(Chunk chunk);
}
