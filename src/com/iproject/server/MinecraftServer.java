package com.iproject.server;

import java.util.UUID;
import java.util.logging.Logger;

import com.iproject.api.Server;
import com.iproject.api.World;
import com.iproject.api.entity.player.Player;

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

public class MinecraftServer implements Server {

	private String version;
	private String name;
	
	private Logger logger = Logger.getLogger("MinecraftServer");
	
	public static void main(String[] args) {
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getLogger()
	 */
	@Override
	public Logger getLogger() {
		return logger;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getVersion()
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getSubClass()
	 */
	@Override
	public MinecraftServer getSubClass() {
		return this;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getPlayer(java.lang.String)
	 */
	@Override
	public Player getPlayer(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getPlayerExact(java.lang.String)
	 */
	@Override
	public Player getPlayerExact(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getPlayer(java.util.UUID)
	 */
	@Override
	public Player getPlayer(UUID uuid) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getWorld(java.lang.String)
	 */
	@Override
	public World getWorld(String name) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.iproject.api.Server#getWorld(long)
	 */
	@Override
	public World getWorld(long seed) {
		return null;
	}
}
