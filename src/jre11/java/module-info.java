import com.jwebmp.plugins.verticaltimeline.implementations.VerticalTimelineInclusionsModule;

module com.jwebmp.plugins.verticaltimeline {

	exports com.jwebmp.plugins.verticaltimeline;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.verticaltimeline.VerticalTimelinePageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.verticaltimeline.implementations.VerticalTimelineExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with VerticalTimelineInclusionsModule;
	
	opens com.jwebmp.plugins.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}
