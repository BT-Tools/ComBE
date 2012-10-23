package org.behaviorengineering.combe.textual.strategies;

import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.modelware.gmf.GMFBridge;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class to_modelware_0_2 extends Strategy {

	public static to_modelware_0_2 instance = new to_modelware_0_2();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm analysedAST, IStrategoTerm textfilePath, IStrategoTerm packageName) {
		return GMFBridge.getInstance().synchronize(context, analysedAST, (IStrategoString) textfilePath, (IStrategoString) packageName);
	}
}
