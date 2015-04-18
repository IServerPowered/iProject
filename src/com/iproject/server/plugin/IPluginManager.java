/**
 * 
 */
package com.iproject.server.plugin;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.google.common.collect.Lists;
import com.iproject.api.event.Event;
import com.iproject.api.event.Handler;
import com.iproject.api.event.Listener;
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
public class IPluginManager implements PluginManager {

	protected static List<Listener> registeredListeners = Lists.newArrayList();

	public IPluginManager() {
	}

	/**
	 * Call an event, get the registered Listeners and then get the methods.
	 * After we invoked the methods we take the parameter so the event class.
	 * And the method can only contains one parameter (the event).
	 * */
	@SuppressWarnings("unused")
	@Override
	public void callEvent(Event event) {
		Listener target = null;
		Handler annotation = null;
		Method targetMethod = null;
		
		for(Listener ltarget : registeredListeners) {
			target = ltarget;
			
			for(Method tm : target.getClass().getMethods()) {
				targetMethod = tm;
				
				if(targetMethod.isAnnotationPresent(Handler.class)) {
					annotation = targetMethod.getAnnotation(Handler.class);
				}
				
				for(Class<?> clazz : targetMethod.getParameterTypes()) {
					if(clazz.isAssignableFrom(event.getClass())) {
						try {
							targetMethod.invoke(event);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	@Override
	public void registerEvents(Listener listener) {
		if (registeredListeners.contains(listener))
			return;

		registeredListeners.add(listener);
	}

	@Override
	public Plugin[] loadPlugins(File directory) {
		return null;
	}
}
