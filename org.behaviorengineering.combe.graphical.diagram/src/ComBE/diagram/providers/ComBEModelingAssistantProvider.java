package ComBE.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class ComBEModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ComBE.diagram.edit.parts.SpecificationEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001);
			types.add(ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002);
			types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequence_2003);
			return types;
		}
		if (editPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3001);
			types.add(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3002);
			return types;
		}
		if (editPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3003);
			types.add(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3004);
			return types;
		}
		if (editPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3005);
			types.add(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3006);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			return ((ComBE.diagram.edit.parts.AlternativeBranchEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			return ((ComBE.diagram.edit.parts.ParallelBranchEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			return ((ComBE.diagram.edit.parts.AtomicSequenceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			return ((ComBE.diagram.edit.parts.AlternativeBranchEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			return ((ComBE.diagram.edit.parts.ParallelBranchEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			return ((ComBE.diagram.edit.parts.AtomicSequenceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			return ((ComBE.diagram.edit.parts.AlternativeBranchEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			return ((ComBE.diagram.edit.parts.ParallelBranchEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			return ((ComBE.diagram.edit.parts.AtomicSequenceEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			return ((ComBE.diagram.edit.parts.AlternativeBranchEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			return ((ComBE.diagram.edit.parts.ParallelBranchEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			return ((ComBE.diagram.edit.parts.AtomicSequenceEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			return ((ComBE.diagram.edit.parts.AlternativeBranchEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			return ((ComBE.diagram.edit.parts.ParallelBranchEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			return ((ComBE.diagram.edit.parts.AtomicSequenceEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(ComBE.diagram.part.Messages.ComBEModelingAssistantProviderMessage);
		dialog.setTitle(ComBE.diagram.part.Messages.ComBEModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
