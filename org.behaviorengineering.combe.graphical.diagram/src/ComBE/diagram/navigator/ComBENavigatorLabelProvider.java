package ComBE.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ComBENavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComBE.diagram.navigator.ComBENavigatorItem && !isOwnView(((ComBE.diagram.navigator.ComBENavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ComBE.diagram.navigator.ComBENavigatorGroup) {
			ComBE.diagram.navigator.ComBENavigatorGroup group = (ComBE.diagram.navigator.ComBENavigatorGroup) element;
			return ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ComBE.diagram.navigator.ComBENavigatorItem) {
			ComBE.diagram.navigator.ComBENavigatorItem navigatorItem = (ComBE.diagram.navigator.ComBENavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ComBE?StandardNode", ComBE.diagram.providers.ComBEElementTypes.StandardNode_3001); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ComBE?EmptyNode", ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3006); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ComBE?ParallelBranch", ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ComBE?ParallelBranch?children", ComBE.diagram.providers.ComBEElementTypes.ParallelBranchChildren_4002); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ComBE?EmptyNode", ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3004); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ComBE?EmptyNode", ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3002); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ComBE?AlternativeBranch?children", ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?ComBE?Specification", ComBE.diagram.providers.ComBEElementTypes.Specification_1000); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ComBE?StandardNode", ComBE.diagram.providers.ComBEElementTypes.StandardNode_3005); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID:
			return getImage("Navigator?Link?ComBE?AtomicSequence?child", ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ComBE?AtomicSequence", ComBE.diagram.providers.ComBEElementTypes.AtomicSequence_2003); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ComBE?AlternativeBranch", ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001); //$NON-NLS-1$
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ComBE?StandardNode", ComBE.diagram.providers.ComBEElementTypes.StandardNode_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ComBE.diagram.providers.ComBEElementTypes.isKnownElementType(elementType)) {
			image = ComBE.diagram.providers.ComBEElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ComBE.diagram.navigator.ComBENavigatorGroup) {
			ComBE.diagram.navigator.ComBENavigatorGroup group = (ComBE.diagram.navigator.ComBENavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComBE.diagram.navigator.ComBENavigatorItem) {
			ComBE.diagram.navigator.ComBENavigatorItem navigatorItem = (ComBE.diagram.navigator.ComBENavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return getStandardNode_3001Text(view);
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return getEmptyNode_3006Text(view);
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return getParallelBranch_2002Text(view);
		case ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID:
			return getParallelBranchChildren_4002Text(view);
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return getEmptyNode_3004Text(view);
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return getEmptyNode_3002Text(view);
		case ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID:
			return getAlternativeBranchChildren_4001Text(view);
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			return getSpecification_1000Text(view);
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return getStandardNode_3005Text(view);
		case ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID:
			return getAtomicSequenceChild_4003Text(view);
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return getAtomicSequence_2003Text(view);
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return getAlternativeBranch_2001Text(view);
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return getStandardNode_3003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStandardNode_3001Text(View view) {
		IParser parser = ComBE.diagram.providers.ComBEParserProvider.getParser(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3001, view.getElement() != null ? view.getElement() : view, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpecification_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEmptyNode_3006Text(View view) {
		IParser parser = ComBE.diagram.providers.ComBEParserProvider.getParser(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3006, view.getElement() != null ? view.getElement() : view, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmptyNode_3004Text(View view) {
		IParser parser = ComBE.diagram.providers.ComBEParserProvider.getParser(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3004, view.getElement() != null ? view.getElement() : view, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNodeLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAlternativeBranch_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getParallelBranchChildren_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStandardNode_3005Text(View view) {
		IParser parser = ComBE.diagram.providers.ComBEParserProvider.getParser(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3005, view.getElement() != null ? view.getElement() : view, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicSequenceChild_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStandardNode_3003Text(View view) {
		IParser parser = ComBE.diagram.providers.ComBEParserProvider.getParser(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3003, view.getElement() != null ? view.getElement() : view, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicSequence_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAlternativeBranchChildren_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEmptyNode_3002Text(View view) {
		IParser parser = ComBE.diagram.providers.ComBEParserProvider.getParser(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3002, view.getElement() != null ? view.getElement() : view, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNodeLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelBranch_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(ComBE.diagram.part.ComBEVisualIDRegistry.getModelID(view));
	}

}
