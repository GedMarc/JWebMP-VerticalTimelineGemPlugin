import com.jwebmp.plugins.verticaltimeline.VerticalTimelinePageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

module com.jwebmp.plugins.verticaltimeline {

	exports com.jwebmp.plugins.verticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with VerticalTimelinePageConfigurator;
	opens com.jwebmp.plugins.verticaltimeline to com.fasterxml.jackson.databind,com.jwebmp.core;
}
