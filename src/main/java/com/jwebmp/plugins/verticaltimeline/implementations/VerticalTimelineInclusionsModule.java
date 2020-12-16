package com.jwebmp.plugins.verticaltimeline.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class VerticalTimelineInclusionsModule implements IGuiceScanModuleInclusions<VerticalTimelineInclusionsModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.verticaltimeline");
		return set;
	}
}