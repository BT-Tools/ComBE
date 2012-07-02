package ComBE.provider;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import ComBE.Behavior;
import ComBE.BehaviorSeq;
import ComBE.ComBEPackage;
import ComBE.StandardNode;

/**
 * This is the item provider adapter for a {@link ComBE.StandardNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardNodeItemProvider extends NodeItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * @generated NOT: filter the set of Behavior a user can select in the properties view of a StandardNode. Only Behavior that is contained within the node's current Component will show up.
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_StandardNode_behavior_feature"), getString("_UI_PropertyDescriptor_description", "_UI_StandardNode_behavior_feature", "_UI_StandardNode_type"), ComBEPackage.Literals.STANDARD_NODE__BEHAVIOR, true, false, true, null, null, null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				StandardNode node = (StandardNode) object;
				
				if (node.getComponent() == null) {
					return Collections.emptyList();
				}
				else {
					EList<BehaviorSeq> behaviorSeqs = node.getComponent().getBehaviorseqs();
					EList<Behavior> result = new BasicEList<Behavior>();
					
					for (BehaviorSeq behaviorSeq : behaviorSeqs) {
						result.addAll(behaviorSeq.getBehavior());
					}
					
					return result;
				}
			}
		});
	}
}
