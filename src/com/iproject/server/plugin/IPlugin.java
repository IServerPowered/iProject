/**
 * 
 */
package com.iproject.server.plugin;

import java.util.List;

import com.google.common.collect.Lists;
import com.iproject.api.Server;
import com.iproject.api.plugin.PlLauncher;
import com.iproject.api.plugin.Plugin;
import com.iproject.api.plugin.PluginManager;

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
public class IPlugin implements Plugin {

	private String name;
	private List<String> authors;
	
	private List<Plugin> pluginsLoaded = Lists.newArrayList();
	
	public IPlugin() {
		pluginsLoaded.add(this);
	}
	
	@Override
	public String getMain() {
		return this.getClass().getName();
	}

	@Override
	public String getName() {
		return name = getLauncher().name() != null ? name : " ";
	}

	@Override
	public List<String> getAuthors() {
		return authors = Lists.newArrayList(getLauncher().authors()) != null ? authors : null;
	}

	@Override
	public PluginManager getPluginManager() {
		return null;
	}

	@Override
	public Server getServer() {
		return null;
	}

	@Override
	public PlLauncher getLauncher() {
		for(PlLauncher pl;;) {
			for(Plugin plugin : pluginsLoaded) {
				pl = plugin.getClass().getAnnotation(PlLauncher.class);
				return pl;
			}
		} 
	}
}
