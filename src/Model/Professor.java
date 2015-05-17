/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Professor#getUnidade <em>Unidade</em>}</li>
 *   <li>{@link Model.Professor#getRegistroFuncional <em>Registro Funcional</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Usuario {
	/**
	 * Returns the value of the '<em><b>Unidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidade</em>' attribute.
	 * @see #setUnidade(String)
	 * @see Model.ModelPackage#getProfessor_Unidade()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUnidade();

	/**
	 * Sets the value of the '{@link Model.Professor#getUnidade <em>Unidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidade</em>' attribute.
	 * @see #getUnidade()
	 * @generated
	 */
	void setUnidade(String value);

	/**
	 * Returns the value of the '<em><b>Registro Funcional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registro Funcional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registro Funcional</em>' attribute.
	 * @see #setRegistroFuncional(int)
	 * @see Model.ModelPackage#getProfessor_RegistroFuncional()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegistroFuncional();

	/**
	 * Sets the value of the '{@link Model.Professor#getRegistroFuncional <em>Registro Funcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registro Funcional</em>' attribute.
	 * @see #getRegistroFuncional()
	 * @generated
	 */
	void setRegistroFuncional(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bloquear();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void desbloquear();

} // Professor
