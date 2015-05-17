/**
 */
package Model.impl;

import Model.Aluno;
import Model.Exemplar;
import Model.Funcionario;
import Model.ModelFactory;
import Model.ModelPackage;
import Model.Professor;
import Model.Terminal;
import Model.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionarioEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__AdicionaExemplar() {
		return terminalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__RemoveExemplar() {
		return terminalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__AtualizaExemplar() {
		return terminalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__CadastraUsuario() {
		return terminalEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__RemoveUsuario() {
		return terminalEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__AtualizaUsuario() {
		return terminalEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__ConsultaUsuario() {
		return terminalEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__ConsultaExemplar() {
		return terminalEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__AplicaMulta() {
		return terminalEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__SuspendeUsuario() {
		return terminalEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Nome() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Codigo() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Autor() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Ano() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_StatusReserva() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_StatusBloqueio() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExemplar__ReservaExemplar() {
		return exemplarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExemplar__BloqueiaExemplar() {
		return exemplarEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExemplar__RetornaConsulta() {
		return exemplarEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExemplar__DesbloqueiaExemplar() {
		return exemplarEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExemplar__EmprestaExemplar() {
		return exemplarEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExemplar__DevolveExemplar() {
		return exemplarEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_PrimeiroNome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_UltimoNome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_DataNascimento() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Email() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cpf() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Telefone() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Endereco1() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Endereco2() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cidade() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Estado() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Pais() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cep() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__Reserva() {
		return usuarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__Empresta() {
		return usuarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__Devolve() {
		return usuarioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__RetornaConsulta() {
		return usuarioEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionario() {
		return funcionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		terminalEClass = createEClass(TERMINAL);
		createEOperation(terminalEClass, TERMINAL___ADICIONA_EXEMPLAR);
		createEOperation(terminalEClass, TERMINAL___REMOVE_EXEMPLAR);
		createEOperation(terminalEClass, TERMINAL___ATUALIZA_EXEMPLAR);
		createEOperation(terminalEClass, TERMINAL___CADASTRA_USUARIO);
		createEOperation(terminalEClass, TERMINAL___REMOVE_USUARIO);
		createEOperation(terminalEClass, TERMINAL___ATUALIZA_USUARIO);
		createEOperation(terminalEClass, TERMINAL___CONSULTA_USUARIO);
		createEOperation(terminalEClass, TERMINAL___CONSULTA_EXEMPLAR);
		createEOperation(terminalEClass, TERMINAL___APLICA_MULTA);
		createEOperation(terminalEClass, TERMINAL___SUSPENDE_USUARIO);

		exemplarEClass = createEClass(EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__NOME);
		createEAttribute(exemplarEClass, EXEMPLAR__CODIGO);
		createEAttribute(exemplarEClass, EXEMPLAR__AUTOR);
		createEAttribute(exemplarEClass, EXEMPLAR__ANO);
		createEAttribute(exemplarEClass, EXEMPLAR__STATUS_RESERVA);
		createEAttribute(exemplarEClass, EXEMPLAR__STATUS_BLOQUEIO);
		createEOperation(exemplarEClass, EXEMPLAR___RESERVA_EXEMPLAR);
		createEOperation(exemplarEClass, EXEMPLAR___BLOQUEIA_EXEMPLAR);
		createEOperation(exemplarEClass, EXEMPLAR___RETORNA_CONSULTA);
		createEOperation(exemplarEClass, EXEMPLAR___DESBLOQUEIA_EXEMPLAR);
		createEOperation(exemplarEClass, EXEMPLAR___EMPRESTA_EXEMPLAR);
		createEOperation(exemplarEClass, EXEMPLAR___DEVOLVE_EXEMPLAR);

		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__PRIMEIRO_NOME);
		createEAttribute(usuarioEClass, USUARIO__ULTIMO_NOME);
		createEAttribute(usuarioEClass, USUARIO__DATA_NASCIMENTO);
		createEAttribute(usuarioEClass, USUARIO__EMAIL);
		createEAttribute(usuarioEClass, USUARIO__CPF);
		createEAttribute(usuarioEClass, USUARIO__TELEFONE);
		createEAttribute(usuarioEClass, USUARIO__ENDERECO1);
		createEAttribute(usuarioEClass, USUARIO__ENDERECO2);
		createEAttribute(usuarioEClass, USUARIO__CIDADE);
		createEAttribute(usuarioEClass, USUARIO__ESTADO);
		createEAttribute(usuarioEClass, USUARIO__PAIS);
		createEAttribute(usuarioEClass, USUARIO__CEP);
		createEOperation(usuarioEClass, USUARIO___RESERVA);
		createEOperation(usuarioEClass, USUARIO___EMPRESTA);
		createEOperation(usuarioEClass, USUARIO___DEVOLVE);
		createEOperation(usuarioEClass, USUARIO___RETORNA_CONSULTA);

		alunoEClass = createEClass(ALUNO);

		professorEClass = createEClass(PROFESSOR);

		funcionarioEClass = createEClass(FUNCIONARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alunoEClass.getESuperTypes().add(this.getUsuario());
		professorEClass.getESuperTypes().add(this.getUsuario());
		funcionarioEClass.getESuperTypes().add(this.getUsuario());

		// Initialize classes, features, and operations; add parameters
		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTerminal__AdicionaExemplar(), null, "adicionaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__RemoveExemplar(), null, "removeExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__AtualizaExemplar(), null, "atualizaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__CadastraUsuario(), null, "cadastraUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__RemoveUsuario(), null, "removeUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__AtualizaUsuario(), null, "atualizaUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__ConsultaUsuario(), null, "consultaUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__ConsultaExemplar(), null, "consultaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__AplicaMulta(), null, "aplicaMulta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTerminal__SuspendeUsuario(), null, "suspendeUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExemplar_Nome(), theTypesPackage.getString(), "nome", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Codigo(), theTypesPackage.getString(), "codigo", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Autor(), theTypesPackage.getString(), "autor", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Ano(), theTypesPackage.getInteger(), "ano", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_StatusReserva(), theTypesPackage.getBoolean(), "statusReserva", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_StatusBloqueio(), theTypesPackage.getBoolean(), "statusBloqueio", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getExemplar__ReservaExemplar(), null, "reservaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExemplar__BloqueiaExemplar(), null, "bloqueiaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExemplar__RetornaConsulta(), null, "retornaConsulta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExemplar__DesbloqueiaExemplar(), null, "desbloqueiaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExemplar__EmprestaExemplar(), null, "emprestaExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExemplar__DevolveExemplar(), null, "devolveExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_PrimeiroNome(), theTypesPackage.getString(), "primeiroNome", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_UltimoNome(), theTypesPackage.getString(), "ultimoNome", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_DataNascimento(), theTypesPackage.getString(), "dataNascimento", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Email(), theTypesPackage.getString(), "email", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cpf(), theTypesPackage.getString(), "cpf", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Telefone(), theTypesPackage.getString(), "telefone", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Endereco1(), theTypesPackage.getString(), "endereco1", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Endereco2(), theTypesPackage.getString(), "endereco2", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cidade(), theTypesPackage.getString(), "cidade", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Estado(), theTypesPackage.getString(), "estado", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Pais(), theTypesPackage.getString(), "pais", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cep(), theTypesPackage.getString(), "cep", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUsuario__Reserva(), null, "reserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUsuario__Empresta(), null, "empresta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUsuario__Devolve(), null, "devolve", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUsuario__RetornaConsulta(), null, "retornaConsulta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(funcionarioEClass, Funcionario.class, "Funcionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
