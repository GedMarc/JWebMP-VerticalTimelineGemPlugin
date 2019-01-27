module com.jwebmp.plugins.verticaltimeline {

	exports com.jwebmp.plugins.verticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.verticaltimeline.VerticalTimelinePageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.verticaltimeline.implementations.VerticalTimelineExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.verticaltimeline.implementations.VerticalTimelineExclusionsModule;

	opens com.jwebmp.plugins.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}
