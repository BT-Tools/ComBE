package ComBE.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ComBE.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		ComBE.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		ComBE.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		ComBE.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		ComBE.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
