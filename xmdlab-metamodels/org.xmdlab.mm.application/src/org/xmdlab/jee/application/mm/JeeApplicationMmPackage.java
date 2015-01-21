/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmFactory
 * @model kind="package"
 * @generated
 */
public interface JeeApplicationMmPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xmdlab.org/applicationmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JeeApplicationMmPackage eINSTANCE = org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.NamedElementImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC = 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__HINT = 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ApplicationImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASE_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODULES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ServiceImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REPOSITORY_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OTHER_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__GAP_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__WEB_SERVICE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REMOTE_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LOCAL_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUBSCRIBE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.RepositoryImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__AGGREGATE_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OTHER_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GAP_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SUBSCRIBE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.DomainObjectImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__EXTENDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__REPOSITORY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OPTIMISTIC_LOCKING = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__CACHE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DATABASE_TABLE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__EXTENDS_NAME = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__VALIDATE = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__GAP_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__INHERITANCE = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__AGGREGATE_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__BELONGS_TO_AGGREGATE = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__TRAITS = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ReferenceImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MANY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__COLLECTION_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OPPOSITE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TO = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CASCADE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ORDER_BY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CHANGEABLE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FROM = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REQUIRED = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FETCH = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CACHE = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Natural Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NATURAL_KEY = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__INVERSE = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NULLABLE = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DATABASE_COLUMN = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VALIDATE = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TRANSIENT = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Database Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DATABASE_JOIN_TABLE = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Database Join Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DATABASE_JOIN_COLUMN = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.TypedElementImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__COLLECTION_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__MAP_KEY_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.DomainObjectTypedElementImpl <em>Domain Object Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.DomainObjectTypedElementImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainObjectTypedElement()
	 * @generated
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__DOC = TYPED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__HINT = TYPED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__COLLECTION_TYPE = TYPED_ELEMENT__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_TYPE = TYPED_ELEMENT__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Object Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Domain Object Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.AttributeImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DOC = TYPED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HINT = TYPED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLECTION_TYPE = TYPED_ELEMENT__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAP_KEY_TYPE = TYPED_ELEMENT__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHANGEABLE = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATABASE_TYPE = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NULLABLE = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Natural Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NATURAL_KEY = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LENGTH = TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INDEX = TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATABASE_COLUMN = TYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALIDATE = TYPED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TRANSIENT = TYPED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.OperationImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = DOMAIN_OBJECT_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOC = DOMAIN_OBJECT_TYPED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HINT = DOMAIN_OBJECT_TYPED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COLLECTION_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MAP_KEY_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOMAIN_OBJECT_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__THROWS = DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PUBLISH = DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ParameterImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = DOMAIN_OBJECT_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC = DOMAIN_OBJECT_TYPED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__HINT = DOMAIN_OBJECT_TYPED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLLECTION_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAP_KEY_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOMAIN_OBJECT_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAP_KEY_DOMAIN_OBJECT_TYPE = DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = DOMAIN_OBJECT_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = DOMAIN_OBJECT_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.RepositoryOperationImpl <em>Repository Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.RepositoryOperationImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getRepositoryOperation()
	 * @generated
	 */
	int REPOSITORY_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__DOC = OPERATION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__HINT = OPERATION__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__COLLECTION_TYPE = OPERATION__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__MAP_KEY_TYPE = OPERATION__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__DOMAIN_OBJECT_TYPE = OPERATION__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE = OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Delegate To Access Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__REPOSITORY = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__ACCESS_OBJECT_NAME = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repository Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repository Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ServiceOperationImpl <em>Service Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ServiceOperationImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getServiceOperation()
	 * @generated
	 */
	int SERVICE_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__DOC = OPERATION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__HINT = OPERATION__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__COLLECTION_TYPE = OPERATION__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__MAP_KEY_TYPE = OPERATION__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__DOMAIN_OBJECT_TYPE = OPERATION__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE = OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__DELEGATE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__SERVICE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__SERVICE_DELEGATE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ValueObjectImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__DOC = DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__HINT = DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__REFERENCES = DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ATTRIBUTES = DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__MODULE = DOMAIN_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__EXTENDS_NAME = DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__BELONGS_TO_AGGREGATE = DOMAIN_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__TRAITS = DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__IMMUTABLE = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__PERSISTENT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.EntityImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DOC = DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HINT = DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCES = DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MODULE = DOMAIN_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS_NAME = DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BELONGS_TO_AGGREGATE = DOMAIN_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TRAITS = DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUDITABLE = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ModuleImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BASE_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__APPLICATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DOMAIN_OBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONSUMERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXTERNAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PERSISTENCE_UNIT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RESOURCES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.BasicTypeImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__DOC = VALUE_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__HINT = VALUE_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__REFERENCES = VALUE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__EXTENDS = VALUE_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__ATTRIBUTES = VALUE_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__ABSTRACT = VALUE_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__REPOSITORY = VALUE_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__MODULE = VALUE_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__OPTIMISTIC_LOCKING = VALUE_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__CACHE = VALUE_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__PACKAGE = VALUE_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__DATABASE_TABLE = VALUE_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__EXTENDS_NAME = VALUE_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__VALIDATE = VALUE_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__GAP_CLASS = VALUE_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__INHERITANCE = VALUE_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__DISCRIMINATOR_COLUMN_VALUE = VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__BELONGS_TO_AGGREGATE = VALUE_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__OPERATIONS = VALUE_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TRAITS = VALUE_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__IMMUTABLE = VALUE_OBJECT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__PERSISTENT = VALUE_OBJECT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_OPERATION_COUNT = VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ConsumerImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__REPOSITORY_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SERVICE_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__CHANNEL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__MESSAGE_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__OTHER_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SUBSCRIBE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.EnumImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DOC = DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__HINT = DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__REFERENCES = DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ATTRIBUTES = DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MODULE = DOMAIN_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__EXTENDS_NAME = DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__BELONGS_TO_AGGREGATE = DOMAIN_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TRAITS = DOMAIN_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUES = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ORDINAL = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.EnumValueImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.EnumConstructorParameterImpl <em>Enum Constructor Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.EnumConstructorParameterImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEnumConstructorParameter()
	 * @generated
	 */
	int ENUM_CONSTRUCTOR_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRUCTOR_PARAMETER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Enum Constructor Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRUCTOR_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum Constructor Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRUCTOR_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.InheritanceImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 21;

	/**
	 * The feature id for the '<em><b>Discriminator Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISCRIMINATOR_COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Column Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISCRIMINATOR_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.DataTransferObjectImpl <em>Data Transfer Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.DataTransferObjectImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDataTransferObject()
	 * @generated
	 */
	int DATA_TRANSFER_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__DOC = VALUE_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__HINT = VALUE_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__REFERENCES = VALUE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__EXTENDS = VALUE_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__ATTRIBUTES = VALUE_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__ABSTRACT = VALUE_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__REPOSITORY = VALUE_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__MODULE = VALUE_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__OPTIMISTIC_LOCKING = VALUE_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__CACHE = VALUE_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__PACKAGE = VALUE_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__DATABASE_TABLE = VALUE_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__EXTENDS_NAME = VALUE_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__VALIDATE = VALUE_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__GAP_CLASS = VALUE_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__INHERITANCE = VALUE_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__DISCRIMINATOR_COLUMN_VALUE = VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__BELONGS_TO_AGGREGATE = VALUE_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__OPERATIONS = VALUE_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__TRAITS = VALUE_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__IMMUTABLE = VALUE_OBJECT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT__PERSISTENT = VALUE_OBJECT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Data Transfer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Transfer Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFER_OBJECT_OPERATION_COUNT = VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.EventImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOC = VALUE_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HINT = VALUE_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REFERENCES = VALUE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENDS = VALUE_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ATTRIBUTES = VALUE_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ABSTRACT = VALUE_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REPOSITORY = VALUE_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MODULE = VALUE_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPTIMISTIC_LOCKING = VALUE_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CACHE = VALUE_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PACKAGE = VALUE_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATABASE_TABLE = VALUE_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENDS_NAME = VALUE_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALIDATE = VALUE_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GAP_CLASS = VALUE_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INHERITANCE = VALUE_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DISCRIMINATOR_COLUMN_VALUE = VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BELONGS_TO_AGGREGATE = VALUE_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPERATIONS = VALUE_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRAITS = VALUE_OBJECT__TRAITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IMMUTABLE = VALUE_OBJECT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PERSISTENT = VALUE_OBJECT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = VALUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.CommandEventImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getCommandEvent()
	 * @generated
	 */
	int COMMAND_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__DOC = EVENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__HINT = EVENT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__REFERENCES = EVENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__EXTENDS = EVENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__ATTRIBUTES = EVENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__REPOSITORY = EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__MODULE = EVENT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__OPTIMISTIC_LOCKING = EVENT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__CACHE = EVENT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__PACKAGE = EVENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__DATABASE_TABLE = EVENT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__EXTENDS_NAME = EVENT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__VALIDATE = EVENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__GAP_CLASS = EVENT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__INHERITANCE = EVENT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__DISCRIMINATOR_COLUMN_VALUE = EVENT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__AGGREGATE_ROOT = EVENT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__BELONGS_TO_AGGREGATE = EVENT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__OPERATIONS = EVENT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__TRAITS = EVENT__TRAITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__IMMUTABLE = EVENT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__PERSISTENT = EVENT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.DomainEventImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__DOC = EVENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__HINT = EVENT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__REFERENCES = EVENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__EXTENDS = EVENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__ATTRIBUTES = EVENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__REPOSITORY = EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__MODULE = EVENT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OPTIMISTIC_LOCKING = EVENT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__CACHE = EVENT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__PACKAGE = EVENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__DATABASE_TABLE = EVENT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__EXTENDS_NAME = EVENT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__VALIDATE = EVENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__GAP_CLASS = EVENT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__INHERITANCE = EVENT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__DISCRIMINATOR_COLUMN_VALUE = EVENT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__AGGREGATE_ROOT = EVENT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__BELONGS_TO_AGGREGATE = EVENT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OPERATIONS = EVENT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__TRAITS = EVENT__TRAITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__IMMUTABLE = EVENT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__PERSISTENT = EVENT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.SubscribeImpl <em>Subscribe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.SubscribeImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getSubscribe()
	 * @generated
	 */
	int SUBSCRIBE = 25;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__EVENT_BUS = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__TOPIC = 1;

	/**
	 * The number of structural features of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.PublishImpl <em>Publish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.PublishImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getPublish()
	 * @generated
	 */
	int PUBLISH = 27;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__EVENT_BUS = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__EVENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.TraitImpl <em>Trait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.TraitImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getTrait()
	 * @generated
	 */
	int TRAIT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__DOC = DOMAIN_OBJECT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__HINT = DOMAIN_OBJECT__HINT;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__REFERENCES = DOMAIN_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__ATTRIBUTES = DOMAIN_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__MODULE = DOMAIN_OBJECT__MODULE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__EXTENDS_NAME = DOMAIN_OBJECT__EXTENDS_NAME;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__BELONGS_TO_AGGREGATE = DOMAIN_OBJECT__BELONGS_TO_AGGREGATE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Traits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT__TRAITS = DOMAIN_OBJECT__TRAITS;

	/**
	 * The number of structural features of the '<em>Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIT_OPERATION_COUNT = DOMAIN_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.DomainObjectOperationImpl <em>Domain Object Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.DomainObjectOperationImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainObjectOperation()
	 * @generated
	 */
	int DOMAIN_OBJECT_OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__DOC = OPERATION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__HINT = OPERATION__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__COLLECTION_TYPE = OPERATION__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__MAP_KEY_TYPE = OPERATION__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT_TYPE = OPERATION__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE = OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Domain Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__ABSTRACT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Object Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Domain Object Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ResourceImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOC = NAMED_ELEMENT__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HINT = NAMED_ELEMENT__HINT;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SERVICE_DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__GAP_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MODULE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl <em>Resource Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.impl.ResourceOperationImpl
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getResourceOperation()
	 * @generated
	 */
	int RESOURCE_OPERATION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__DOC = OPERATION__DOC;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__HINT = OPERATION__HINT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__COLLECTION_TYPE = OPERATION__COLLECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__MAP_KEY_TYPE = OPERATION__MAP_KEY_TYPE;

	/**
	 * The feature id for the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__DOMAIN_OBJECT_TYPE = OPERATION__DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE = OPERATION__MAP_KEY_DOMAIN_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__RESOURCE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__PATH = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__HTTP_METHOD = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__DELEGATE = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__RETURN_STRING = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.InheritanceType
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.DiscriminatorType
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDiscriminatorType()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.xmdlab.jee.application.mm.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdlab.jee.application.mm.HttpMethod
	 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 34;


	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.xmdlab.jee.application.mm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdlab.jee.application.mm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.NamedElement#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see org.xmdlab.jee.application.mm.NamedElement#getDoc()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Doc();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.NamedElement#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see org.xmdlab.jee.application.mm.NamedElement#getHint()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Hint();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.xmdlab.jee.application.mm.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Application#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.xmdlab.jee.application.mm.Application#getBasePackage()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_BasePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Application#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.xmdlab.jee.application.mm.Application#getModules()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Modules();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.xmdlab.jee.application.mm.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#getOperations()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Operations();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.Service#getRepositoryDependencies <em>Repository Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#getRepositoryDependencies()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RepositoryDependencies();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#getModule()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Module();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmdlab.jee.application.mm.Service#getOtherDependencies <em>Other Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#getOtherDependencies()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_OtherDependencies();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.Service#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#getServiceDependencies()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceDependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Service#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#isGapClass()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Service#isWebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Service</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#isWebService()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_WebService();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Service#isRemoteInterface <em>Remote Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Interface</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#isRemoteInterface()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_RemoteInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Service#isLocalInterface <em>Local Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Interface</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#isLocalInterface()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_LocalInterface();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Service#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscribe</em>'.
	 * @see org.xmdlab.jee.application.mm.Service#getSubscribe()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Subscribe();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Repository#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository#getOperations()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Operations();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.Repository#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate Root</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository#getAggregateRoot()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_AggregateRoot();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.Repository#getRepositoryDependencies <em>Repository Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository#getRepositoryDependencies()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_RepositoryDependencies();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmdlab.jee.application.mm.Repository#getOtherDependencies <em>Other Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository#getOtherDependencies()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_OtherDependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Repository#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository#isGapClass()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_GapClass();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Repository#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscribe</em>'.
	 * @see org.xmdlab.jee.application.mm.Repository#getSubscribe()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Subscribe();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.DomainObject#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getReferences()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_References();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.DomainObject#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getExtends()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.DomainObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getAttributes()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#isAbstract()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmdlab.jee.application.mm.DomainObject#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getRepository()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Repository();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.DomainObject#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getModule()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#isOptimisticLocking <em>Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Locking</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#isOptimisticLocking()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_OptimisticLocking();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#isCache()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Cache();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getPackage()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#getDatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getDatabaseTable()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_DatabaseTable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#getExtendsName <em>Extends Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends Name</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getExtendsName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_ExtendsName();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getValidate()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Validate();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#isGapClass()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_GapClass();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.DomainObject#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inheritance</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getInheritance()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Inheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#getDiscriminatorColumnValue <em>Discriminator Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column Value</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getDiscriminatorColumnValue()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_DiscriminatorColumnValue();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObject#isAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Root</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#isAggregateRoot()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_AggregateRoot();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.DomainObject#getBelongsToAggregate <em>Belongs To Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Aggregate</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getBelongsToAggregate()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_BelongsToAggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.DomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getOperations()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Operations();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.DomainObject#getTraits <em>Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traits</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObject#getTraits()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Traits();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isMany()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Many();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getCollectionType()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_CollectionType();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Reference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getOpposite()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Opposite();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Reference#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getTo()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_To();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getCascade()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getOrderBy()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getVisibility()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isChangeable()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Changeable();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.Reference#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getFrom()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_From();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isRequired()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getFetch()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isCache()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Cache();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isNaturalKey <em>Natural Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Natural Key</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isNaturalKey()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_NaturalKey();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isInverse()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isNullable()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getDatabaseColumn <em>Database Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Column</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getDatabaseColumn()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_DatabaseColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getValidate()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Validate();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#isTransient()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getDatabaseJoinTable <em>Database Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Join Table</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getDatabaseJoinTable()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_DatabaseJoinTable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Reference#getDatabaseJoinColumn <em>Database Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Join Column</em>'.
	 * @see org.xmdlab.jee.application.mm.Reference#getDatabaseJoinColumn()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_DatabaseJoinColumn();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.xmdlab.jee.application.mm.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xmdlab.jee.application.mm.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.TypedElement#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see org.xmdlab.jee.application.mm.TypedElement#getCollectionType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_CollectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.TypedElement#getMapKeyType <em>Map Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Type</em>'.
	 * @see org.xmdlab.jee.application.mm.TypedElement#getMapKeyType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_MapKeyType();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement <em>Domain Object Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Typed Element</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObjectTypedElement
	 * @generated
	 */
	EClass getDomainObjectTypedElement();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement#getDomainObjectType <em>Domain Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Type</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObjectTypedElement#getDomainObjectType()
	 * @see #getDomainObjectTypedElement()
	 * @generated
	 */
	EReference getDomainObjectTypedElement_DomainObjectType();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Key Domain Object Type</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObjectTypedElement#getMapKeyDomainObjectType()
	 * @see #getDomainObjectTypedElement()
	 * @generated
	 */
	EReference getDomainObjectTypedElement_MapKeyDomainObjectType();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#isChangeable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#getDatabaseType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#isNullable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#isNaturalKey <em>Natural Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Natural Key</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#isNaturalKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_NaturalKey();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#getLength()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#isIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#isIndex()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#getDatabaseColumn <em>Database Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Column</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#getDatabaseColumn()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DatabaseColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#getValidate()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Validate();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Attribute#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.xmdlab.jee.application.mm.Attribute#isTransient()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Transient();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.xmdlab.jee.application.mm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Operation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see org.xmdlab.jee.application.mm.Operation#getThrows()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Operation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.xmdlab.jee.application.mm.Operation#getVisibility()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.xmdlab.jee.application.mm.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Operation#getPublish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publish</em>'.
	 * @see org.xmdlab.jee.application.mm.Operation#getPublish()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Publish();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.xmdlab.jee.application.mm.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.RepositoryOperation <em>Repository Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Operation</em>'.
	 * @see org.xmdlab.jee.application.mm.RepositoryOperation
	 * @generated
	 */
	EClass getRepositoryOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.RepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate To Access Object</em>'.
	 * @see org.xmdlab.jee.application.mm.RepositoryOperation#isDelegateToAccessObject()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_DelegateToAccessObject();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.RepositoryOperation#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see org.xmdlab.jee.application.mm.RepositoryOperation#getRepository()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EReference getRepositoryOperation_Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.RepositoryOperation#getAccessObjectName <em>Access Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Object Name</em>'.
	 * @see org.xmdlab.jee.application.mm.RepositoryOperation#getAccessObjectName()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_AccessObjectName();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Operation</em>'.
	 * @see org.xmdlab.jee.application.mm.ServiceOperation
	 * @generated
	 */
	EClass getServiceOperation();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.ServiceOperation#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see org.xmdlab.jee.application.mm.ServiceOperation#getDelegate()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EReference getServiceOperation_Delegate();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.ServiceOperation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see org.xmdlab.jee.application.mm.ServiceOperation#getService()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EReference getServiceOperation_Service();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.ServiceOperation#getServiceDelegate <em>Service Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delegate</em>'.
	 * @see org.xmdlab.jee.application.mm.ServiceOperation#getServiceDelegate()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EReference getServiceOperation_ServiceDelegate();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see org.xmdlab.jee.application.mm.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.ValueObject#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see org.xmdlab.jee.application.mm.ValueObject#isImmutable()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Immutable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.ValueObject#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.xmdlab.jee.application.mm.ValueObject#isPersistent()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Persistent();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.xmdlab.jee.application.mm.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Entity#isAuditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auditable</em>'.
	 * @see org.xmdlab.jee.application.mm.Entity#isAuditable()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Auditable();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.xmdlab.jee.application.mm.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Module#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getBasePackage()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_BasePackage();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.Module#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getApplication()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Module#getDomainObjects <em>Domain Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Objects</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getDomainObjects()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_DomainObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Module#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumers</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getConsumers()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Consumers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getServices()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Services();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Module#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#isExternal()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_External();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Module#getPersistenceUnit <em>Persistence Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getPersistenceUnit()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_PersistenceUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Module#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.xmdlab.jee.application.mm.Module#getResources()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Resources();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see org.xmdlab.jee.application.mm.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.Consumer#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getModule()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Module();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.Consumer#getRepositoryDependencies <em>Repository Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getRepositoryDependencies()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_RepositoryDependencies();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.Consumer#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getServiceDependencies()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_ServiceDependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Consumer#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getChannel()
	 * @see #getConsumer()
	 * @generated
	 */
	EAttribute getConsumer_Channel();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Consumer#getMessageRoot <em>Message Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Root</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getMessageRoot()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_MessageRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmdlab.jee.application.mm.Consumer#getOtherDependencies <em>Other Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getOtherDependencies()
	 * @see #getConsumer()
	 * @generated
	 */
	EAttribute getConsumer_OtherDependencies();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Consumer#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscribe</em>'.
	 * @see org.xmdlab.jee.application.mm.Consumer#getSubscribe()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Subscribe();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.xmdlab.jee.application.mm.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Enum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.xmdlab.jee.application.mm.Enum#getValues()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Enum#isOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see org.xmdlab.jee.application.mm.Enum#isOrdinal()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Ordinal();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see org.xmdlab.jee.application.mm.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.EnumValue#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.xmdlab.jee.application.mm.EnumValue#getParameters()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Parameters();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.EnumConstructorParameter <em>Enum Constructor Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Constructor Parameter</em>'.
	 * @see org.xmdlab.jee.application.mm.EnumConstructorParameter
	 * @generated
	 */
	EClass getEnumConstructorParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.EnumConstructorParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xmdlab.jee.application.mm.EnumConstructorParameter#getValue()
	 * @see #getEnumConstructorParameter()
	 * @generated
	 */
	EAttribute getEnumConstructorParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.xmdlab.jee.application.mm.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column Name</em>'.
	 * @see org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnName()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_DiscriminatorColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column Length</em>'.
	 * @see org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnLength()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_DiscriminatorColumnLength();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Inheritance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xmdlab.jee.application.mm.Inheritance#getType()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorType()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_DiscriminatorType();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.DataTransferObject <em>Data Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfer Object</em>'.
	 * @see org.xmdlab.jee.application.mm.DataTransferObject
	 * @generated
	 */
	EClass getDataTransferObject();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Event</em>'.
	 * @see org.xmdlab.jee.application.mm.CommandEvent
	 * @generated
	 */
	EClass getCommandEvent();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe</em>'.
	 * @see org.xmdlab.jee.application.mm.Subscribe
	 * @generated
	 */
	EClass getSubscribe();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Subscribe#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see org.xmdlab.jee.application.mm.Subscribe#getEventBus()
	 * @see #getSubscribe()
	 * @generated
	 */
	EAttribute getSubscribe_EventBus();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Subscribe#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see org.xmdlab.jee.application.mm.Subscribe#getTopic()
	 * @see #getSubscribe()
	 * @generated
	 */
	EAttribute getSubscribe_Topic();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.xmdlab.jee.application.mm.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Publish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publish</em>'.
	 * @see org.xmdlab.jee.application.mm.Publish
	 * @generated
	 */
	EClass getPublish();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Publish#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see org.xmdlab.jee.application.mm.Publish#getEventBus()
	 * @see #getPublish()
	 * @generated
	 */
	EAttribute getPublish_EventBus();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Publish#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see org.xmdlab.jee.application.mm.Publish#getTopic()
	 * @see #getPublish()
	 * @generated
	 */
	EAttribute getPublish_Topic();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.Publish#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see org.xmdlab.jee.application.mm.Publish#getEventType()
	 * @see #getPublish()
	 * @generated
	 */
	EReference getPublish_EventType();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Trait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trait</em>'.
	 * @see org.xmdlab.jee.application.mm.Trait
	 * @generated
	 */
	EClass getTrait();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.DomainObjectOperation <em>Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Operation</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObjectOperation
	 * @generated
	 */
	EClass getDomainObjectOperation();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.DomainObjectOperation#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain Object</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObjectOperation#getDomainObject()
	 * @see #getDomainObjectOperation()
	 * @generated
	 */
	EReference getDomainObjectOperation_DomainObject();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.DomainObjectOperation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.xmdlab.jee.application.mm.DomainObjectOperation#isAbstract()
	 * @see #getDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDomainObjectOperation_Abstract();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.xmdlab.jee.application.mm.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdlab.jee.application.mm.Resource#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see org.xmdlab.jee.application.mm.Resource#getServiceDependencies()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ServiceDependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Resource#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see org.xmdlab.jee.application.mm.Resource#isGapClass()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.Resource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.xmdlab.jee.application.mm.Resource#getPath()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdlab.jee.application.mm.Resource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.xmdlab.jee.application.mm.Resource#getOperations()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Operations();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.Resource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see org.xmdlab.jee.application.mm.Resource#getModule()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Module();

	/**
	 * Returns the meta object for class '{@link org.xmdlab.jee.application.mm.ResourceOperation <em>Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Operation</em>'.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation
	 * @generated
	 */
	EClass getResourceOperation();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdlab.jee.application.mm.ResourceOperation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation#getResource()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EReference getResourceOperation_Resource();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.ResourceOperation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation#getPath()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EAttribute getResourceOperation_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.ResourceOperation#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation#getHttpMethod()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EAttribute getResourceOperation_HttpMethod();

	/**
	 * Returns the meta object for the reference '{@link org.xmdlab.jee.application.mm.ResourceOperation#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation#getDelegate()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EReference getResourceOperation_Delegate();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdlab.jee.application.mm.ResourceOperation#getReturnString <em>Return String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return String</em>'.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation#getReturnString()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EAttribute getResourceOperation_ReturnString();

	/**
	 * Returns the meta object for enum '{@link org.xmdlab.jee.application.mm.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see org.xmdlab.jee.application.mm.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link org.xmdlab.jee.application.mm.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see org.xmdlab.jee.application.mm.DiscriminatorType
	 * @generated
	 */
	EEnum getDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link org.xmdlab.jee.application.mm.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see org.xmdlab.jee.application.mm.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JeeApplicationMmFactory getJeeApplicationMmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.NamedElementImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DOC = eINSTANCE.getNamedElement_Doc();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__HINT = eINSTANCE.getNamedElement_Hint();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ApplicationImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__BASE_PACKAGE = eINSTANCE.getApplication_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MODULES = eINSTANCE.getApplication_Modules();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ServiceImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OPERATIONS = eINSTANCE.getService_Operations();

		/**
		 * The meta object literal for the '<em><b>Repository Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REPOSITORY_DEPENDENCIES = eINSTANCE.getService_RepositoryDependencies();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__MODULE = eINSTANCE.getService_Module();

		/**
		 * The meta object literal for the '<em><b>Other Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__OTHER_DEPENDENCIES = eINSTANCE.getService_OtherDependencies();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_DEPENDENCIES = eINSTANCE.getService_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__GAP_CLASS = eINSTANCE.getService_GapClass();

		/**
		 * The meta object literal for the '<em><b>Web Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__WEB_SERVICE = eINSTANCE.getService_WebService();

		/**
		 * The meta object literal for the '<em><b>Remote Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__REMOTE_INTERFACE = eINSTANCE.getService_RemoteInterface();

		/**
		 * The meta object literal for the '<em><b>Local Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__LOCAL_INTERFACE = eINSTANCE.getService_LocalInterface();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUBSCRIBE = eINSTANCE.getService_Subscribe();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.RepositoryImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__OPERATIONS = eINSTANCE.getRepository_Operations();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__AGGREGATE_ROOT = eINSTANCE.getRepository_AggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Repository Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__REPOSITORY_DEPENDENCIES = eINSTANCE.getRepository_RepositoryDependencies();

		/**
		 * The meta object literal for the '<em><b>Other Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OTHER_DEPENDENCIES = eINSTANCE.getRepository_OtherDependencies();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GAP_CLASS = eINSTANCE.getRepository_GapClass();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SUBSCRIBE = eINSTANCE.getRepository_Subscribe();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.DomainObjectImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__REFERENCES = eINSTANCE.getDomainObject_References();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__EXTENDS = eINSTANCE.getDomainObject_Extends();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__ATTRIBUTES = eINSTANCE.getDomainObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__ABSTRACT = eINSTANCE.getDomainObject_Abstract();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__REPOSITORY = eINSTANCE.getDomainObject_Repository();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__MODULE = eINSTANCE.getDomainObject_Module();

		/**
		 * The meta object literal for the '<em><b>Optimistic Locking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__OPTIMISTIC_LOCKING = eINSTANCE.getDomainObject_OptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__CACHE = eINSTANCE.getDomainObject_Cache();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__PACKAGE = eINSTANCE.getDomainObject_Package();

		/**
		 * The meta object literal for the '<em><b>Database Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__DATABASE_TABLE = eINSTANCE.getDomainObject_DatabaseTable();

		/**
		 * The meta object literal for the '<em><b>Extends Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__EXTENDS_NAME = eINSTANCE.getDomainObject_ExtendsName();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__VALIDATE = eINSTANCE.getDomainObject_Validate();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__GAP_CLASS = eINSTANCE.getDomainObject_GapClass();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__INHERITANCE = eINSTANCE.getDomainObject_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE = eINSTANCE.getDomainObject_DiscriminatorColumnValue();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__AGGREGATE_ROOT = eINSTANCE.getDomainObject_AggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Belongs To Aggregate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__BELONGS_TO_AGGREGATE = eINSTANCE.getDomainObject_BelongsToAggregate();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__OPERATIONS = eINSTANCE.getDomainObject_Operations();

		/**
		 * The meta object literal for the '<em><b>Traits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__TRAITS = eINSTANCE.getDomainObject_Traits();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ReferenceImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__MANY = eINSTANCE.getReference_Many();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__COLLECTION_TYPE = eINSTANCE.getReference_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TO = eINSTANCE.getReference_To();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__CASCADE = eINSTANCE.getReference_Cascade();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ORDER_BY = eINSTANCE.getReference_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__VISIBILITY = eINSTANCE.getReference_Visibility();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__CHANGEABLE = eINSTANCE.getReference_Changeable();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__FROM = eINSTANCE.getReference_From();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REQUIRED = eINSTANCE.getReference_Required();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__FETCH = eINSTANCE.getReference_Fetch();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__CACHE = eINSTANCE.getReference_Cache();

		/**
		 * The meta object literal for the '<em><b>Natural Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NATURAL_KEY = eINSTANCE.getReference_NaturalKey();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__INVERSE = eINSTANCE.getReference_Inverse();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NULLABLE = eINSTANCE.getReference_Nullable();

		/**
		 * The meta object literal for the '<em><b>Database Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__DATABASE_COLUMN = eINSTANCE.getReference_DatabaseColumn();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__VALIDATE = eINSTANCE.getReference_Validate();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__TRANSIENT = eINSTANCE.getReference_Transient();

		/**
		 * The meta object literal for the '<em><b>Database Join Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__DATABASE_JOIN_TABLE = eINSTANCE.getReference_DatabaseJoinTable();

		/**
		 * The meta object literal for the '<em><b>Database Join Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__DATABASE_JOIN_COLUMN = eINSTANCE.getReference_DatabaseJoinColumn();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.TypedElementImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__COLLECTION_TYPE = eINSTANCE.getTypedElement_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Map Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__MAP_KEY_TYPE = eINSTANCE.getTypedElement_MapKeyType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.DomainObjectTypedElementImpl <em>Domain Object Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.DomainObjectTypedElementImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainObjectTypedElement()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_TYPED_ELEMENT = eINSTANCE.getDomainObjectTypedElement();

		/**
		 * The meta object literal for the '<em><b>Domain Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_TYPED_ELEMENT__DOMAIN_OBJECT_TYPE = eINSTANCE.getDomainObjectTypedElement_DomainObjectType();

		/**
		 * The meta object literal for the '<em><b>Map Key Domain Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_TYPED_ELEMENT__MAP_KEY_DOMAIN_OBJECT_TYPE = eINSTANCE.getDomainObjectTypedElement_MapKeyDomainObjectType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.AttributeImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CHANGEABLE = eINSTANCE.getAttribute_Changeable();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATABASE_TYPE = eINSTANCE.getAttribute_DatabaseType();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NULLABLE = eINSTANCE.getAttribute_Nullable();

		/**
		 * The meta object literal for the '<em><b>Natural Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NATURAL_KEY = eINSTANCE.getAttribute_NaturalKey();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LENGTH = eINSTANCE.getAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__INDEX = eINSTANCE.getAttribute_Index();

		/**
		 * The meta object literal for the '<em><b>Database Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATABASE_COLUMN = eINSTANCE.getAttribute_DatabaseColumn();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALIDATE = eINSTANCE.getAttribute_Validate();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TRANSIENT = eINSTANCE.getAttribute_Transient();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.OperationImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__THROWS = eINSTANCE.getOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VISIBILITY = eINSTANCE.getOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PUBLISH = eINSTANCE.getOperation_Publish();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ParameterImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.RepositoryOperationImpl <em>Repository Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.RepositoryOperationImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getRepositoryOperation()
		 * @generated
		 */
		EClass REPOSITORY_OPERATION = eINSTANCE.getRepositoryOperation();

		/**
		 * The meta object literal for the '<em><b>Delegate To Access Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT = eINSTANCE.getRepositoryOperation_DelegateToAccessObject();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OPERATION__REPOSITORY = eINSTANCE.getRepositoryOperation_Repository();

		/**
		 * The meta object literal for the '<em><b>Access Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__ACCESS_OBJECT_NAME = eINSTANCE.getRepositoryOperation_AccessObjectName();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ServiceOperationImpl <em>Service Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ServiceOperationImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getServiceOperation()
		 * @generated
		 */
		EClass SERVICE_OPERATION = eINSTANCE.getServiceOperation();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION__DELEGATE = eINSTANCE.getServiceOperation_Delegate();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION__SERVICE = eINSTANCE.getServiceOperation_Service();

		/**
		 * The meta object literal for the '<em><b>Service Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION__SERVICE_DELEGATE = eINSTANCE.getServiceOperation_ServiceDelegate();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ValueObjectImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__IMMUTABLE = eINSTANCE.getValueObject_Immutable();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__PERSISTENT = eINSTANCE.getValueObject_Persistent();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.EntityImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__AUDITABLE = eINSTANCE.getEntity_Auditable();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ModuleImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__BASE_PACKAGE = eINSTANCE.getModule_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__APPLICATION = eINSTANCE.getModule_Application();

		/**
		 * The meta object literal for the '<em><b>Domain Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DOMAIN_OBJECTS = eINSTANCE.getModule_DomainObjects();

		/**
		 * The meta object literal for the '<em><b>Consumers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONSUMERS = eINSTANCE.getModule_Consumers();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SERVICES = eINSTANCE.getModule_Services();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__EXTERNAL = eINSTANCE.getModule_External();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PERSISTENCE_UNIT = eINSTANCE.getModule_PersistenceUnit();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RESOURCES = eINSTANCE.getModule_Resources();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.BasicTypeImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ConsumerImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__MODULE = eINSTANCE.getConsumer_Module();

		/**
		 * The meta object literal for the '<em><b>Repository Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__REPOSITORY_DEPENDENCIES = eINSTANCE.getConsumer_RepositoryDependencies();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__SERVICE_DEPENDENCIES = eINSTANCE.getConsumer_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER__CHANNEL = eINSTANCE.getConsumer_Channel();

		/**
		 * The meta object literal for the '<em><b>Message Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__MESSAGE_ROOT = eINSTANCE.getConsumer_MessageRoot();

		/**
		 * The meta object literal for the '<em><b>Other Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER__OTHER_DEPENDENCIES = eINSTANCE.getConsumer_OtherDependencies();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__SUBSCRIBE = eINSTANCE.getConsumer_Subscribe();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.EnumImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__VALUES = eINSTANCE.getEnum_Values();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__ORDINAL = eINSTANCE.getEnum_Ordinal();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.EnumValueImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__PARAMETERS = eINSTANCE.getEnumValue_Parameters();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.EnumConstructorParameterImpl <em>Enum Constructor Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.EnumConstructorParameterImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEnumConstructorParameter()
		 * @generated
		 */
		EClass ENUM_CONSTRUCTOR_PARAMETER = eINSTANCE.getEnumConstructorParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONSTRUCTOR_PARAMETER__VALUE = eINSTANCE.getEnumConstructorParameter_Value();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.InheritanceImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISCRIMINATOR_COLUMN_NAME = eINSTANCE.getInheritance_DiscriminatorColumnName();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH = eINSTANCE.getInheritance_DiscriminatorColumnLength();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__TYPE = eINSTANCE.getInheritance_Type();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISCRIMINATOR_TYPE = eINSTANCE.getInheritance_DiscriminatorType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.DataTransferObjectImpl <em>Data Transfer Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.DataTransferObjectImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDataTransferObject()
		 * @generated
		 */
		EClass DATA_TRANSFER_OBJECT = eINSTANCE.getDataTransferObject();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.CommandEventImpl <em>Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.CommandEventImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getCommandEvent()
		 * @generated
		 */
		EClass COMMAND_EVENT = eINSTANCE.getCommandEvent();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.DomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.DomainEventImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainEvent()
		 * @generated
		 */
		EClass DOMAIN_EVENT = eINSTANCE.getDomainEvent();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.SubscribeImpl <em>Subscribe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.SubscribeImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getSubscribe()
		 * @generated
		 */
		EClass SUBSCRIBE = eINSTANCE.getSubscribe();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__EVENT_BUS = eINSTANCE.getSubscribe_EventBus();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__TOPIC = eINSTANCE.getSubscribe_Topic();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.EventImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.PublishImpl <em>Publish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.PublishImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getPublish()
		 * @generated
		 */
		EClass PUBLISH = eINSTANCE.getPublish();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH__EVENT_BUS = eINSTANCE.getPublish_EventBus();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH__TOPIC = eINSTANCE.getPublish_Topic();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISH__EVENT_TYPE = eINSTANCE.getPublish_EventType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.TraitImpl <em>Trait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.TraitImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getTrait()
		 * @generated
		 */
		EClass TRAIT = eINSTANCE.getTrait();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.DomainObjectOperationImpl <em>Domain Object Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.DomainObjectOperationImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDomainObjectOperation()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_OPERATION = eINSTANCE.getDomainObjectOperation();

		/**
		 * The meta object literal for the '<em><b>Domain Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT = eINSTANCE.getDomainObjectOperation_DomainObject();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT_OPERATION__ABSTRACT = eINSTANCE.getDomainObjectOperation_Abstract();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ResourceImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SERVICE_DEPENDENCIES = eINSTANCE.getResource_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__GAP_CLASS = eINSTANCE.getResource_GapClass();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PATH = eINSTANCE.getResource_Path();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OPERATIONS = eINSTANCE.getResource_Operations();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MODULE = eINSTANCE.getResource_Module();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl <em>Resource Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.impl.ResourceOperationImpl
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getResourceOperation()
		 * @generated
		 */
		EClass RESOURCE_OPERATION = eINSTANCE.getResourceOperation();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_OPERATION__RESOURCE = eINSTANCE.getResourceOperation_Resource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OPERATION__PATH = eINSTANCE.getResourceOperation_Path();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OPERATION__HTTP_METHOD = eINSTANCE.getResourceOperation_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_OPERATION__DELEGATE = eINSTANCE.getResourceOperation_Delegate();

		/**
		 * The meta object literal for the '<em><b>Return String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OPERATION__RETURN_STRING = eINSTANCE.getResourceOperation_ReturnString();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.InheritanceType <em>Inheritance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.InheritanceType
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getInheritanceType()
		 * @generated
		 */
		EEnum INHERITANCE_TYPE = eINSTANCE.getInheritanceType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.DiscriminatorType <em>Discriminator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.DiscriminatorType
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getDiscriminatorType()
		 * @generated
		 */
		EEnum DISCRIMINATOR_TYPE = eINSTANCE.getDiscriminatorType();

		/**
		 * The meta object literal for the '{@link org.xmdlab.jee.application.mm.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdlab.jee.application.mm.HttpMethod
		 * @see org.xmdlab.jee.application.mm.impl.JeeApplicationMmPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //JeeApplicationMmPackage
