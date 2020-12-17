/*
 * Copyright (C) 2016 GedMarc
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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.H2;
import com.jwebmp.core.base.html.Span;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class VerticalTimelineTest

{

	public VerticalTimelineTest()
	{
	}

	@Test
	public void testBasicStructure()
	{
		VerticalTimeline vt = getMe();
		System.out.println(vt.toString(true));
		Assertions.assertEquals("<section class=\"verticalTimeline cd-container\" id=\"id\"></section>", vt.toString(true));
	}

	public VerticalTimeline getMe()
	{
		VerticalTimeline vt = new VerticalTimeline();
		vt.setID("id");
		return vt;
	}

	@Test
	public void testDeepStructure()
	{
		VerticalTimeline vt = getMe();
		VerticalTimelineBlock vtb = new VerticalTimelineBlock();
		vtb.getImageContainer()
		   .setID("vtbImageID");
		vtb.getContent()
		   .setID("content");
		vtb.getContent()
		   .setHeader(new H2("header text"));
		vtb.getContent()
		   .setContentText("paragraph text");
		vtb.getContent()
		   .setSpanText(new Span("span text"));

		vtb.setID("vtbId");
		vtb.getContent()
		   .getHeader()
		   .setID("headerID");
		vtb.getContent()
		   .asVerticalTimelineContent()
		   .getReadMoreLink()
		   .setID("readmoreID");
		vtb.getContent()
		   .asVerticalTimelineContent()
		   .getSpanText()
		   .setID("spanID");
		vtb.getContent()
		   .asVerticalTimelineContent()
		   .getHeader()
		   .setID("headerID");
		vt.add(vtb);

		System.out.println(vt.toString(true));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testReferences()
	{
		Page<?> p = new Page();

		VerticalTimeline vt = getMe();
		VerticalTimelineBlock vtb = new VerticalTimelineBlock();
		vtb.getImageContainer()
		   .setID("vtbImageID");
		vtb.getContent()
		   .setID("content");
		vtb.getContent()
		   .setHeader(new H2("header text"));
		vtb.getContent()
		   .setContentText("paragraph text");
		vtb.getContent()
		   .setSpanText(new Span("span text"));

		vtb.setID("vtbId");
		vtb.getContent()
		   .getHeader()
		   .setID("headerID");
		vtb.getContent()
		   .asVerticalTimelineContent()
		   .getReadMoreLink()
		   .setID("readmoreID");
		vtb.getContent()
		   .asVerticalTimelineContent()
		   .getSpanText()
		   .setID("spanID");
		vtb.getContent()
		   .asVerticalTimelineContent()
		   .getHeader()
		   .setID("headerID");
		vt.add(vtb);

		p.getBody()
		 .add(vt);

		System.out.println(p.toString(true));

	}

}
