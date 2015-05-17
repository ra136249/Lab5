/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Funcionario#getUnidade <em>Unidade</em>}</li>
 *   <li>{@link Model.Funcionario#getRegistroFuncional <em>Registro Funcional</em>}</li>
 *   <li>{@link Model.Funcionario#isStatusSuspensao <em>Status Suspensao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getFuncionario()
 * @model
 * @generated
 */
public interface Funcionario extends Usuario {
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
	 * @see Model.ModelPackage#getFuncionario_Unidade()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUnidade();

	/**
	 * Sets the value of the '{@link Model.Funcionario#getUnidade <em>Unidade</em>}' attribute.
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
	 * @see Model.ModelPackage#getFuncionario_RegistroFuncional()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegistroFuncional();

	/**
	 * Sets the value of the '{@link Model.Funcionario#getRegistroFuncional <em>Registro Funcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registro Funcional</em>' attribute.
	 * @see #getRegistroFuncional()
	 * @generated
	 */
	void setRegistroFuncional(int value);

	/**
	 * Returns the value of the '<em><b>Status Suspensao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Suspensao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Suspensao</em>' attribute.
	 * @see #setStatusSuspensao(boolean)
	 * @see Model.ModelPackage#getFuncionario_StatusSuspensao()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatusSuspensao();

	/**
	 * Sets the value of the '{@link Model.Funcionario#isStatusSuspensao <em>Status Suspensao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Suspensao</em>' attribute.
	 * @see #isStatusSuspensao()
	 * @generated
	 */
	void setStatusSuspensao(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pagarMulta();

} // Funcionario
