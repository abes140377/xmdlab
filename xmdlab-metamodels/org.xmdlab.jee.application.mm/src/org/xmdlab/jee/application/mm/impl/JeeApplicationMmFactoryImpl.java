/**
 */
package org.xmdlab.jee.application.mm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xmdlab.jee.application.mm.Application;
import org.xmdlab.jee.application.mm.Attribute;
import org.xmdlab.jee.application.mm.BasicType;
import org.xmdlab.jee.application.mm.CommandEvent;
import org.xmdlab.jee.application.mm.Consumer;
import org.xmdlab.jee.application.mm.DataTransferObject;
import org.xmdlab.jee.application.mm.DiscriminatorType;
import org.xmdlab.jee.application.mm.DomainEvent;
import org.xmdlab.jee.application.mm.DomainObjectOperation;
import org.xmdlab.jee.application.mm.DomainObjectTypedElement;
import org.xmdlab.jee.application.mm.Entity;
import org.xmdlab.jee.application.mm.EnumConstructorParameter;
import org.xmdlab.jee.application.mm.EnumValue;
import org.xmdlab.jee.application.mm.HttpMethod;
import org.xmdlab.jee.application.mm.Inheritance;
import org.xmdlab.jee.application.mm.InheritanceType;
import org.xmdlab.jee.application.mm.JeeApplicationMmFactory;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;
import org.xmdlab.jee.application.mm.Module;
import org.xmdlab.jee.application.mm.Operation;
import org.xmdlab.jee.application.mm.Parameter;
import org.xmdlab.jee.application.mm.Publish;
import org.xmdlab.jee.application.mm.Reference;
import org.xmdlab.jee.application.mm.Repository;
import org.xmdlab.jee.application.mm.RepositoryOperation;
import org.xmdlab.jee.application.mm.Resource;
import org.xmdlab.jee.application.mm.ResourceOperation;
import org.xmdlab.jee.application.mm.Service;
import org.xmdlab.jee.application.mm.ServiceOperation;
import org.xmdlab.jee.application.mm.Subscribe;
import org.xmdlab.jee.application.mm.Trait;
import org.xmdlab.jee.application.mm.TypedElement;
import org.xmdlab.jee.application.mm.ValueObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JeeApplicationMmFactoryImpl extends EFactoryImpl implements JeeApplicationMmFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JeeApplicationMmFactory init()
	{
		try
		{
			JeeApplicationMmFactory theJeeApplicationMmFactory = (JeeApplicationMmFactory)EPackage.Registry.INSTANCE.getEFactory(JeeApplicationMmPackage.eNS_URI);
			if (theJeeApplicationMmFactory != null)
			{
				return theJeeApplicationMmFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JeeApplicationMmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeeApplicationMmFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case JeeApplicationMmPackage.APPLICATION: return createApplication();
			case JeeApplicationMmPackage.SERVICE: return createService();
			case JeeApplicationMmPackage.REPOSITORY: return createRepository();
			case JeeApplicationMmPackage.REFERENCE: return createReference();
			case JeeApplicationMmPackage.TYPED_ELEMENT: return createTypedElement();
			case JeeApplicationMmPackage.DOMAIN_OBJECT_TYPED_ELEMENT: return createDomainObjectTypedElement();
			case JeeApplicationMmPackage.ATTRIBUTE: return createAttribute();
			case JeeApplicationMmPackage.OPERATION: return createOperation();
			case JeeApplicationMmPackage.PARAMETER: return createParameter();
			case JeeApplicationMmPackage.REPOSITORY_OPERATION: return createRepositoryOperation();
			case JeeApplicationMmPackage.SERVICE_OPERATION: return createServiceOperation();
			case JeeApplicationMmPackage.VALUE_OBJECT: return createValueObject();
			case JeeApplicationMmPackage.ENTITY: return createEntity();
			case JeeApplicationMmPackage.MODULE: return createModule();
			case JeeApplicationMmPackage.BASIC_TYPE: return createBasicType();
			case JeeApplicationMmPackage.CONSUMER: return createConsumer();
			case JeeApplicationMmPackage.ENUM: return createEnum();
			case JeeApplicationMmPackage.ENUM_VALUE: return createEnumValue();
			case JeeApplicationMmPackage.ENUM_CONSTRUCTOR_PARAMETER: return createEnumConstructorParameter();
			case JeeApplicationMmPackage.INHERITANCE: return createInheritance();
			case JeeApplicationMmPackage.DATA_TRANSFER_OBJECT: return createDataTransferObject();
			case JeeApplicationMmPackage.COMMAND_EVENT: return createCommandEvent();
			case JeeApplicationMmPackage.DOMAIN_EVENT: return createDomainEvent();
			case JeeApplicationMmPackage.SUBSCRIBE: return createSubscribe();
			case JeeApplicationMmPackage.PUBLISH: return createPublish();
			case JeeApplicationMmPackage.TRAIT: return createTrait();
			case JeeApplicationMmPackage.DOMAIN_OBJECT_OPERATION: return createDomainObjectOperation();
			case JeeApplicationMmPackage.RESOURCE: return createResource();
			case JeeApplicationMmPackage.RESOURCE_OPERATION: return createResourceOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case JeeApplicationMmPackage.INHERITANCE_TYPE:
				return createInheritanceTypeFromString(eDataType, initialValue);
			case JeeApplicationMmPackage.DISCRIMINATOR_TYPE:
				return createDiscriminatorTypeFromString(eDataType, initialValue);
			case JeeApplicationMmPackage.HTTP_METHOD:
				return createHttpMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case JeeApplicationMmPackage.INHERITANCE_TYPE:
				return convertInheritanceTypeToString(eDataType, instanceValue);
			case JeeApplicationMmPackage.DISCRIMINATOR_TYPE:
				return convertDiscriminatorTypeToString(eDataType, instanceValue);
			case JeeApplicationMmPackage.HTTP_METHOD:
				return convertHttpMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication()
	{
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService()
	{
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository()
	{
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference()
	{
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement()
	{
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectTypedElement createDomainObjectTypedElement()
	{
		DomainObjectTypedElementImpl domainObjectTypedElement = new DomainObjectTypedElementImpl();
		return domainObjectTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute()
	{
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation()
	{
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryOperation createRepositoryOperation()
	{
		RepositoryOperationImpl repositoryOperation = new RepositoryOperationImpl();
		return repositoryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation createServiceOperation()
	{
		ServiceOperationImpl serviceOperation = new ServiceOperationImpl();
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueObject createValueObject()
	{
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity()
	{
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule()
	{
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType createBasicType()
	{
		BasicTypeImpl basicType = new BasicTypeImpl();
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer createConsumer()
	{
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xmdlab.jee.application.mm.Enum createEnum()
	{
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue()
	{
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstructorParameter createEnumConstructorParameter()
	{
		EnumConstructorParameterImpl enumConstructorParameter = new EnumConstructorParameterImpl();
		return enumConstructorParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance()
	{
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransferObject createDataTransferObject()
	{
		DataTransferObjectImpl dataTransferObject = new DataTransferObjectImpl();
		return dataTransferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandEvent createCommandEvent()
	{
		CommandEventImpl commandEvent = new CommandEventImpl();
		return commandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEvent createDomainEvent()
	{
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe createSubscribe()
	{
		SubscribeImpl subscribe = new SubscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publish createPublish()
	{
		PublishImpl publish = new PublishImpl();
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trait createTrait()
	{
		TraitImpl trait = new TraitImpl();
		return trait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectOperation createDomainObjectOperation()
	{
		DomainObjectOperationImpl domainObjectOperation = new DomainObjectOperationImpl();
		return domainObjectOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource()
	{
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceOperation createResourceOperation()
	{
		ResourceOperationImpl resourceOperation = new ResourceOperationImpl();
		return resourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceType createInheritanceTypeFromString(EDataType eDataType, String initialValue)
	{
		InheritanceType result = InheritanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorType createDiscriminatorTypeFromString(EDataType eDataType, String initialValue)
	{
		DiscriminatorType result = DiscriminatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue)
	{
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeeApplicationMmPackage getJeeApplicationMmPackage()
	{
		return (JeeApplicationMmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JeeApplicationMmPackage getPackage()
	{
		return JeeApplicationMmPackage.eINSTANCE;
	}

} //JeeApplicationMmFactoryImpl
