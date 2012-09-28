package org.behaviorengineering.combe.textual.strategies;

import org.spoofax.graphical.GMFBridge;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class to_modelware_0_3 extends Strategy {

	public static to_modelware_0_3 instance = new to_modelware_0_3();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm analysedAST, IStrategoTerm textFilePath, IStrategoTerm diagramFilePath, IStrategoTerm packageName) {
		return GMFBridge.getInstance().synchronize(analysedAST, (IStrategoString) textFilePath, context, (IStrategoString) diagramFilePath, (IStrategoString) packageName);
	}
}
