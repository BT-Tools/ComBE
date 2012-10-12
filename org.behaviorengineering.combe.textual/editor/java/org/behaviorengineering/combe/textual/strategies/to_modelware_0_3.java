package org.behaviorengineering.combe.textual.strategies;

import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.modelware.gmf.GMFBridge;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class to_modelware_0_3 extends Strategy {

	public static to_modelware_0_3 instance = new to_modelware_0_3();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm analysedAST, IStrategoTerm filePath, IStrategoTerm textFileExtension, IStrategoTerm packageName) {
		return GMFBridge.getInstance().synchronize(context, analysedAST, (IStrategoString) filePath, (IStrategoString) textFileExtension, (IStrategoString) packageName);
	}
}
