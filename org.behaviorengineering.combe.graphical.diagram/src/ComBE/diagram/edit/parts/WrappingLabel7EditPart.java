package ComBE.diagram.edit.parts;

/**
 * @generated
 */
public class WrappingLabel7EditPart extends CompartmentEditPart implements ITextAwareEditPart {

	/**
	* @generated NOT
	* Workaround for GMF/331875
	*/
	protected String getLabelText() {
		String text = null;
		EObject parserElement = getParserElement();
		if (parserElement != null && getParser() != null) {
			text = getParser().getPrintString(new EObjectAdapter(parserElement), 0);
		}
		if (text == null || text.length() == 0) {
			text = defaultText;
		}
		return text;
	}
}