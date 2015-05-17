/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TerminalImpl
	 * @see Model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Adiciona Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___ADICIONA_EXEMPLAR = 0;

	/**
	 * The operation id for the '<em>Remove Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REMOVE_EXEMPLAR = 1;

	/**
	 * The operation id for the '<em>Atualiza Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___ATUALIZA_EXEMPLAR = 2;

	/**
	 * The operation id for the '<em>Cadastra Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CADASTRA_USUARIO = 3;

	/**
	 * The operation id for the '<em>Remove Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REMOVE_USUARIO = 4;

	/**
	 * The operation id for the '<em>Atualiza Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___ATUALIZA_USUARIO = 5;

	/**
	 * The operation id for the '<em>Status Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___STATUS_USUARIO = 6;

	/**
	 * The operation id for the '<em>Consulta Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CONSULTA_EXEMPLAR = 7;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExemplarImpl
	 * @see Model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__NOME = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__AUTOR = 2;

	/**
	 * The feature id for the '<em><b>Ano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__ANO = 3;

	/**
	 * The feature id for the '<em><b>Status Reserva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__STATUS_RESERVA = 4;

	/**
	 * The feature id for the '<em><b>Status Bloqueio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__STATUS_BLOQUEIO = 5;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Reserva Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___RESERVA_EXEMPLAR = 0;

	/**
	 * The operation id for the '<em>Bloqueia Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___BLOQUEIA_EXEMPLAR = 1;

	/**
	 * The operation id for the '<em>Retorna Consulta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___RETORNA_CONSULTA = 2;

	/**
	 * The operation id for the '<em>Desbloqueia Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___DESBLOQUEIA_EXEMPLAR = 3;

	/**
	 * The operation id for the '<em>Empresta Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___EMPRESTA_EXEMPLAR = 4;

	/**
	 * The operation id for the '<em>Devolve Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR___DEVOLVE_EXEMPLAR = 5;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.UsuarioImpl
	 * @see Model.impl.ModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 2;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AlunoImpl
	 * @see Model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 3;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ProfessorImpl
	 * @see Model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 4;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.FuncionarioImpl
	 * @see Model.impl.ModelPackageImpl#getFuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 5;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see Model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#adicionaExemplar() <em>Adiciona Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adiciona Exemplar</em>' operation.
	 * @see Model.Terminal#adicionaExemplar()
	 * @generated
	 */
	EOperation getTerminal__AdicionaExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#removeExemplar() <em>Remove Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Exemplar</em>' operation.
	 * @see Model.Terminal#removeExemplar()
	 * @generated
	 */
	EOperation getTerminal__RemoveExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#atualizaExemplar() <em>Atualiza Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualiza Exemplar</em>' operation.
	 * @see Model.Terminal#atualizaExemplar()
	 * @generated
	 */
	EOperation getTerminal__AtualizaExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#cadastraUsuario() <em>Cadastra Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cadastra Usuario</em>' operation.
	 * @see Model.Terminal#cadastraUsuario()
	 * @generated
	 */
	EOperation getTerminal__CadastraUsuario();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#removeUsuario() <em>Remove Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Usuario</em>' operation.
	 * @see Model.Terminal#removeUsuario()
	 * @generated
	 */
	EOperation getTerminal__RemoveUsuario();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#atualizaUsuario() <em>Atualiza Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualiza Usuario</em>' operation.
	 * @see Model.Terminal#atualizaUsuario()
	 * @generated
	 */
	EOperation getTerminal__AtualizaUsuario();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#statusUsuario() <em>Status Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Status Usuario</em>' operation.
	 * @see Model.Terminal#statusUsuario()
	 * @generated
	 */
	EOperation getTerminal__StatusUsuario();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#consultaExemplar() <em>Consulta Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Consulta Exemplar</em>' operation.
	 * @see Model.Terminal#consultaExemplar()
	 * @generated
	 */
	EOperation getTerminal__ConsultaExemplar();

	/**
	 * Returns the meta object for class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Exemplar#getNome()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see Model.Exemplar#getCodigo()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Model.Exemplar#getAutor()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getAno <em>Ano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ano</em>'.
	 * @see Model.Exemplar#getAno()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Ano();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isStatusReserva <em>Status Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Reserva</em>'.
	 * @see Model.Exemplar#isStatusReserva()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_StatusReserva();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isStatusBloqueio <em>Status Bloqueio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Bloqueio</em>'.
	 * @see Model.Exemplar#isStatusBloqueio()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_StatusBloqueio();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#reservaExemplar() <em>Reserva Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserva Exemplar</em>' operation.
	 * @see Model.Exemplar#reservaExemplar()
	 * @generated
	 */
	EOperation getExemplar__ReservaExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#bloqueiaExemplar() <em>Bloqueia Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloqueia Exemplar</em>' operation.
	 * @see Model.Exemplar#bloqueiaExemplar()
	 * @generated
	 */
	EOperation getExemplar__BloqueiaExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#retornaConsulta() <em>Retorna Consulta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retorna Consulta</em>' operation.
	 * @see Model.Exemplar#retornaConsulta()
	 * @generated
	 */
	EOperation getExemplar__RetornaConsulta();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#desbloqueiaExemplar() <em>Desbloqueia Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desbloqueia Exemplar</em>' operation.
	 * @see Model.Exemplar#desbloqueiaExemplar()
	 * @generated
	 */
	EOperation getExemplar__DesbloqueiaExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#emprestaExemplar() <em>Empresta Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Empresta Exemplar</em>' operation.
	 * @see Model.Exemplar#emprestaExemplar()
	 * @generated
	 */
	EOperation getExemplar__EmprestaExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Exemplar#devolveExemplar() <em>Devolve Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Devolve Exemplar</em>' operation.
	 * @see Model.Exemplar#devolveExemplar()
	 * @generated
	 */
	EOperation getExemplar__DevolveExemplar();

	/**
	 * Returns the meta object for class '{@link Model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see Model.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for class '{@link Model.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionario</em>'.
	 * @see Model.Funcionario
	 * @generated
	 */
	EClass getFuncionario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TerminalImpl
		 * @see Model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Adiciona Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___ADICIONA_EXEMPLAR = eINSTANCE.getTerminal__AdicionaExemplar();

		/**
		 * The meta object literal for the '<em><b>Remove Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___REMOVE_EXEMPLAR = eINSTANCE.getTerminal__RemoveExemplar();

		/**
		 * The meta object literal for the '<em><b>Atualiza Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___ATUALIZA_EXEMPLAR = eINSTANCE.getTerminal__AtualizaExemplar();

		/**
		 * The meta object literal for the '<em><b>Cadastra Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___CADASTRA_USUARIO = eINSTANCE.getTerminal__CadastraUsuario();

		/**
		 * The meta object literal for the '<em><b>Remove Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___REMOVE_USUARIO = eINSTANCE.getTerminal__RemoveUsuario();

		/**
		 * The meta object literal for the '<em><b>Atualiza Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___ATUALIZA_USUARIO = eINSTANCE.getTerminal__AtualizaUsuario();

		/**
		 * The meta object literal for the '<em><b>Status Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___STATUS_USUARIO = eINSTANCE.getTerminal__StatusUsuario();

		/**
		 * The meta object literal for the '<em><b>Consulta Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___CONSULTA_EXEMPLAR = eINSTANCE.getTerminal__ConsultaExemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExemplarImpl
		 * @see Model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__NOME = eINSTANCE.getExemplar_Nome();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__CODIGO = eINSTANCE.getExemplar_Codigo();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__AUTOR = eINSTANCE.getExemplar_Autor();

		/**
		 * The meta object literal for the '<em><b>Ano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__ANO = eINSTANCE.getExemplar_Ano();

		/**
		 * The meta object literal for the '<em><b>Status Reserva</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__STATUS_RESERVA = eINSTANCE.getExemplar_StatusReserva();

		/**
		 * The meta object literal for the '<em><b>Status Bloqueio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__STATUS_BLOQUEIO = eINSTANCE.getExemplar_StatusBloqueio();

		/**
		 * The meta object literal for the '<em><b>Reserva Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___RESERVA_EXEMPLAR = eINSTANCE.getExemplar__ReservaExemplar();

		/**
		 * The meta object literal for the '<em><b>Bloqueia Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___BLOQUEIA_EXEMPLAR = eINSTANCE.getExemplar__BloqueiaExemplar();

		/**
		 * The meta object literal for the '<em><b>Retorna Consulta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___RETORNA_CONSULTA = eINSTANCE.getExemplar__RetornaConsulta();

		/**
		 * The meta object literal for the '<em><b>Desbloqueia Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___DESBLOQUEIA_EXEMPLAR = eINSTANCE.getExemplar__DesbloqueiaExemplar();

		/**
		 * The meta object literal for the '<em><b>Empresta Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___EMPRESTA_EXEMPLAR = eINSTANCE.getExemplar__EmprestaExemplar();

		/**
		 * The meta object literal for the '<em><b>Devolve Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXEMPLAR___DEVOLVE_EXEMPLAR = eINSTANCE.getExemplar__DevolveExemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.UsuarioImpl
		 * @see Model.impl.ModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AlunoImpl
		 * @see Model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ProfessorImpl
		 * @see Model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FuncionarioImpl
		 * @see Model.impl.ModelPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

	}

} //ModelPackage
