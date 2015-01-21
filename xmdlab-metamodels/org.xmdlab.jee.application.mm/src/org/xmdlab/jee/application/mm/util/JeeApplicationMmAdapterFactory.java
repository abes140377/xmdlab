/**
 */
package org.xmdlab.jee.application.mm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xmdlab.jee.application.mm.Application;
import org.xmdlab.jee.application.mm.Attribute;
import org.xmdlab.jee.application.mm.BasicType;
import org.xmdlab.jee.application.mm.CommandEvent;
import org.xmdlab.jee.application.mm.Consumer;
import org.xmdlab.jee.application.mm.DataTransferObject;
import org.xmdlab.jee.application.mm.DomainEvent;
import org.xmdlab.jee.application.mm.DomainObject;
import org.xmdlab.jee.application.mm.DomainObjectOperation;
import org.xmdlab.jee.application.mm.DomainObjectTypedElement;
import org.xmdlab.jee.application.mm.Entity;
import org.xmdlab.jee.application.mm.EnumConstructorParameter;
import org.xmdlab.jee.application.mm.EnumValue;
import org.xmdlab.jee.application.mm.Event;
import org.xmdlab.jee.application.mm.Inheritance;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;
import org.xmdlab.jee.application.mm.Module;
import org.xmdlab.jee.application.mm.NamedElement;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage
 * @generated
 */
public class JeeApplicationMmAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JeeApplicationMmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeeApplicationMmAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = JeeApplicationMmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeeApplicationMmSwitch<Adapter> modelSwitch =
		new JeeApplicationMmSwitch<Adapter>()
		{
			@Override
			public Adapter caseNamedElement(NamedElement object)
			{
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseApplication(Application object)
			{
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseService(Service object)
			{
				return createServiceAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object)
			{
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseDomainObject(DomainObject object)
			{
				return createDomainObjectAdapter();
			}
			@Override
			public Adapter caseReference(Reference object)
			{
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object)
			{
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseDomainObjectTypedElement(DomainObjectTypedElement object)
			{
				return createDomainObjectTypedElementAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object)
			{
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object)
			{
				return createOperationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object)
			{
				return createParameterAdapter();
			}
			@Override
			public Adapter caseRepositoryOperation(RepositoryOperation object)
			{
				return createRepositoryOperationAdapter();
			}
			@Override
			public Adapter caseServiceOperation(ServiceOperation object)
			{
				return createServiceOperationAdapter();
			}
			@Override
			public Adapter caseValueObject(ValueObject object)
			{
				return createValueObjectAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object)
			{
				return createEntityAdapter();
			}
			@Override
			public Adapter caseModule(Module object)
			{
				return createModuleAdapter();
			}
			@Override
			public Adapter caseBasicType(BasicType object)
			{
				return createBasicTypeAdapter();
			}
			@Override
			public Adapter caseConsumer(Consumer object)
			{
				return createConsumerAdapter();
			}
			@Override
			public Adapter caseEnum(org.xmdlab.jee.application.mm.Enum object)
			{
				return createEnumAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object)
			{
				return createEnumValueAdapter();
			}
			@Override
			public Adapter caseEnumConstructorParameter(EnumConstructorParameter object)
			{
				return createEnumConstructorParameterAdapter();
			}
			@Override
			public Adapter caseInheritance(Inheritance object)
			{
				return createInheritanceAdapter();
			}
			@Override
			public Adapter caseDataTransferObject(DataTransferObject object)
			{
				return createDataTransferObjectAdapter();
			}
			@Override
			public Adapter caseCommandEvent(CommandEvent object)
			{
				return createCommandEventAdapter();
			}
			@Override
			public Adapter caseDomainEvent(DomainEvent object)
			{
				return createDomainEventAdapter();
			}
			@Override
			public Adapter caseSubscribe(Subscribe object)
			{
				return createSubscribeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object)
			{
				return createEventAdapter();
			}
			@Override
			public Adapter casePublish(Publish object)
			{
				return createPublishAdapter();
			}
			@Override
			public Adapter caseTrait(Trait object)
			{
				return createTraitAdapter();
			}
			@Override
			public Adapter caseDomainObjectOperation(DomainObjectOperation object)
			{
				return createDomainObjectOperationAdapter();
			}
			@Override
			public Adapter caseResource(Resource object)
			{
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceOperation(ResourceOperation object)
			{
				return createResourceOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Service
	 * @generated
	 */
	public Adapter createServiceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.DomainObject
	 * @generated
	 */
	public Adapter createDomainObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement <em>Domain Object Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.DomainObjectTypedElement
	 * @generated
	 */
	public Adapter createDomainObjectTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.RepositoryOperation <em>Repository Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.RepositoryOperation
	 * @generated
	 */
	public Adapter createRepositoryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.ServiceOperation
	 * @generated
	 */
	public Adapter createServiceOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.ValueObject
	 * @generated
	 */
	public Adapter createValueObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Module
	 * @generated
	 */
	public Adapter createModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.BasicType
	 * @generated
	 */
	public Adapter createBasicTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Consumer
	 * @generated
	 */
	public Adapter createConsumerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.EnumConstructorParameter <em>Enum Constructor Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.EnumConstructorParameter
	 * @generated
	 */
	public Adapter createEnumConstructorParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.DataTransferObject <em>Data Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.DataTransferObject
	 * @generated
	 */
	public Adapter createDataTransferObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.CommandEvent
	 * @generated
	 */
	public Adapter createCommandEventAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.DomainEvent
	 * @generated
	 */
	public Adapter createDomainEventAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Subscribe
	 * @generated
	 */
	public Adapter createSubscribeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Event
	 * @generated
	 */
	public Adapter createEventAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Publish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Publish
	 * @generated
	 */
	public Adapter createPublishAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Trait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Trait
	 * @generated
	 */
	public Adapter createTraitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.DomainObjectOperation <em>Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.DomainObjectOperation
	 * @generated
	 */
	public Adapter createDomainObjectOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.xmdlab.jee.application.mm.ResourceOperation <em>Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xmdlab.jee.application.mm.ResourceOperation
	 * @generated
	 */
	public Adapter createResourceOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //JeeApplicationMmAdapterFactory
