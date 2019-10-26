package com.jwebmp.plugins.verticaltimeline.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class VerticalTimelineExclusionsModule
		implements IGuiceScanModuleExclusions<VerticalTimelineExclusionsModule>,
				           IGuiceScanJarExclusions<VerticalTimelineExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-vertical-timeline-css-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.verticaltimeline");
		return strings;
	}
}
