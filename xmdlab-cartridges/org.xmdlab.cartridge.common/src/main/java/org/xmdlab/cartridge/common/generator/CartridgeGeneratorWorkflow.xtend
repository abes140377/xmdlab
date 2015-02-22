package org.xmdlab.cartridge.common.generator

import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.util.EmfFormatter
import org.eclipse.xtext.validation.AbstractValidationDiagnostic
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.Severity
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl

/**
 * 
 */
abstract class CartridgeGeneratorWorkflow {

	def boolean run(String modelURI)

	/**
	 * 
	 */
	def protected boolean validate(EObject eObject) {
		val appDiagnostic = Diagnostician.INSTANCE.validate(eObject)

		if (appDiagnostic.getSeverity() != Diagnostic.OK) {
			logDiagnostic(appDiagnostic)
			if (appDiagnostic.getSeverity() == Diagnostic.ERROR) {
				XmdlabGeneratorContext.addIssue(
					new XmdlabGeneratorIssueImpl(Severity.ERROR, "Validating  EObject '" + eObject + "' failed"))
				return false
			}
		}

		return true
	}

	/**
	 * 
	 */
	def protected void logDiagnostic(Diagnostic diagnostic) {
		val eObject = if (diagnostic instanceof AbstractValidationDiagnostic)
				(diagnostic).sourceEObject
			else
				null
		if (eObject != null) {
			val message = "Model validation error \"" + diagnostic.getMessage() + "\" at " +
				EmfFormatter.objPath(eObject)
			switch diagnostic.severity {
				case Diagnostic.ERROR:
					XmdlabGeneratorContext.addIssue(new XmdlabGeneratorIssueImpl(Severity.ERROR, message))
				case Diagnostic.WARNING:
					XmdlabGeneratorContext.addIssue(new XmdlabGeneratorIssueImpl(Severity.WARNING, message))
				default:
					XmdlabGeneratorContext.addIssue(new XmdlabGeneratorIssueImpl(Severity.INFO, message))
			}
		}
		if (diagnostic.getChildren() != null) {
			for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
				logDiagnostic(childDiagnostic)
			}
		}
	}
}
