/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mmmi.mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.MathAssignmentLanguageRuntimeModule;
import dk.sdu.mmmi.mdsd.MathAssignmentLanguageStandaloneSetup;
import dk.sdu.mmmi.mdsd.ide.MathAssignmentLanguageIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MathAssignmentLanguageIdeSetup extends MathAssignmentLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    MathAssignmentLanguageRuntimeModule _mathAssignmentLanguageRuntimeModule = new MathAssignmentLanguageRuntimeModule();
    MathAssignmentLanguageIdeModule _mathAssignmentLanguageIdeModule = new MathAssignmentLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_mathAssignmentLanguageRuntimeModule, _mathAssignmentLanguageIdeModule));
  }
}