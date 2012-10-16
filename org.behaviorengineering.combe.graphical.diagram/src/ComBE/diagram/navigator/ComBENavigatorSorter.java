package ComBE.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ComBENavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ComBE.diagram.navigator.ComBENavigatorItem) {
			ComBE.diagram.navigator.ComBENavigatorItem item = (ComBE.diagram.navigator.ComBENavigatorItem) element;
			return ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
