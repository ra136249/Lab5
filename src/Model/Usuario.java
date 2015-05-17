/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Usuario#getPrimeiroNome <em>Primeiro Nome</em>}</li>
 *   <li>{@link Model.Usuario#getUltimoNome <em>Ultimo Nome</em>}</li>
 *   <li>{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link Model.Usuario#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.Usuario#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.Usuario#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link Model.Usuario#getEndereco1 <em>Endereco1</em>}</li>
 *   <li>{@link Model.Usuario#getEndereco2 <em>Endereco2</em>}</li>
 *   <li>{@link Model.Usuario#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.Usuario#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.Usuario#getPais <em>Pais</em>}</li>
 *   <li>{@link Model.Usuario#getCep <em>Cep</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Primeiro Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primeiro Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primeiro Nome</em>' attribute.
	 * @see #setPrimeiroNome(String)
	 * @see Model.ModelPackage#getUsuario_PrimeiroNome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPrimeiroNome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getPrimeiroNome <em>Primeiro Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primeiro Nome</em>' attribute.
	 * @see #getPrimeiroNome()
	 * @generated
	 */
	void setPrimeiroNome(String value);

	/**
	 * Returns the value of the '<em><b>Ultimo Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimo Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimo Nome</em>' attribute.
	 * @see #setUltimoNome(String)
	 * @see Model.ModelPackage#getUsuario_UltimoNome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUltimoNome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getUltimoNome <em>Ultimo Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimo Nome</em>' attribute.
	 * @see #getUltimoNome()
	 * @generated
	 */
	void setUltimoNome(String value);

	/**
	 * Returns the value of the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Nascimento</em>' attribute.
	 * @see #setDataNascimento(String)
	 * @see Model.ModelPackage#getUsuario_DataNascimento()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDataNascimento();

	/**
	 * Sets the value of the '{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Nascimento</em>' attribute.
	 * @see #getDataNascimento()
	 * @generated
	 */
	void setDataNascimento(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Model.ModelPackage#getUsuario_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(String)
	 * @see Model.ModelPackage#getUsuario_Cpf()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefone</em>' attribute.
	 * @see #setTelefone(String)
	 * @see Model.ModelPackage#getUsuario_Telefone()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTelefone();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTelefone <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefone</em>' attribute.
	 * @see #getTelefone()
	 * @generated
	 */
	void setTelefone(String value);

	/**
	 * Returns the value of the '<em><b>Endereco1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco1</em>' attribute.
	 * @see #setEndereco1(String)
	 * @see Model.ModelPackage#getUsuario_Endereco1()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndereco1();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEndereco1 <em>Endereco1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco1</em>' attribute.
	 * @see #getEndereco1()
	 * @generated
	 */
	void setEndereco1(String value);

	/**
	 * Returns the value of the '<em><b>Endereco2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco2</em>' attribute.
	 * @see #setEndereco2(String)
	 * @see Model.ModelPackage#getUsuario_Endereco2()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndereco2();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEndereco2 <em>Endereco2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco2</em>' attribute.
	 * @see #getEndereco2()
	 * @generated
	 */
	void setEndereco2(String value);

	/**
	 * Returns the value of the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidade</em>' attribute.
	 * @see #setCidade(String)
	 * @see Model.ModelPackage#getUsuario_Cidade()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCidade();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCidade <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidade</em>' attribute.
	 * @see #getCidade()
	 * @generated
	 */
	void setCidade(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see Model.ModelPackage#getUsuario_Estado()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see Model.ModelPackage#getUsuario_Pais()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link Model.Usuario#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

	/**
	 * Returns the value of the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cep</em>' attribute.
	 * @see #setCep(String)
	 * @see Model.ModelPackage#getUsuario_Cep()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCep();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCep <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cep</em>' attribute.
	 * @see #getCep()
	 * @generated
	 */
	void setCep(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reserva();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void empresta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void devolve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void retornaConsulta();

} // Usuario
