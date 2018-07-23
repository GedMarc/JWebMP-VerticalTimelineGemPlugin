import com.jwebmp.components.verticaltimeline.VerticalTimelinePageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

module com.jwebmp.components.verticaltimeline {

	exports com.jwebmp.components.verticaltimeline;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with VerticalTimelinePageConfigurator;

}
