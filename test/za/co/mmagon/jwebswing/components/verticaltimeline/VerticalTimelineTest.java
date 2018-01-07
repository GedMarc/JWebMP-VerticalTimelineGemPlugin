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
package za.co.mmagon.jwebswing.components.verticaltimeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.html.H2;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 * @author GedMarc
 */
public class VerticalTimelineTest extends BaseTestClass
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

	@Test
	public void testDeepStructure()
	{
		VerticalTimeline vt = getMe();
		VerticalTimelineBlock vtb = new VerticalTimelineBlock();
		vtb.getImageContainer().setID("vtbImageID");
		vtb.getContent().setID("content");
		vtb.getContent().setHeader(new H2("header text"));
		vtb.getContent().setText("paragraph text");
		vtb.getContent().setSpanText(new Span("span text"));

		vtb.setID("vtbId");
		vtb.getContent().getHeader().setID("headerID");
		vtb.getContent().asVerticalTimelineContent().getReadMoreLink().setID("readmoreID");
		vtb.getContent().asVerticalTimelineContent().getSpanText().setID("spanID");
		vtb.getContent().asVerticalTimelineContent().getHeader().setID("headerID");
		vtb.getContent().asVerticalTimelineContent().getText().setID("textID");
		vt.add(vtb);

		System.out.println(vt.toString(true));
		Assertions.assertEquals("<section class=\"verticalTimeline cd-container\" id=\"id\">\n"
				                        + "	<div class=\"cd-timeline-block\" id=\"vtbId\">\n"
//				                    + "		<div class=\"cd-timeline-img\" id=\"vtbImageID\">\n"
//				                    + "			<i class=\"fa fa-cog\"></i>\n"
//				                    + "		</div>\n"
				                        + "		<div class=\"cd-timeline-img\" id=\"vtbImageID\"></div>\n"
				                        + "		<div class=\"cd-timeline-content\" id=\"content\">\n"
				                        + "			<H2 id=\"headerID\">header text</H2>\n"
				                        + "			<p id=\"textID\">paragraph text</p>\n"
				                        + "			<a class=\"cd-read-more\" id=\"readmoreID\"></a>\n"
				                        + "			<span class=\"cd-date\" id=\"spanID\">span text</span>\n"
				                        + "		</div>\n"
				                        + "	</div>\n"
				                        + "</section>", vt.toString(true));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testReferences()
	{
		Page p = getInstance();

		VerticalTimeline vt = getMe();
		VerticalTimelineBlock vtb = new VerticalTimelineBlock();
		vtb.getImageContainer().setID("vtbImageID");
		vtb.getContent().setID("content");
		vtb.getContent().setHeader(new H2("header text"));
		vtb.getContent().setText("paragraph text");
		vtb.getContent().setSpanText(new Span("span text"));

		vtb.setID("vtbId");
		vtb.getContent().getHeader().setID("headerID");
		vtb.getContent().asVerticalTimelineContent().getReadMoreLink().setID("readmoreID");
		vtb.getContent().asVerticalTimelineContent().getSpanText().setID("spanID");
		vtb.getContent().asVerticalTimelineContent().getHeader().setID("headerID");
		vtb.getContent().asVerticalTimelineContent().getText().setID("textID");
		vt.add(vtb);

		p.getBody().add(vt);

		System.out.println(p.toString(true));

	}

	public VerticalTimeline getMe()
	{
		VerticalTimeline vt = new VerticalTimeline();
		vt.setID("id");
		return vt;
	}

}
