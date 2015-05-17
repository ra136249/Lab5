/**
 */
package Model.impl;

import Model.Funcionario;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.FuncionarioImpl#getUnidade <em>Unidade</em>}</li>
 *   <li>{@link Model.impl.FuncionarioImpl#getRegistroFuncional <em>Registro Funcional</em>}</li>
 *   <li>{@link Model.impl.FuncionarioImpl#isStatusSuspensao <em>Status Suspensao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuncionarioImpl extends UsuarioImpl implements Funcionario {
	/**
	 * The default value of the '{@link #getUnidade() <em>Unidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidade()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnidade() <em>Unidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnidade()
	 * @generated
	 * @ordered
	 */
	protected String unidade = UNIDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistroFuncional() <em>Registro Funcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistroFuncional()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRO_FUNCIONAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistroFuncional() <em>Registro Funcional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistroFuncional()
	 * @generated
	 * @ordered
	 */
	protected int registroFuncional = REGISTRO_FUNCIONAL_EDEFAULT;

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
	protected FuncionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUNCIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnidade() {
		return unidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnidade(String newUnidade) {
		String oldUnidade = unidade;
		unidade = newUnidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUNCIONARIO__UNIDADE, oldUnidade, unidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistroFuncional() {
		return registroFuncional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistroFuncional(int newRegistroFuncional) {
		int oldRegistroFuncional = registroFuncional;
		registroFuncional = newRegistroFuncional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUNCIONARIO__REGISTRO_FUNCIONAL, oldRegistroFuncional, registroFuncional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUNCIONARIO__STATUS_SUSPENSAO, oldStatusSuspensao, statusSuspensao));
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
			case ModelPackage.FUNCIONARIO__UNIDADE:
				return getUnidade();
			case ModelPackage.FUNCIONARIO__REGISTRO_FUNCIONAL:
				return getRegistroFuncional();
			case ModelPackage.FUNCIONARIO__STATUS_SUSPENSAO:
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
			case ModelPackage.FUNCIONARIO__UNIDADE:
				setUnidade((String)newValue);
				return;
			case ModelPackage.FUNCIONARIO__REGISTRO_FUNCIONAL:
				setRegistroFuncional((Integer)newValue);
				return;
			case ModelPackage.FUNCIONARIO__STATUS_SUSPENSAO:
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
			case ModelPackage.FUNCIONARIO__UNIDADE:
				setUnidade(UNIDADE_EDEFAULT);
				return;
			case ModelPackage.FUNCIONARIO__REGISTRO_FUNCIONAL:
				setRegistroFuncional(REGISTRO_FUNCIONAL_EDEFAULT);
				return;
			case ModelPackage.FUNCIONARIO__STATUS_SUSPENSAO:
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
			case ModelPackage.FUNCIONARIO__UNIDADE:
				return UNIDADE_EDEFAULT == null ? unidade != null : !UNIDADE_EDEFAULT.equals(unidade);
			case ModelPackage.FUNCIONARIO__REGISTRO_FUNCIONAL:
				return registroFuncional != REGISTRO_FUNCIONAL_EDEFAULT;
			case ModelPackage.FUNCIONARIO__STATUS_SUSPENSAO:
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
			case ModelPackage.FUNCIONARIO___PAGAR_MULTA:
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
		result.append(" (unidade: ");
		result.append(unidade);
		result.append(", registroFuncional: ");
		result.append(registroFuncional);
		result.append(", statusSuspensao: ");
		result.append(statusSuspensao);
		result.append(')');
		return result.toString();
	}

} //FuncionarioImpl
