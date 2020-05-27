module com.jwebmp.plugins.verticaltimeline {

	exports com.jwebmp.plugins.verticaltimeline;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.verticaltimeline.VerticalTimelinePageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.verticaltimeline.implementations.VerticalTimelineExclusionsModule;

	opens com.jwebmp.plugins.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}
