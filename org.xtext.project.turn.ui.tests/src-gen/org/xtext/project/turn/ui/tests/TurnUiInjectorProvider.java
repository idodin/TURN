/*
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.project.turn.ui.internal.TurnActivator;

public class TurnUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TurnActivator.getInstance().getInjector("org.xtext.project.turn.Turn");
	}

}
