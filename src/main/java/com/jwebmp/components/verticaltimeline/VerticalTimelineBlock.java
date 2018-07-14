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
package com.jwebmp.components.verticaltimeline;

import com.jwebmp.Component;
import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.attributes.NoAttributes;
import com.jwebmp.base.html.interfaces.GlobalChildren;
import com.jwebmp.base.html.interfaces.GlobalFeatures;
import com.jwebmp.base.html.interfaces.events.GlobalEvents;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * A content div for the vertical Timeline
 *
 * @author GedMarc
 * @since Oct 24, 2016
 */
public class VerticalTimelineBlock
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, VerticalTimelineBlock>
		implements VerticalTimelineChildren, IVerticalTimelineBlock
{

	private static final long serialVersionUID = 1L;

	/**
	 * The component that will display the image
	 */
	private Component imageComponent;

	/**
	 * The content block for the time-line
	 */
	private VerticalTimelineContent content;

	/**
	 * The div that contains the image container
	 */
	private Div imageContainer;

	/**
	 * Constructs a new time-line block with the given image component
	 *
	 * @param imageComponent
	 * 		The image to use in the middle
	 */
	public VerticalTimelineBlock(Component imageComponent)
	{
		this();
		setImageComponent(imageComponent);
	}

	/**
	 * Constructs a new instance of the vertical time-line block
	 */
	public VerticalTimelineBlock()
	{
		addClass("cd-timeline-block");
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof VerticalTimelineBlock))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		VerticalTimelineBlock that = (VerticalTimelineBlock) o;

		if (!getImageComponent().equals(that.getImageComponent()))
		{
			return false;
		}
		return getContent().equals(that.getContent()) && getImageContainer().equals(that.getImageContainer());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Returns the content div. Never null
	 *
	 * @return
	 */
	@Override
	public VerticalTimelineContent getContent()
	{
		if (content == null)
		{
			setContent(new VerticalTimelineContent());
		}
		return content;
	}

	/**
	 * Sets the content div
	 *
	 * @param content
	 */
	@Override
	public void setContent(VerticalTimelineContent content)
	{
		remove(this.content);
		this.content = content;
		if (this.content != null)
		{
			add(this.content);
		}
	}

	/**
	 * Returns this image component.
	 * May return null
	 *
	 * @return
	 */
	@Override
	public Component getImageComponent()
	{
		return imageComponent;
	}

	/**
	 * Sets this image component
	 *
	 * @param imageComponent
	 */
	@Override
	public final void setImageComponent(Component imageComponent)
	{
		this.imageComponent = imageComponent;
	}

	/**
	 * Gets the image container. Never null
	 *
	 * @return
	 */
	@Override
	public Div getImageContainer()
	{
		if (imageContainer == null)
		{
			setImageContainer(new Div());
		}
		return imageContainer;
	}

	/**
	 * Sets the image container
	 *
	 * @param imageContainer
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void setImageContainer(Div imageContainer)
	{
		remove(this.imageContainer);
		this.imageContainer = imageContainer;
		if (imageContainer != null)
		{
			imageContainer.addClass("cd-timeline-img");
			List list = new ArrayList(getChildren());
			list.add(0, this.imageContainer);
			setChildren(new LinkedHashSet<>(list));
		}
	}
}