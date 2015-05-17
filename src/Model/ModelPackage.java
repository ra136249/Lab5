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
	 * The operation id for the '<em>Consulta Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CONSULTA_USUARIO = 6;

	/**
	 * The operation id for the '<em>Consulta Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CONSULTA_EXEMPLAR = 7;

	/**
	 * The operation id for the '<em>Aplica Multa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___APLICA_MULTA = 8;

	/**
	 * The operation id for the '<em>Suspende Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___SUSPENDE_USUARIO = 9;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 10;

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
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PRIMEIRO_NOME = 0;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ULTIMO_NOME = 1;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DATA_NASCIMENTO = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 4;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONE = 5;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO1 = 6;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO2 = 7;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CIDADE = 8;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ESTADO = 9;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PAIS = 10;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CEP = 11;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___RESERVA = 0;

	/**
	 * The operation id for the '<em>Empresta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___EMPRESTA = 1;

	/**
	 * The operation id for the '<em>Devolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___DEVOLVE = 2;

	/**
	 * The operation id for the '<em>Retorna Consulta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___RETORNA_CONSULTA = 3;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 4;

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
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PRIMEIRO_NOME = USUARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ULTIMO_NOME = USUARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO1 = USUARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO2 = USUARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Curso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CURSO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registro Academico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__REGISTRO_ACADEMICO = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__STATUS_SUSPENSAO = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___RESERVA = USUARIO___RESERVA;

	/**
	 * The operation id for the '<em>Empresta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___EMPRESTA = USUARIO___EMPRESTA;

	/**
	 * The operation id for the '<em>Devolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___DEVOLVE = USUARIO___DEVOLVE;

	/**
	 * The operation id for the '<em>Retorna Consulta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___RETORNA_CONSULTA = USUARIO___RETORNA_CONSULTA;

	/**
	 * The operation id for the '<em>Pagar Multa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___PAGAR_MULTA = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PRIMEIRO_NOME = USUARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ULTIMO_NOME = USUARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO1 = USUARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO2 = USUARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Unidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__UNIDADE = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registro Funcional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__REGISTRO_FUNCIONAL = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___RESERVA = USUARIO___RESERVA;

	/**
	 * The operation id for the '<em>Empresta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___EMPRESTA = USUARIO___EMPRESTA;

	/**
	 * The operation id for the '<em>Devolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DEVOLVE = USUARIO___DEVOLVE;

	/**
	 * The operation id for the '<em>Retorna Consulta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___RETORNA_CONSULTA = USUARIO___RETORNA_CONSULTA;

	/**
	 * The operation id for the '<em>Bloquear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desbloquear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DESBLOQUEAR = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 2;

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
	 * The feature id for the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__PRIMEIRO_NOME = USUARIO__PRIMEIRO_NOME;

	/**
	 * The feature id for the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ULTIMO_NOME = USUARIO__ULTIMO_NOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECO1 = USUARIO__ENDERECO1;

	/**
	 * The feature id for the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECO2 = USUARIO__ENDERECO2;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Unidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__UNIDADE = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registro Funcional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__REGISTRO_FUNCIONAL = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__STATUS_SUSPENSAO = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___RESERVA = USUARIO___RESERVA;

	/**
	 * The operation id for the '<em>Empresta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___EMPRESTA = USUARIO___EMPRESTA;

	/**
	 * The operation id for the '<em>Devolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___DEVOLVE = USUARIO___DEVOLVE;

	/**
	 * The operation id for the '<em>Retorna Consulta</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___RETORNA_CONSULTA = USUARIO___RETORNA_CONSULTA;

	/**
	 * The operation id for the '<em>Pagar Multa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___PAGAR_MULTA = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 1;


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
	 * Returns the meta object for the '{@link Model.Terminal#consultaUsuario() <em>Consulta Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Consulta Usuario</em>' operation.
	 * @see Model.Terminal#consultaUsuario()
	 * @generated
	 */
	EOperation getTerminal__ConsultaUsuario();

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
	 * Returns the meta object for the '{@link Model.Terminal#aplicaMulta() <em>Aplica Multa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aplica Multa</em>' operation.
	 * @see Model.Terminal#aplicaMulta()
	 * @generated
	 */
	EOperation getTerminal__AplicaMulta();

	/**
	 * Returns the meta object for the '{@link Model.Terminal#suspendeUsuario() <em>Suspende Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspende Usuario</em>' operation.
	 * @see Model.Terminal#suspendeUsuario()
	 * @generated
	 */
	EOperation getTerminal__SuspendeUsuario();

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
	 * Returns the meta object for the attribute '{@link Model.Usuario#getPrimeiroNome <em>Primeiro Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primeiro Nome</em>'.
	 * @see Model.Usuario#getPrimeiroNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_PrimeiroNome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getUltimoNome <em>Ultimo Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ultimo Nome</em>'.
	 * @see Model.Usuario#getUltimoNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_UltimoNome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Nascimento</em>'.
	 * @see Model.Usuario#getDataNascimento()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_DataNascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Model.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Model.Usuario#getCpf()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTelefone <em>Telefone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefone</em>'.
	 * @see Model.Usuario#getTelefone()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEndereco1 <em>Endereco1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco1</em>'.
	 * @see Model.Usuario#getEndereco1()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Endereco1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEndereco2 <em>Endereco2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco2</em>'.
	 * @see Model.Usuario#getEndereco2()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Endereco2();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCidade <em>Cidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidade</em>'.
	 * @see Model.Usuario#getCidade()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cidade();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Model.Usuario#getEstado()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Estado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see Model.Usuario#getPais()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Pais();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see Model.Usuario#getCep()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cep();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#reserva() <em>Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserva</em>' operation.
	 * @see Model.Usuario#reserva()
	 * @generated
	 */
	EOperation getUsuario__Reserva();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#empresta() <em>Empresta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Empresta</em>' operation.
	 * @see Model.Usuario#empresta()
	 * @generated
	 */
	EOperation getUsuario__Empresta();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#devolve() <em>Devolve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Devolve</em>' operation.
	 * @see Model.Usuario#devolve()
	 * @generated
	 */
	EOperation getUsuario__Devolve();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#retornaConsulta() <em>Retorna Consulta</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Retorna Consulta</em>' operation.
	 * @see Model.Usuario#retornaConsulta()
	 * @generated
	 */
	EOperation getUsuario__RetornaConsulta();

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
	 * Returns the meta object for the attribute '{@link Model.Aluno#getCurso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curso</em>'.
	 * @see Model.Aluno#getCurso()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_Curso();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#getRegistroAcademico <em>Registro Academico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registro Academico</em>'.
	 * @see Model.Aluno#getRegistroAcademico()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_RegistroAcademico();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#isStatusSuspensao <em>Status Suspensao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Suspensao</em>'.
	 * @see Model.Aluno#isStatusSuspensao()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_StatusSuspensao();

	/**
	 * Returns the meta object for the '{@link Model.Aluno#pagarMulta() <em>Pagar Multa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pagar Multa</em>' operation.
	 * @see Model.Aluno#pagarMulta()
	 * @generated
	 */
	EOperation getAluno__PagarMulta();

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
	 * Returns the meta object for the attribute '{@link Model.Professor#getUnidade <em>Unidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unidade</em>'.
	 * @see Model.Professor#getUnidade()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Unidade();

	/**
	 * Returns the meta object for the attribute '{@link Model.Professor#getRegistroFuncional <em>Registro Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registro Funcional</em>'.
	 * @see Model.Professor#getRegistroFuncional()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_RegistroFuncional();

	/**
	 * Returns the meta object for the '{@link Model.Professor#bloquear() <em>Bloquear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloquear</em>' operation.
	 * @see Model.Professor#bloquear()
	 * @generated
	 */
	EOperation getProfessor__Bloquear();

	/**
	 * Returns the meta object for the '{@link Model.Professor#desbloquear() <em>Desbloquear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desbloquear</em>' operation.
	 * @see Model.Professor#desbloquear()
	 * @generated
	 */
	EOperation getProfessor__Desbloquear();

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
	 * Returns the meta object for the attribute '{@link Model.Funcionario#getUnidade <em>Unidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unidade</em>'.
	 * @see Model.Funcionario#getUnidade()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_Unidade();

	/**
	 * Returns the meta object for the attribute '{@link Model.Funcionario#getRegistroFuncional <em>Registro Funcional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registro Funcional</em>'.
	 * @see Model.Funcionario#getRegistroFuncional()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_RegistroFuncional();

	/**
	 * Returns the meta object for the attribute '{@link Model.Funcionario#isStatusSuspensao <em>Status Suspensao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Suspensao</em>'.
	 * @see Model.Funcionario#isStatusSuspensao()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_StatusSuspensao();

	/**
	 * Returns the meta object for the '{@link Model.Funcionario#pagarMulta() <em>Pagar Multa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pagar Multa</em>' operation.
	 * @see Model.Funcionario#pagarMulta()
	 * @generated
	 */
	EOperation getFuncionario__PagarMulta();

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
		 * The meta object literal for the '<em><b>Consulta Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___CONSULTA_USUARIO = eINSTANCE.getTerminal__ConsultaUsuario();

		/**
		 * The meta object literal for the '<em><b>Consulta Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___CONSULTA_EXEMPLAR = eINSTANCE.getTerminal__ConsultaExemplar();

		/**
		 * The meta object literal for the '<em><b>Aplica Multa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___APLICA_MULTA = eINSTANCE.getTerminal__AplicaMulta();

		/**
		 * The meta object literal for the '<em><b>Suspende Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___SUSPENDE_USUARIO = eINSTANCE.getTerminal__SuspendeUsuario();

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
		 * The meta object literal for the '<em><b>Primeiro Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PRIMEIRO_NOME = eINSTANCE.getUsuario_PrimeiroNome();

		/**
		 * The meta object literal for the '<em><b>Ultimo Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ULTIMO_NOME = eINSTANCE.getUsuario_UltimoNome();

		/**
		 * The meta object literal for the '<em><b>Data Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DATA_NASCIMENTO = eINSTANCE.getUsuario_DataNascimento();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getUsuario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Telefone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONE = eINSTANCE.getUsuario_Telefone();

		/**
		 * The meta object literal for the '<em><b>Endereco1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO1 = eINSTANCE.getUsuario_Endereco1();

		/**
		 * The meta object literal for the '<em><b>Endereco2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO2 = eINSTANCE.getUsuario_Endereco2();

		/**
		 * The meta object literal for the '<em><b>Cidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CIDADE = eINSTANCE.getUsuario_Cidade();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ESTADO = eINSTANCE.getUsuario_Estado();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PAIS = eINSTANCE.getUsuario_Pais();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CEP = eINSTANCE.getUsuario_Cep();

		/**
		 * The meta object literal for the '<em><b>Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___RESERVA = eINSTANCE.getUsuario__Reserva();

		/**
		 * The meta object literal for the '<em><b>Empresta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___EMPRESTA = eINSTANCE.getUsuario__Empresta();

		/**
		 * The meta object literal for the '<em><b>Devolve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___DEVOLVE = eINSTANCE.getUsuario__Devolve();

		/**
		 * The meta object literal for the '<em><b>Retorna Consulta</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___RETORNA_CONSULTA = eINSTANCE.getUsuario__RetornaConsulta();

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
		 * The meta object literal for the '<em><b>Curso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__CURSO = eINSTANCE.getAluno_Curso();

		/**
		 * The meta object literal for the '<em><b>Registro Academico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__REGISTRO_ACADEMICO = eINSTANCE.getAluno_RegistroAcademico();

		/**
		 * The meta object literal for the '<em><b>Status Suspensao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__STATUS_SUSPENSAO = eINSTANCE.getAluno_StatusSuspensao();

		/**
		 * The meta object literal for the '<em><b>Pagar Multa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALUNO___PAGAR_MULTA = eINSTANCE.getAluno__PagarMulta();

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
		 * The meta object literal for the '<em><b>Unidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__UNIDADE = eINSTANCE.getProfessor_Unidade();

		/**
		 * The meta object literal for the '<em><b>Registro Funcional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__REGISTRO_FUNCIONAL = eINSTANCE.getProfessor_RegistroFuncional();

		/**
		 * The meta object literal for the '<em><b>Bloquear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEAR = eINSTANCE.getProfessor__Bloquear();

		/**
		 * The meta object literal for the '<em><b>Desbloquear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___DESBLOQUEAR = eINSTANCE.getProfessor__Desbloquear();

		/**
		 * The meta object literal for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FuncionarioImpl
		 * @see Model.impl.ModelPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

		/**
		 * The meta object literal for the '<em><b>Unidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__UNIDADE = eINSTANCE.getFuncionario_Unidade();

		/**
		 * The meta object literal for the '<em><b>Registro Funcional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__REGISTRO_FUNCIONAL = eINSTANCE.getFuncionario_RegistroFuncional();

		/**
		 * The meta object literal for the '<em><b>Status Suspensao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__STATUS_SUSPENSAO = eINSTANCE.getFuncionario_StatusSuspensao();

		/**
		 * The meta object literal for the '<em><b>Pagar Multa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCIONARIO___PAGAR_MULTA = eINSTANCE.getFuncionario__PagarMulta();

	}

} //ModelPackage
