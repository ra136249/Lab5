/**
 */
package Model.impl;

import Model.Aluno;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.AlunoImpl#getCurso <em>Curso</em>}</li>
 *   <li>{@link Model.impl.AlunoImpl#getRegistroAcademico <em>Registro Academico</em>}</li>
 *   <li>{@link Model.impl.AlunoImpl#isStatusSuspensao <em>Status Suspensao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlunoImpl extends UsuarioImpl implements Aluno {
	/**
	 * The default value of the '{@link #getCurso() <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurso()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurso() <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurso()
	 * @generated
	 * @ordered
	 */
	protected String curso = CURSO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistroAcademico() <em>Registro Academico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistroAcademico()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRO_ACADEMICO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistroAcademico() <em>Registro Academico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistroAcademico()
	 * @generated
	 * @ordered
	 */
	protected int registroAcademico = REGISTRO_ACADEMICO_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatusSuspensao() <em>Status Suspensao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusSuspensao()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_SUSPENSAO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatusSuspensao() <em>Status Suspensao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatusSuspensao()
	 * @generated
	 * @ordered
	 */
	protected boolean statusSuspensao = STATUS_SUSPENSAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlunoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALUNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurso(String newCurso) {
		String oldCurso = curso;
		curso = newCurso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__CURSO, oldCurso, curso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistroAcademico() {
		return registroAcademico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistroAcademico(int newRegistroAcademico) {
		int oldRegistroAcademico = registroAcademico;
		registroAcademico = newRegistroAcademico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__REGISTRO_ACADEMICO, oldRegistroAcademico, registroAcademico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatusSuspensao() {
		return statusSuspensao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusSuspensao(boolean newStatusSuspensao) {
		boolean oldStatusSuspensao = statusSuspensao;
		statusSuspensao = newStatusSuspensao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__STATUS_SUSPENSAO, oldStatusSuspensao, statusSuspensao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pagarMulta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALUNO__CURSO:
				return getCurso();
			case ModelPackage.ALUNO__REGISTRO_ACADEMICO:
				return getRegistroAcademico();
			case ModelPackage.ALUNO__STATUS_SUSPENSAO:
				return isStatusSuspensao();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ALUNO__CURSO:
				setCurso((String)newValue);
				return;
			case ModelPackage.ALUNO__REGISTRO_ACADEMICO:
				setRegistroAcademico((Integer)newValue);
				return;
			case ModelPackage.ALUNO__STATUS_SUSPENSAO:
				setStatusSuspensao((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ALUNO__CURSO:
				setCurso(CURSO_EDEFAULT);
				return;
			case ModelPackage.ALUNO__REGISTRO_ACADEMICO:
				setRegistroAcademico(REGISTRO_ACADEMICO_EDEFAULT);
				return;
			case ModelPackage.ALUNO__STATUS_SUSPENSAO:
				setStatusSuspensao(STATUS_SUSPENSAO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ALUNO__CURSO:
				return CURSO_EDEFAULT == null ? curso != null : !CURSO_EDEFAULT.equals(curso);
			case ModelPackage.ALUNO__REGISTRO_ACADEMICO:
				return registroAcademico != REGISTRO_ACADEMICO_EDEFAULT;
			case ModelPackage.ALUNO__STATUS_SUSPENSAO:
				return statusSuspensao != STATUS_SUSPENSAO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.ALUNO___PAGAR_MULTA:
				pagarMulta();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (curso: ");
		result.append(curso);
		result.append(", registroAcademico: ");
		result.append(registroAcademico);
		result.append(", statusSuspensao: ");
		result.append(statusSuspensao);
		result.append(')');
		return result.toString();
	}

} //AlunoImpl
