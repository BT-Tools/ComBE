package org.behaviorengineering.combe.textual.strategies;

import org.spoofax.graphical.GMFUtil;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class term_to_model_0_3 extends Strategy {

	public static term_to_model_0_3 instance = new term_to_model_0_3();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm diagramFilePath, IStrategoTerm packName, IStrategoTerm textFilePath) {
		GMFUtil.updateSemanticModel(context.getFactory(), (IStrategoString) diagramFilePath, (IStrategoString) packName, term);
		return GMFUtil.installSemanticModelListener(context.getFactory(), (IStrategoString) diagramFilePath, (IStrategoString) packName, (IStrategoString) textFilePath);
	}
}
