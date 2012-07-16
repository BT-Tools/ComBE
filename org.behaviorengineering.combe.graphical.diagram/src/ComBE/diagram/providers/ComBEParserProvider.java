package ComBE.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ComBEParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5001Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5001Parser() {
		if (standardNodeLabel_5001Parser == null) {
			standardNodeLabel_5001Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5001Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5002Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5002Parser() {
		if (standardNodeLabel_5002Parser == null) {
			standardNodeLabel_5002Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5002Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5003Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5003Parser() {
		if (standardNodeLabel_5003Parser == null) {
			standardNodeLabel_5003Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeTracibilitystatus_5004Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeTracibilitystatus_5004Parser() {
		if (standardNodeTracibilitystatus_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getStandardNode_Tracibilitystatus() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeTracibilitystatus_5004Parser = parser;
		}
		return standardNodeTracibilitystatus_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeOperator_5005Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeOperator_5005Parser() {
		if (standardNodeOperator_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Operator() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeOperator_5005Parser = parser;
		}
		return standardNodeOperator_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeLabel_5006Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5006Parser() {
		if (standardNodeLabel_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Label() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeLabel_5006Parser = parser;
		}
		return standardNodeLabel_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser emptyNodeLabel_5021Parser;

	/**
	* @generated
	*/
	private IParser getEmptyNodeLabel_5021Parser() {
		if (emptyNodeLabel_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Label() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			emptyNodeLabel_5021Parser = parser;
		}
		return emptyNodeLabel_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser emptyNodeOperator_5022Parser;

	/**
	* @generated
	*/
	private IParser getEmptyNodeOperator_5022Parser() {
		if (emptyNodeOperator_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Operator() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			emptyNodeOperator_5022Parser = parser;
		}
		return emptyNodeOperator_5022Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5007Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5007Parser() {
		if (standardNodeLabel_5007Parser == null) {
			standardNodeLabel_5007Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5007Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5008Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5008Parser() {
		if (standardNodeLabel_5008Parser == null) {
			standardNodeLabel_5008Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5008Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5009Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5009Parser() {
		if (standardNodeLabel_5009Parser == null) {
			standardNodeLabel_5009Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeTracibilitystatus_5010Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeTracibilitystatus_5010Parser() {
		if (standardNodeTracibilitystatus_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getStandardNode_Tracibilitystatus() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeTracibilitystatus_5010Parser = parser;
		}
		return standardNodeTracibilitystatus_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeOperator_5011Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeOperator_5011Parser() {
		if (standardNodeOperator_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Operator() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeOperator_5011Parser = parser;
		}
		return standardNodeOperator_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeLabel_5012Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5012Parser() {
		if (standardNodeLabel_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Label() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeLabel_5012Parser = parser;
		}
		return standardNodeLabel_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser emptyNodeLabel_5023Parser;

	/**
	* @generated
	*/
	private IParser getEmptyNodeLabel_5023Parser() {
		if (emptyNodeLabel_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Label() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			emptyNodeLabel_5023Parser = parser;
		}
		return emptyNodeLabel_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser emptyNodeOperator_5024Parser;

	/**
	* @generated
	*/
	private IParser getEmptyNodeOperator_5024Parser() {
		if (emptyNodeOperator_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Operator() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			emptyNodeOperator_5024Parser = parser;
		}
		return emptyNodeOperator_5024Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5013Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5013Parser() {
		if (standardNodeLabel_5013Parser == null) {
			standardNodeLabel_5013Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5013Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5014Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5014Parser() {
		if (standardNodeLabel_5014Parser == null) {
			standardNodeLabel_5014Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5014Parser;
	}

	/**
	* @generated
	*/
	private ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser standardNodeLabel_5015Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5015Parser() {
		if (standardNodeLabel_5015Parser == null) {
			standardNodeLabel_5015Parser = new ComBE.diagram.parsers.StandardNodeLabelExpressionLabelParser();
		}
		return standardNodeLabel_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeTracibilitystatus_5016Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeTracibilitystatus_5016Parser() {
		if (standardNodeTracibilitystatus_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getStandardNode_Tracibilitystatus() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeTracibilitystatus_5016Parser = parser;
		}
		return standardNodeTracibilitystatus_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeOperator_5017Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeOperator_5017Parser() {
		if (standardNodeOperator_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Operator() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeOperator_5017Parser = parser;
		}
		return standardNodeOperator_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser standardNodeLabel_5018Parser;

	/**
	* @generated
	*/
	private IParser getStandardNodeLabel_5018Parser() {
		if (standardNodeLabel_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Label() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			standardNodeLabel_5018Parser = parser;
		}
		return standardNodeLabel_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser emptyNodeLabel_5019Parser;

	/**
	* @generated
	*/
	private IParser getEmptyNodeLabel_5019Parser() {
		if (emptyNodeLabel_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Label() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			emptyNodeLabel_5019Parser = parser;
		}
		return emptyNodeLabel_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser emptyNodeOperator_5020Parser;

	/**
	* @generated
	*/
	private IParser getEmptyNodeOperator_5020Parser() {
		if (emptyNodeOperator_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ComBE.ComBEPackage.eINSTANCE.getNode_Operator() };
			ComBE.diagram.parsers.MessageFormatParser parser = new ComBE.diagram.parsers.MessageFormatParser(features);
			emptyNodeOperator_5020Parser = parser;
		}
		return emptyNodeOperator_5020Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComBE.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
			return getStandardNodeLabel_5001Parser();
		case ComBE.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
			return getStandardNodeLabel_5002Parser();
		case ComBE.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
			return getStandardNodeLabel_5003Parser();
		case ComBE.diagram.edit.parts.StandardNodeTracibilitystatusEditPart.VISUAL_ID:
			return getStandardNodeTracibilitystatus_5004Parser();
		case ComBE.diagram.edit.parts.StandardNodeOperatorEditPart.VISUAL_ID:
			return getStandardNodeOperator_5005Parser();
		case ComBE.diagram.edit.parts.StandardNodeLabelEditPart.VISUAL_ID:
			return getStandardNodeLabel_5006Parser();
		case ComBE.diagram.edit.parts.EmptyNodeLabel2EditPart.VISUAL_ID:
			return getEmptyNodeLabel_5021Parser();
		case ComBE.diagram.edit.parts.EmptyNodeOperator2EditPart.VISUAL_ID:
			return getEmptyNodeOperator_5022Parser();
		case ComBE.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
			return getStandardNodeLabel_5007Parser();
		case ComBE.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
			return getStandardNodeLabel_5008Parser();
		case ComBE.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
			return getStandardNodeLabel_5009Parser();
		case ComBE.diagram.edit.parts.StandardNodeTracibilitystatus2EditPart.VISUAL_ID:
			return getStandardNodeTracibilitystatus_5010Parser();
		case ComBE.diagram.edit.parts.StandardNodeOperator2EditPart.VISUAL_ID:
			return getStandardNodeOperator_5011Parser();
		case ComBE.diagram.edit.parts.StandardNodeLabel2EditPart.VISUAL_ID:
			return getStandardNodeLabel_5012Parser();
		case ComBE.diagram.edit.parts.EmptyNodeLabel3EditPart.VISUAL_ID:
			return getEmptyNodeLabel_5023Parser();
		case ComBE.diagram.edit.parts.EmptyNodeOperator3EditPart.VISUAL_ID:
			return getEmptyNodeOperator_5024Parser();
		case ComBE.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
			return getStandardNodeLabel_5013Parser();
		case ComBE.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
			return getStandardNodeLabel_5014Parser();
		case ComBE.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
			return getStandardNodeLabel_5015Parser();
		case ComBE.diagram.edit.parts.StandardNodeTracibilitystatus3EditPart.VISUAL_ID:
			return getStandardNodeTracibilitystatus_5016Parser();
		case ComBE.diagram.edit.parts.StandardNodeOperator3EditPart.VISUAL_ID:
			return getStandardNodeOperator_5017Parser();
		case ComBE.diagram.edit.parts.StandardNodeLabel3EditPart.VISUAL_ID:
			return getStandardNodeLabel_5018Parser();
		case ComBE.diagram.edit.parts.EmptyNodeLabelEditPart.VISUAL_ID:
			return getEmptyNodeLabel_5019Parser();
		case ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart.VISUAL_ID:
			return getEmptyNodeOperator_5020Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComBE.diagram.providers.ComBEElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
