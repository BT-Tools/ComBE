package ComBE.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ComBEPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ComBE.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createAlternativeBranch2CreationTool());
		paletteContainer.add(createParallelBranch3CreationTool());
		paletteContainer.add(createEmptyNode4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ComBE.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConnection1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createNode1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3001);
		types.add(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3003);
		types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequence_2003);
		types.add(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3005);
		NodeToolEntry entry = new NodeToolEntry(ComBE.diagram.part.Messages.Node1CreationTool_title, ComBE.diagram.part.Messages.Node1CreationTool_desc, types);
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComBE.diagram.providers.ComBEElementTypes.getImageDescriptor(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAlternativeBranch2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(ComBE.diagram.part.Messages.AlternativeBranch2CreationTool_title, ComBE.diagram.part.Messages.AlternativeBranch2CreationTool_desc, Collections.singletonList(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001));
		entry.setId("createAlternativeBranch2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComBE.diagram.providers.ComBEElementTypes.getImageDescriptor(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createParallelBranch3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(ComBE.diagram.part.Messages.ParallelBranch3CreationTool_title, ComBE.diagram.part.Messages.ParallelBranch3CreationTool_desc, Collections.singletonList(ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002));
		entry.setId("createParallelBranch3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComBE.diagram.providers.ComBEElementTypes.getImageDescriptor(ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEmptyNode4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3002);
		types.add(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3004);
		types.add(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3006);
		NodeToolEntry entry = new NodeToolEntry(ComBE.diagram.part.Messages.EmptyNode4CreationTool_title, ComBE.diagram.part.Messages.EmptyNode4CreationTool_desc, types);
		entry.setId("createEmptyNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComBE.diagram.providers.ComBEElementTypes.getImageDescriptor(ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001);
		types.add(ComBE.diagram.providers.ComBEElementTypes.ParallelBranchChildren_4002);
		types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003);
		LinkToolEntry entry = new LinkToolEntry(ComBE.diagram.part.Messages.Connection1CreationTool_title, ComBE.diagram.part.Messages.Connection1CreationTool_desc, types);
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComBE.diagram.providers.ComBEElementTypes.getImageDescriptor(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private static class NodeToolEntry extends ToolEntry {

		/**
		* @generated
		*/
		private final List<IElementType> elementTypes;

		/**
		* @generated
		*/
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		* @generated
		*/
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	* @generated
	*/
	private static class LinkToolEntry extends ToolEntry {

		/**
		* @generated
		*/
		private final List<IElementType> relationshipTypes;

		/**
		* @generated
		*/
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		* @generated
		*/
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
