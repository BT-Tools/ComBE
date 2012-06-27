package ComBE.diagram.parsers;

/**
 * @generated
 */
public class StandardNodeLabelExpressionLabelParser implements IParser {

	/**
	* @generated NOT
	* Workaround for GMF/331875
	*/
	public String getPrintString(IAdaptable element, int flags) {
		EObject target = (EObject) element.getAdapter(EObject.class);
		Object result = ComBE.diagram.expressions.ComBEOCLFactory.getExpression(flags, ComBE.ComBEPackage.eINSTANCE.getStandardNode(), null).evaluate(target);
		return String.valueOf(result);
	}
}