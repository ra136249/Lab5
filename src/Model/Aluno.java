/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Aluno#getCurso <em>Curso</em>}</li>
 *   <li>{@link Model.Aluno#getRegistroAcademico <em>Registro Academico</em>}</li>
 *   <li>{@link Model.Aluno#isStatusSuspensao <em>Status Suspensao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends Usuario {
	/**
	 * Returns the value of the '<em><b>Curso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curso</em>' attribute.
	 * @see #setCurso(String)
	 * @see Model.ModelPackage#getAluno_Curso()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCurso();

	/**
	 * Sets the value of the '{@link Model.Aluno#getCurso <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curso</em>' attribute.
	 * @see #getCurso()
	 * @generated
	 */
	void setCurso(String value);

	/**
	 * Returns the value of the '<em><b>Registro Academico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registro Academico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registro Academico</em>' attribute.
	 * @see #setRegistroAcademico(int)
	 * @see Model.ModelPackage#getAluno_RegistroAcademico()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegistroAcademico();

	/**
	 * Sets the value of the '{@link Model.Aluno#getRegistroAcademico <em>Registro Academico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registro Academico</em>' attribute.
	 * @see #getRegistroAcademico()
	 * @generated
	 */
	void setRegistroAcademico(int value);

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
	 * @see Model.ModelPackage#getAluno_StatusSuspensao()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatusSuspensao();

	/**
	 * Sets the value of the '{@link Model.Aluno#isStatusSuspensao <em>Status Suspensao</em>}' attribute.
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

} // Aluno
