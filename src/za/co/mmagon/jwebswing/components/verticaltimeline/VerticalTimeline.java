/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.components.verticaltimeline;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * An implementation of the Responsive Vertical Timeline - https://codyhouse.co/gem/vertical-timeline/
 * <p>
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 24 October 2016
 */
public class VerticalTimeline extends Div<VerticalTimelineChildren, VerticalTimelineAttributes, VerticalTimelineFeatures, VerticalTimelineEvents, VerticalTimeline>
{

	private static final long serialVersionUID = 1L;
	private VerticalTimelineFeature feature;

	/**
	 * Constructs a new instance of the vertical timeline
	 */
	public VerticalTimeline()
	{
		addFeature(getFeature());
		setTag("section");
		addClass("verticalTimeline");
		addClass("cd-container");
		getProperties().put(BootstrapPageConfigurator.BootstrapEnabledString, "true");
	}

	/**
	 * Returns the vertical time line with only the fields relevant
	 *
	 * @return
	 */
	public VerticalTimeline asVerticalTimeline()
	{
		return this;
	}

	public final VerticalTimelineFeature getFeature()
	{
		if (feature == null)
		{
			feature = new VerticalTimelineFeature(this);
		}
		return feature;
	}

	@Override
	public VerticalTimelineOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof VerticalTimeline))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		VerticalTimeline that = (VerticalTimeline) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
