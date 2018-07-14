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

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.plugins.PluginInformation;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Vertical Timeline",
		pluginUniqueName = "vertical-timeline",
		pluginDescription = "We all are quite familiar with vertical timelines: all instant messaging applications use them. A current trend in web design is to use a similar structure, but to show a process rather than a sequence of events. That is why timeline-like structures are often used for the “How it works” page.",
		pluginVersion = "1.0",
		pluginDependancyUniqueIDs = "jquery,bootstrap,modernizr",
		pluginCategories = "ui, web, colour picker, spectrum, drop down",
		pluginSubtitle = "A straight forward and simple Responsive Vertical Timeline ",
		pluginGitUrl = "https://codyhouse.co/gem/vertical-timeline/",
		pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-VerticalTimelineGemPlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-VerticalTimelineGemPluginwiki",
		pluginOriginalHomepage = "https://codyhouse.co/gem/vertical-timeline/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/VerticalTimelineGemPlugin.jar/download",
		pluginIconUrl = "bower_components/vertical-timeline-jwebswing/example.png",
		pluginIconImageUrl = "bower_components/vertical-timeline-jwebswing/example.png",
		pluginLastUpdatedDate = "2017/03/04"
)
public class VerticalTimelinePageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	@Override
	public Page configure(Page page)
	{
		return page;
	}

}
