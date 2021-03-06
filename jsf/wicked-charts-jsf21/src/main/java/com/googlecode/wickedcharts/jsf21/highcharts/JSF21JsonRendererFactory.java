/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.googlecode.wickedcharts.jsf21.highcharts;

import com.googlecode.wickedcharts.highcharts.jackson.JsonRenderer;

/**
 * Factory class responsible for creating a {@link JsonRenderer} instance that
 * matches the needs of wicked-charts-jsf21.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class JSF21JsonRendererFactory {

	private static final JSF21JsonRendererFactory INSTANCE = new JSF21JsonRendererFactory();

	private static JsonRenderer RENDERER = new JsonRenderer();

	public static JSF21JsonRendererFactory getInstance() {
		return JSF21JsonRendererFactory.INSTANCE;
	}

	private JSF21JsonRendererFactory() {

	}

	/**
	 * Returns the singleton instance of the {@link JsonRenderer} that is
	 * configured for JSF 2.1.
	 * 
	 * @return the singleton {@link JsonRenderer}
	 */
	public JsonRenderer getRenderer() {
		return JSF21JsonRendererFactory.RENDERER;
	}

}
