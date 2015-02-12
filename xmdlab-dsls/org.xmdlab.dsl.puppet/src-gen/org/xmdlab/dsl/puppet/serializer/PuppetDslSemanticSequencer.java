package org.xmdlab.dsl.puppet.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xmdlab.dsl.puppet.puppetDsl.DslForgeModule;
import org.xmdlab.dsl.puppet.puppetDsl.DslGitModule;
import org.xmdlab.dsl.puppet.puppetDsl.DslModel;
import org.xmdlab.dsl.puppet.puppetDsl.DslNode;
import org.xmdlab.dsl.puppet.puppetDsl.DslProfile;
import org.xmdlab.dsl.puppet.puppetDsl.DslRole;
import org.xmdlab.dsl.puppet.puppetDsl.PuppetDslPackage;
import org.xmdlab.dsl.puppet.services.PuppetDslGrammarAccess;

@SuppressWarnings("all")
public class PuppetDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PuppetDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PuppetDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PuppetDslPackage.DSL_FORGE_MODULE:
				if(context == grammarAccess.getDslForgeModuleRule()) {
					sequence_DslForgeModule(context, (DslForgeModule) semanticObject); 
					return; 
				}
				else break;
			case PuppetDslPackage.DSL_GIT_MODULE:
				if(context == grammarAccess.getDslGitModuleRule()) {
					sequence_DslGitModule(context, (DslGitModule) semanticObject); 
					return; 
				}
				else break;
			case PuppetDslPackage.DSL_MODEL:
				if(context == grammarAccess.getDslModelRule()) {
					sequence_DslModel(context, (DslModel) semanticObject); 
					return; 
				}
				else break;
			case PuppetDslPackage.DSL_NODE:
				if(context == grammarAccess.getDslNodeRule()) {
					sequence_DslNode(context, (DslNode) semanticObject); 
					return; 
				}
				else break;
			case PuppetDslPackage.DSL_PROFILE:
				if(context == grammarAccess.getDslProfileRule()) {
					sequence_DslProfile(context, (DslProfile) semanticObject); 
					return; 
				}
				else break;
			case PuppetDslPackage.DSL_ROLE:
				if(context == grammarAccess.getDslRoleRule()) {
					sequence_DslRole(context, (DslRole) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ForgeId version=Version?)
	 */
	protected void sequence_DslForgeModule(EObject context, DslForgeModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ForgeId git=STRING ref=STRING?)
	 */
	protected void sequence_DslGitModule(EObject context, DslGitModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     node=DslNode
	 */
	protected void sequence_DslModel(EObject context, DslModel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PuppetDslPackage.Literals.DSL_MODEL__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PuppetDslPackage.Literals.DSL_MODEL__NODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslModelAccess().getNodeDslNodeParserRuleCall_0(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID domain=QualifiedName role=DslRole)
	 */
	protected void sequence_DslNode(EObject context, DslNode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PuppetDslPackage.Literals.DSL_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PuppetDslPackage.Literals.DSL_NODE__NAME));
			if(transientValues.isValueTransient(semanticObject, PuppetDslPackage.Literals.DSL_NODE__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PuppetDslPackage.Literals.DSL_NODE__DOMAIN));
			if(transientValues.isValueTransient(semanticObject, PuppetDslPackage.Literals.DSL_NODE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PuppetDslPackage.Literals.DSL_NODE__ROLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDslNodeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDslNodeAccess().getDomainQualifiedNameParserRuleCall_4_0(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getDslNodeAccess().getRoleDslRoleParserRuleCall_6_0(), semanticObject.getRole());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (forgeModules+=DslForgeModule | gitModules+=DslGitModule)+)
	 */
	protected void sequence_DslProfile(EObject context, DslProfile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID profiles+=DslProfile+)
	 */
	protected void sequence_DslRole(EObject context, DslRole semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
