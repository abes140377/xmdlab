/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getReferences <em>References</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getModule <em>Module</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#isOptimisticLocking <em>Optimistic Locking</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#isCache <em>Cache</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getDatabaseTable <em>Database Table</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getDiscriminatorColumnValue <em>Discriminator Column Value</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getBelongsToAggregate <em>Belongs To Aggregate</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObject#getTraits <em>Traits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface DomainObject extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Reference}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Reference#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_References()
	 * @see org.xmdlab.jee.application.mm.Reference#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DomainObject)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Extends()
	 * @model
	 * @generated
	 */
	DomainObject getExtends();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Repository#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(Repository)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Repository()
	 * @see org.xmdlab.jee.application.mm.Repository#getAggregateRoot
	 * @model opposite="aggregateRoot" containment="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Module#getDomainObjects <em>Domain Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Module()
	 * @see org.xmdlab.jee.application.mm.Module#getDomainObjects
	 * @model opposite="domainObjects" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Optimistic Locking</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimistic Locking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimistic Locking</em>' attribute.
	 * @see #setOptimisticLocking(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_OptimisticLocking()
	 * @model default="true"
	 * @generated
	 */
	boolean isOptimisticLocking();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#isOptimisticLocking <em>Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimistic Locking</em>' attribute.
	 * @see #isOptimisticLocking()
	 * @generated
	 */
	void setOptimisticLocking(boolean value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Cache()
	 * @model
	 * @generated
	 */
	boolean isCache();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#isCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #isCache()
	 * @generated
	 */
	void setCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table</em>' attribute.
	 * @see #setDatabaseTable(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_DatabaseTable()
	 * @model
	 * @generated
	 */
	String getDatabaseTable();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getDatabaseTable <em>Database Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table</em>' attribute.
	 * @see #getDatabaseTable()
	 * @generated
	 */
	void setDatabaseTable(String value);

	/**
	 * Returns the value of the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Name</em>' attribute.
	 * @see #setExtendsName(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_ExtendsName()
	 * @model
	 * @generated
	 */
	String getExtendsName();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getExtendsName <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Name</em>' attribute.
	 * @see #getExtendsName()
	 * @generated
	 */
	void setExtendsName(String value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Validate()
	 * @model
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gap Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' reference.
	 * @see #setInheritance(Inheritance)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Inheritance()
	 * @model
	 * @generated
	 */
	Inheritance getInheritance();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getInheritance <em>Inheritance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' reference.
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Column Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Value</em>' attribute.
	 * @see #setDiscriminatorColumnValue(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_DiscriminatorColumnValue()
	 * @model
	 * @generated
	 */
	String getDiscriminatorColumnValue();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getDiscriminatorColumnValue <em>Discriminator Column Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Value</em>' attribute.
	 * @see #getDiscriminatorColumnValue()
	 * @generated
	 */
	void setDiscriminatorColumnValue(String value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' attribute.
	 * @see #setAggregateRoot(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_AggregateRoot()
	 * @model default="true"
	 * @generated
	 */
	boolean isAggregateRoot();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#isAggregateRoot <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' attribute.
	 * @see #isAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Aggregate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Aggregate</em>' reference.
	 * @see #setBelongsToAggregate(DomainObject)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_BelongsToAggregate()
	 * @model
	 * @generated
	 */
	DomainObject getBelongsToAggregate();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObject#getBelongsToAggregate <em>Belongs To Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Aggregate</em>' reference.
	 * @see #getBelongsToAggregate()
	 * @generated
	 */
	void setBelongsToAggregate(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.DomainObjectOperation}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.DomainObjectOperation#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Operations()
	 * @see org.xmdlab.jee.application.mm.DomainObjectOperation#getDomainObject
	 * @model opposite="domainObject" containment="true"
	 * @generated
	 */
	EList<DomainObjectOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Traits</b></em>' reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Trait}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traits</em>' reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObject_Traits()
	 * @model
	 * @generated
	 */
	EList<Trait> getTraits();

} // DomainObject
