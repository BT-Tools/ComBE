package ComBE.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
