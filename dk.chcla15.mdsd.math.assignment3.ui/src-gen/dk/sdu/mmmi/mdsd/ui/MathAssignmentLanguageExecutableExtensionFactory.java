/*
 * generated by Xtext 2.21.0
 */
package dk.sdu.mmmi.mdsd.ui;

import com.google.inject.Injector;
import dk.chcla15.mdsd.math.assignment3.ui.internal.Assignment3Activator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MathAssignmentLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Assignment3Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Assignment3Activator activator = Assignment3Activator.getInstance();
		return activator != null ? activator.getInjector(Assignment3Activator.DK_SDU_MMMI_MDSD_MATHASSIGNMENTLANGUAGE) : null;
	}

}
