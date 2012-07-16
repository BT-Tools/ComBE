package org.behaviorengineering.combe.textual.strategies;

import org.spoofax.graphical.GMFBridge;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class gmf_bridge_0_3 extends Strategy {

	public static gmf_bridge_0_3 instance = new gmf_bridge_0_3();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm analysedAST, IStrategoTerm textFilePath, IStrategoTerm diagramFilePath, IStrategoTerm packageName) {
		return GMFBridge.getInstance().synchronize(analysedAST, (IStrategoString) textFilePath, context, (IStrategoString) diagramFilePath, (IStrategoString) packageName);
	}
}
