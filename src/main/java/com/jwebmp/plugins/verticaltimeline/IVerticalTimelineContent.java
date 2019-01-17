/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.verticaltimeline;

import com.jwebmp.core.base.html.H2;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.Span;

/**
 * @author GedMarc
 * @since Oct 24, 2016
 */
public interface IVerticalTimelineContent
{

	/**
	 * Returns the header object
	 *
	 * @return
	 */
	H2 getHeader();

	/**
	 * Sets the header object
	 *
	 * @param header
	 */
	void setHeader(H2 header);

	/**
	 * The link for the read more
	 *
	 * @return
	 */
	Link getReadMoreLink();

	/**
	 * Sets the read more link
	 *
	 * @param readMoreLink
	 */
	void setReadMoreLink(Link readMoreLink);

	/**
	 * Gets the span for where the date displays
	 *
	 * @return
	 */
	Span getSpanText();

	/**
	 * Sets the span for where the date displays
	 *
	 * @param spanText
	 */
	void setSpanText(Span spanText);

	/**
	 * Returns the text object
	 *
	 * @return
	 */
	String getText();

}
