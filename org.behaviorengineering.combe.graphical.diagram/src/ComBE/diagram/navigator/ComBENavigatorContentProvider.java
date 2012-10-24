package ComBE.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ComBENavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ComBENavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ComBE.diagram.navigator.ComBENavigatorItem> result = new ArrayList<ComBE.diagram.navigator.ComBENavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ComBE.diagram.navigator.ComBENavigatorGroup) {
			ComBE.diagram.navigator.ComBENavigatorGroup group = (ComBE.diagram.navigator.ComBENavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ComBE.diagram.navigator.ComBENavigatorItem) {
			ComBE.diagram.navigator.ComBENavigatorItem navigatorItem = (ComBE.diagram.navigator.ComBENavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {

		case ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ComBE.diagram.navigator.ComBENavigatorGroup target = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AlternativeBranchChildren_4001_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComBE.diagram.navigator.ComBENavigatorGroup source = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AlternativeBranchChildren_4001_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComBE.diagram.navigator.ComBENavigatorGroup incominglinks = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_ParallelBranch_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComBE.diagram.navigator.ComBENavigatorGroup outgoinglinks = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_ParallelBranch_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			ComBE.diagram.navigator.ComBENavigatorGroup links = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_Specification_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComBE.diagram.navigator.ComBENavigatorGroup incominglinks = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AlternativeBranch_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComBE.diagram.navigator.ComBENavigatorGroup outgoinglinks = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AlternativeBranch_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ComBE.diagram.navigator.ComBENavigatorGroup target = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_ParallelBranchChildren_4002_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComBE.diagram.navigator.ComBENavigatorGroup source = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_ParallelBranchChildren_4002_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ComBE.diagram.navigator.ComBENavigatorGroup target = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AtomicSequenceChild_4003_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComBE.diagram.navigator.ComBENavigatorGroup source = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AtomicSequenceChild_4003_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID: {
			LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem> result = new LinkedList<ComBE.diagram.navigator.ComBEAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComBE.diagram.navigator.ComBENavigatorGroup incominglinks = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AtomicSequence_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComBE.diagram.navigator.ComBENavigatorGroup outgoinglinks = new ComBE.diagram.navigator.ComBENavigatorGroup(ComBE.diagram.part.Messages.NavigatorGroupName_AtomicSequence_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv), ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(ComBE.diagram.part.ComBEVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ComBE.diagram.navigator.ComBENavigatorItem> createNavigatorItems(Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ComBE.diagram.navigator.ComBENavigatorItem> result = new ArrayList<ComBE.diagram.navigator.ComBENavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new ComBE.diagram.navigator.ComBENavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ComBE.diagram.navigator.ComBEAbstractNavigatorItem) {
			ComBE.diagram.navigator.ComBEAbstractNavigatorItem abstractNavigatorItem = (ComBE.diagram.navigator.ComBEAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
