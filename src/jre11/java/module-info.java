import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.verticaltimeline.VerticalTimelinePageConfigurator;
import com.jwebmp.plugins.verticaltimeline.implementations.VerticalTimelineExclusionsModule;

module com.jwebmp.plugins.verticaltimeline {

	exports com.jwebmp.plugins.verticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with VerticalTimelinePageConfigurator;
	provides IGuiceScanModuleExclusions with VerticalTimelineExclusionsModule;
	provides IGuiceScanJarExclusions with VerticalTimelineExclusionsModule;

	opens com.jwebmp.plugins.verticaltimeline to com.fasterxml.jackson.databind, com.jwebmp.core;
}
