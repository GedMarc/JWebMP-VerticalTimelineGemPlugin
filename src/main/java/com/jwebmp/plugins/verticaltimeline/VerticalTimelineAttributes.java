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

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.utilities.StaticStrings;

import static com.guicedee.guicedinjection.json.StaticStrings.*;
import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author GedMarc
 */
public enum VerticalTimelineAttributes
		implements AttributeDefinitions
{
	Visibility;

	VerticalTimelineAttributes()
	{
	}

	@Override
	public boolean isKeyword()
	{
		return false;
	}

	/**
	 * Returns the attribute name replacing all underscores with dashes and all dollar signs to empty
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH)
		             .replace(STRING_DOLLAR, STRING_EMPTY);
	}
}
